package entity;

public class Post {

    private Integer postID;
    private Integer postNumber;
    private String postOwner;
    private String postText;
    private Integer postLikesNumber;
    private Integer postViewsNumber;
    private Integer postCommentNumber;
    private Integer postTime;

    public Integer getPostID() {
        return postID;
    }

    public void setPostID(Integer postID) {
        this.postID = postID;
    }

    public Integer getPostNumber() {
        return postNumber;
    }

    public void setPostNumber(Integer postNumber) {
        this.postNumber = postNumber;
    }

    public String getPostOwner() {
        return postOwner;
    }

    public void setPostOwner(String postOwner) {
        this.postOwner = postOwner;
    }

    public String getPostText() {
        return postText;
    }

    public void setPostText(String postText) {
        this.postText = postText;
    }

    public Integer getPostLikesNumber() {
        return postLikesNumber;
    }

    public void setPostLikesNumber(Integer postLikesNumber) {
        this.postLikesNumber = postLikesNumber;
    }

    public Integer getPostViewsNumber() {
        return postViewsNumber;
    }

    public void setPostViewsNumber(Integer postViewsNumber) {
        this.postViewsNumber = postViewsNumber;
    }

    public Integer getPostCommentNumber() {
        return postCommentNumber;
    }

    public void setPostCommentNumber(Integer postCommentNumber) {
        this.postCommentNumber = postCommentNumber;
    }

    public Integer getPostTime() {
        return postTime;
    }

    public void setPostTime(Integer postTime) {
        this.postTime = postTime;
    }

    @Override
    public String toString() {
        return "post{" +
                "postID=" + postID +
                ", postNumber=" + postNumber +
                ", postOwner='" + postOwner + '\'' +
                ", postText='" + postText + '\'' +
                ", postLikesNumber=" + postLikesNumber +
                ", postViewsNumber=" + postViewsNumber +
                ", postCommentNumber=" + postCommentNumber +
                ", postTime=" + postTime +
                '}';
    }
}
