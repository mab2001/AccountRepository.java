package entity;

public class ViewPost {

    private Integer Id;
    private String post_owner;
    private Integer number_of_post;
    private String visitor;
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

    public String getVisitor() {
        return visitor;
    }

    public void setVisitor(String visitor) {
        this.visitor = visitor;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "ViewPost{" +
                "Id=" + Id +
                ", post_owner='" + post_owner + '\'' +
                ", number_of_post=" + number_of_post +
                ", visitor='" + visitor + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
    public ViewPost(){

    }

    public ViewPost(Integer id, String post_owner, Integer number_of_post, String visitor, String time) {
        Id = id;
        this.post_owner = post_owner;
        this.number_of_post = number_of_post;
        this.visitor = visitor;
        this.time = time;
    }
}
