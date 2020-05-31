package bytehack.xyz.gitpull.models;

public class PullRequestModel {

    private String title;
    private String createdDate;
    private String closedDate;
    private String userName;
    private String userImage;

    private PullRequestModel(String title, String createdDate, String closedDate, String userName, String userImage) {
        this.title = title;
        this.createdDate = createdDate;
        this.closedDate = closedDate;
        this.userName = userName;
        this.userImage = userImage;
    }

    public String getTitle() {
        return title;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public String getClosedDate() {
        return closedDate;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserImage() {
        return userImage;
    }

    public static class Builder {

        private String title;
        private String createdDate;
        private String closedDate;
        private String userName;
        private String userImage;

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setCreatedDate(String createdDate) {
            this.createdDate = createdDate;
            return this;
        }

        public Builder setClosedDate(String closedDate) {
            this.closedDate = closedDate;
            return this;
        }

        public Builder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public Builder setUserImage(String userImage) {
            this.userImage = userImage;
            return this;
        }

        public PullRequestModel createPrModel() {
            return new PullRequestModel(title, createdDate, closedDate, userName, userImage);
        }
    }
}
