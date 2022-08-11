package entity;

public class Comment {

    private Integer Id;
    private String post_owner;
    private Integer number_of_post;
    private Integer number_of_comment;
    private String sender;
    private String comment_text;
    private Integer like_number;
    private String commentTime;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getPost_owner() {
        return post_owner;
    }

    public void setPost_owner(String post_owner) {
        this.post_owner = post_owner;
    }

    public Integer getNumber_of_post() {
        return number_of_post;
    }

    public void setNumber_of_post(Integer number_of_post) {
        this.number_of_post = number_of_post;
    }

    public Integer getNumber_of_comment() {
        return number_of_comment;
    }

    public void setNumber_of_comment(Integer number_of_comment) {
        this.number_of_comment = number_of_comment;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getComment_text() {
        return comment_text;
    }

    public void setComment_text(String comment_text) {
        this.comment_text = comment_text;
    }

    public Integer getLike_number() {
        return like_number;
    }

    public void setLike_number(Integer like_number) {
        this.like_number = like_number;
    }

    public String getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(String commentTime) {
        this.commentTime = commentTime;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "Id=" + Id +
                ", post_owner='" + post_owner + '\'' +
                ", number_of_post=" + number_of_post +
                ", number_of_comment=" + number_of_comment +
                ", sender='" + sender + '\'' +
                ", comment_text='" + comment_text + '\'' +
                ", like_number=" + like_number +
                ", commentTime='" + commentTime + '\'' +
                '}';
    }

    public Comment(){

    }

    public Comment(Integer id, String post_owner, Integer number_of_post, Integer number_of_comment, String sender, String comment_text, Integer like_number, String commentTime) {
        Id = id;
        this.post_owner = post_owner;
        this.number_of_post = number_of_post;
        this.number_of_comment = number_of_comment;
        this.sender = sender;
        this.comment_text = comment_text;
        this.like_number = like_number;
        this.commentTime = commentTime;
    }
}
