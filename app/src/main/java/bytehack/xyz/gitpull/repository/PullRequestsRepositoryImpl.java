package bytehack.xyz.gitpull.repository;

import java.util.ArrayList;
import java.util.List;

import bytehack.xyz.gitpull.models.PullRequestModel;
import bytehack.xyz.gitpull.models.PullRequests;
import bytehack.xyz.restclient.PullRequestResponse;
import bytehack.xyz.restclient.RestClient;

public class PullRequestsRepositoryImpl implements PullRequestsRepository {

    @Override
    public PullRequests getPullRequests(String owner, String repo, String state) {
        PullRequestResponse pullRequestResponse = RestClient.getPR(owner, repo, state);
        List<bytehack.xyz.restclient.models.PullRequest> pullRequests = pullRequestResponse.getPullRequests();
        List<PullRequestModel> dataList = new ArrayList<>();
        for (bytehack.xyz.restclient.models.PullRequest pr : pullRequests) {
            PullRequestModel.Builder builder = new PullRequestModel.Builder();
            builder.setTitle(pr.getTitle())
                    .setUserName(pr.getUser().getLogin())
                    .setUserImage(pr.getUser().getAvatarUrl())
                    .setCreatedDate(pr.getCreatedAt())
                    .setClosedDate(pr.getClosedAt());
            dataList.add(builder.createPrModel());
        }
        PullRequests.Builder builder = new PullRequests.Builder();
        builder.setNextPageUrl(pullRequestResponse.getNextPageUrl())
                .setPullRequestModels(dataList);
        return builder.build();
    }

    @Override
    public PullRequests getNextPage(String nextPageUrl) {
        PullRequestResponse pullRequestResponse = RestClient.getPullRequests(nextPageUrl);
        List<bytehack.xyz.restclient.models.PullRequest> pullRequests = pullRequestResponse.getPullRequests();
        List<PullRequestModel> dataList = new ArrayList<>();
        for (bytehack.xyz.restclient.models.PullRequest pr : pullRequests) {
            PullRequestModel.Builder builder = new PullRequestModel.Builder();
            builder.setTitle(pr.getTitle())
                    .setUserName(pr.getUser().getLogin())
                    .setUserImage(pr.getUser().getAvatarUrl())
                    .setCreatedDate(pr.getCreatedAt())
                    .setClosedDate(pr.getClosedAt());
            dataList.add(builder.createPrModel());
        }
        PullRequests.Builder builder = new PullRequests.Builder();
        builder.setNextPageUrl(pullRequestResponse.getNextPageUrl())
                .setPullRequestModels(dataList);
        return builder.build();
    }
}
