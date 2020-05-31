package bytehack.xyz.restclient;

import java.util.ArrayList;
import java.util.List;

import bytehack.xyz.restclient.models.PullRequest;

public class PullRequestResponse {

    private List<PullRequest> pullRequests;

    private String nextPageUrl;

    private PullRequestResponse(List<PullRequest> pullRequests, String nextPageUrl) {
        this.pullRequests = pullRequests;
        this.nextPageUrl = nextPageUrl;
    }

    public List<PullRequest> getPullRequests() {
        return pullRequests;
    }

    public void setPullRequests(List<PullRequest> pullRequests) {
        this.pullRequests = pullRequests;
    }

    public String getNextPageUrl() {
        return nextPageUrl;
    }

    public void setNextPageUrl(String nextPageUrl) {
        this.nextPageUrl = nextPageUrl;
    }

    public static class Builder {

        private List<PullRequest> pullRequests;
        private String nextPageUrl;

        public Builder setPullRequests(List<PullRequest> pullRequests) {
            this.pullRequests = pullRequests;
            return this;
        }

        public Builder setNextPageUrl(String nextPageUrl) {
            this.nextPageUrl = nextPageUrl;
            return this;
        }

        public PullRequestResponse build() {
            if (pullRequests == null) {
                pullRequests = new ArrayList<>();
            }
            return new PullRequestResponse(pullRequests, nextPageUrl);
        }
    }
}
