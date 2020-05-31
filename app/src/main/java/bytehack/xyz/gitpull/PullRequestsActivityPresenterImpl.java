package bytehack.xyz.gitpull;

import android.text.TextUtils;
import android.util.Log;

import bytehack.xyz.gitpull.models.PullRequests;
import bytehack.xyz.gitpull.presenters.BaseActivityPresenter;
import bytehack.xyz.gitpull.presenters.PullRequestsActivityPresenter;
import bytehack.xyz.gitpull.repository.PullRequestsRepository;
import bytehack.xyz.gitpull.repository.PullRequestsRepositoryImpl;
import bytehack.xyz.gitpull.views.PullRequestListView;
import bytehack.xyz.gitpull.workers.Task;
import bytehack.xyz.gitpull.workers.Worker;

public class PullRequestsActivityPresenterImpl extends BaseActivityPresenter
        implements PullRequestsActivityPresenter {

    public static final String[] MENU = new String[]{"Open", "Closed", "All"};

    private Worker mWorker;

    private PullRequestsRepository repository = new PullRequestsRepositoryImpl();

    private PullRequestListView mListView;

    private String owner = "golang";
    private String repo = "go";
    private String state = "open";

    private String nextPageUrl = "";

    public PullRequestsActivityPresenterImpl(Worker worker, PullRequestListView mListView) {
        this.mWorker = worker;
        this.mListView = mListView;
        refreshList();
    }

    @Override
    public void refreshList() {
        mListView.setLoading(true);
        mWorker.addTask(refreshListTask);
    }

    @Override
    public void filter(int id) {
        String state = MENU[id];
        if (!this.state.equals(state.toLowerCase())) {
            this.state = state.toLowerCase();
            mListView.clear();
            refreshList();
        }
    }

    @Override
    public void loadNext() {
        Log.d("TAG", "loadNext: " + nextPageUrl);
        if (TextUtils.isEmpty(nextPageUrl)) {
            return;
        }
        if (mListView.isLoading()) {
            return;
        }
        mListView.setLoading(true);
        mWorker.addTask(getNextPageTask);
    }

    @Override
    public boolean isLoading() {
        return mListView.isLoading();
    }

    private Task<PullRequests> refreshListTask = new Task<PullRequests>() {
        @Override
        public PullRequests execute() {
            return repository.getPullRequests(owner, repo, state);
        }

        @Override
        public void onComplete(PullRequests pullRequests) {
            mListView.setLoading(false);
            mListView.setDataList(pullRequests.getPullRequestModels());
            nextPageUrl = pullRequests.getNextPageUrl();
        }
    };

    private Task<PullRequests> getNextPageTask = new Task<PullRequests>() {

        @Override
        public PullRequests execute() {
            return repository.getNextPage(nextPageUrl);
        }

        @Override
        public void onComplete(PullRequests pullRequests) {
            mListView.setLoading(false);
            mListView.addItems(pullRequests.getPullRequestModels());
            nextPageUrl = pullRequests.getNextPageUrl();
        }
    };
}
