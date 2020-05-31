package bytehack.xyz.restclient.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Links {
    @SerializedName("self")
    @Expose
    private Link self;
    @SerializedName("html")
    @Expose
    private Link html;
    @SerializedName("issue")
    @Expose
    private Link issue;
    @SerializedName("comments")
    @Expose
    private Link comments;
    @SerializedName("review_comments")
    @Expose
    private Link reviewComments;
    @SerializedName("review_comment")
    @Expose
    private Link reviewComment;
    @SerializedName("commits")
    @Expose
    private Link commits;
    @SerializedName("statuses")
    @Expose
    private Link status;


    private Link getSelf() {
        return self;
    }

    private void setSelf(Link self) {
        this.self = self;
    }

    private Link getHtml() {
        return html;
    }

    private void setHtml(Link html) {
        this.html = html;
    }

    private Link getIssue() {
        return issue;
    }

    private void setIssue(Link issue) {
        this.issue = issue;
    }

    private Link getComments() {
        return comments;
    }

    private void setComments(Link comments) {
        this.comments = comments;
    }

    private Link getReviewComments() {
        return reviewComments;
    }

    private void setReviewComments(Link reviewComments) {
        this.reviewComments = reviewComments;
    }

    private Link getReviewComment() {
        return reviewComment;
    }

    private void setReviewComment(Link reviewComment) {
        this.reviewComment = reviewComment;
    }

    private Link getCommits() {
        return commits;
    }

    private void setCommits(Link commits) {
        this.commits = commits;
    }

    private Link getStatus() {
        return status;
    }

    private void setStatus(Link status) {
        this.status = status;
    }
}
