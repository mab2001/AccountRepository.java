package entity;

public class LikesPost {

    private Integer Id;
    private String post_owner;
    private Integer number_of_post;
    private String who_liked;
    private String time;

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

    public String getWho_liked() {
        return who_liked;
    }

    public void setWho_liked(String who_liked) {
        this.who_liked = who_liked;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "LikesPost{" +
                "Id=" + Id +
                ", post_owner='" + post_owner + '\'' +
                ", number_of_post=" + number_of_post +
                ", who_liked='" + who_liked + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
    public LikesPost(){

    }

    public LikesPost(Integer id, String post_owner, Integer number_of_post, String who_liked, String time) {
        Id = id;
        this.post_owner = post_owner;
        this.number_of_post = number_of_post;
        this.who_liked = who_liked;
        this.time = time;
    }
}
