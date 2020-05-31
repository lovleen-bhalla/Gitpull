package bytehack.xyz.gitpull;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.PopupMenu;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import bytehack.xyz.gitpull.presenters.PullRequestsActivityPresenter;
import bytehack.xyz.gitpull.workers.Worker;

public class PullRequestActivity extends BaseActivity {

    PullRequestsActivityPresenter presenter;

    PRListAdapter adapter = new PRListAdapter();

    Worker worker = new ServiceWorker("PullRequestActivity");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.list_pull_requests);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        recyclerView.setAdapter(adapter);
        recyclerView.addOnScrollListener(scrollListener);
        presenter = new PullRequestsActivityPresenterImpl(worker, new PullRequestListViewImpl(adapter));
        setUpMenu();
    }

    public void setUpMenu() {
        FrameLayout menuLayout = findViewById(R.id.layout_menu);
        menuLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popup = new PopupMenu(PullRequestActivity.this, v);
                for (int i = 0; i < PullRequestsActivityPresenterImpl.MENU.length; i++) {
                    popup.getMenu().add(0, i, 0, PullRequestsActivityPresenterImpl.MENU[i]);
                }
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        int id = item.getItemId();
                        presenter.filter(id);
                        return true;
                    }
                });
                popup.show();
            }
        });
    }

    @Override
    public void onStart() {
        super.onStart();
        worker.createWorker();
        presenter.onStart();
    }

    @Override
    public void onStop() {
        super.onStop();
        worker.destroy();
        presenter.onStop();
    }

    RecyclerView.OnScrollListener scrollListener = new RecyclerView.OnScrollListener() {
        @Override
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
            super.onScrollStateChanged(recyclerView, newState);
        }

        @Override
        public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
            super.onScrolled(recyclerView, dx, dy);
            int visibleItemCount = recyclerView.getLayoutManager().getChildCount();
            int totalItemCount = recyclerView.getLayoutManager().getItemCount();
            int firstVisibleItemPosition = ((LinearLayoutManager) recyclerView.getLayoutManager()).findFirstVisibleItemPosition();
            if (!presenter.isLoading()  && (visibleItemCount + firstVisibleItemPosition) >= totalItemCount
                        && firstVisibleItemPosition >= 0) {
                    presenter.loadNext();
                }

        }
    };
}
