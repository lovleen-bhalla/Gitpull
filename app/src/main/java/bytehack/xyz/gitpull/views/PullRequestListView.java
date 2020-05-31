package bytehack.xyz.gitpull.views;

import java.util.List;

import bytehack.xyz.gitpull.models.PullRequestModel;

public interface PullRequestListView {

    void addItems(List<PullRequestModel> dataList);

    void setDataList(List<PullRequestModel> dataList);

    void clear();

    boolean isLoading();

    void setLoading(boolean isLoading);
}
