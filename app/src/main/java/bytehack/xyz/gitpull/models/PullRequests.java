package bytehack.xyz.gitpull.models;

import java.util.List;

public class PullRequests {

    List<PullRequestModel> pullRequestModels;

    String nextPageUrl;

    private PullRequests(List<PullRequestModel> pullRequestModels, String nextPageUrl) {
        this.pullRequestModels = pullRequestModels;
        this.nextPageUrl = nextPageUrl;
    }

    public List<PullRequestModel> getPullRequestModels() {
        return pullRequestModels;
    }
    public String getNextPageUrl() {
        return nextPageUrl;
    }

    public static class Builder {

        private List<PullRequestModel> pullRequestModels;
        private String nextPageUrl;

        public Builder setPullRequestModels(List<PullRequestModel> pullRequestModels) {
            this.pullRequestModels = pullRequestModels;
            return this;
        }

        public Builder setNextPageUrl(String nextPageUrl) {
            this.nextPageUrl = nextPageUrl;
            return this;
        }

        public PullRequests build() {
            return new PullRequests(pullRequestModels, nextPageUrl);
        }
    }
}
