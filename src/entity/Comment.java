package entity;

public class Comment {

    private Integer commentId;
    private String commentText;
    private String commentOwner;
    private Integer commentTime;
    private Integer commentLikesNumber;

    public Integer getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Integer commentTime) {
        this.commentTime = commentTime;
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public String getCommentOwner() {
        return commentOwner;
    }

    public void setCommentOwner(String commentOwner) {
        this.commentOwner = commentOwner;
    }

    public Integer getCommentLikesNumber() {
        return commentLikesNumber;
    }

    public void setCommentLikesNumber(Integer commentLikesNumber) {
        this.commentLikesNumber = commentLikesNumber;
    }
    @Override
    public String toString() {
        return "comment{" +
                "commentId=" + commentId +
                ", commentOwner='" + commentOwner + '\'' +
                ", commentText='" + commentText + '\'' +
                ", commentTime=" + commentTime +
                ", commentLikesNumber=" + commentLikesNumber +
                '}';
    }


}
