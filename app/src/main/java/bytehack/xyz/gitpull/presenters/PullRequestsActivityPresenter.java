package bytehack.xyz.gitpull.presenters;

public interface PullRequestsActivityPresenter extends ActivityPresenter {

    void refreshList();

    void filter(int id);

    void loadNext();

    boolean isLoading();
}
