package bytehack.xyz.gitpull;

import java.util.List;

import bytehack.xyz.gitpull.models.PullRequestModel;
import bytehack.xyz.gitpull.views.PullRequestListView;

public class PullRequestListViewImpl implements PullRequestListView {

    PRListAdapter mAdapter;

    boolean isLoading = false;

    public PullRequestListViewImpl(PRListAdapter mAdapter) {
        this.mAdapter = mAdapter;
    }


    @Override
    public void addItems(List<PullRequestModel> dataList) {
        mAdapter.addItems(dataList);
    }

    @Override
    public void setDataList(List<PullRequestModel> dataList) {
        mAdapter.setDataList(dataList);
    }

    @Override
    public void clear() {
        mAdapter.clear();
    }

    @Override
    public boolean isLoading() {
        return isLoading;
    }

    @Override
    public void setLoading(boolean isLoading) {
        this.isLoading = isLoading;
        mAdapter.setLoading(isLoading);
    }
}
