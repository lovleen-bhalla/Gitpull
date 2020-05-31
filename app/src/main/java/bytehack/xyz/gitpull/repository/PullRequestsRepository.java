package bytehack.xyz.gitpull.repository;

import androidx.annotation.WorkerThread;

import bytehack.xyz.gitpull.models.PullRequests;

public interface PullRequestsRepository {

    @WorkerThread
    PullRequests getPullRequests(String owner, String repo, String state);

    @WorkerThread
    PullRequests getNextPage(String nextPageUrl);
}
