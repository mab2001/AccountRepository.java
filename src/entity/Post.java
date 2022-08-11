package entity;

public class Post {

    private Integer postID;
    private Integer postNumber;
    private String postOwner;
    private String has_ad;
    private String postText;
    private String is_it_edited;
    private Integer postLikesNumber;
    private Integer postViewsNumber;
    private Integer postCommentNumber;
    private String postTime;

    public String getHas_ad() {
        return has_ad;
    }

    public void setHas_ad(String has_ad) {
        this.has_ad = has_ad;
    }

    public String getIs_it_edited() {
        return is_it_edited;
    }

    public void setIs_it_edited(String is_it_edited) {
        this.is_it_edited = is_it_edited;
    }

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

    public String getPostTime() {
        return postTime;
    }

    public void setPostTime(String postTime) {
        this.postTime = postTime;
    }

    @Override
    public String toString() {
        return "Post{" +
                "postID=" + postID +
                ", postNumber=" + postNumber +
                ", postOwner='" + postOwner + '\'' +
                ", has_ad='" + has_ad + '\'' +
                ", postText='" + postText + '\'' +
                ", is_it_edited='" + is_it_edited + '\'' +
                ", postLikesNumber=" + postLikesNumber +
                ", postViewsNumber=" + postViewsNumber +
                ", postCommentNumber=" + postCommentNumber +
                ", postTime='" + postTime + '\'' +
                '}';
    }

    public Post(){

    }

    public Post(Integer postID, Integer postNumber, String postOwner, String has_ad, String postText, String is_it_edited, Integer postLikesNumber, Integer postViewsNumber, Integer postCommentNumber, String postTime) {
        this.postID = postID;
        this.postNumber = postNumber;
        this.postOwner = postOwner;
        this.has_ad = has_ad;
        this.postText = postText;
        this.is_it_edited = is_it_edited;
        this.postLikesNumber = postLikesNumber;
        this.postViewsNumber = postViewsNumber;
        this.postCommentNumber = postCommentNumber;
        this.postTime = postTime;
    }

}
