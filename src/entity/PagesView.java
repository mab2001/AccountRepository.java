package entity;

public class PagesView {

    private Integer Id;
    private String post_owner;
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
        return "PagesView{" +
                "Id=" + Id +
                ", post_owner='" + post_owner + '\'' +
                ", visitor='" + visitor + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
    public PagesView(){

    }

    public PagesView(Integer id, String post_owner, String visitor, String time) {
        Id = id;
        this.post_owner = post_owner;
        this.visitor = visitor;
        this.time = time;
    }
}
