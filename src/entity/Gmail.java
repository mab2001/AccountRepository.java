package entity;

public class Gmail {

    private Integer Id;
    private String Gmail_owner;
    private String Gmail_text;
    private String time;

    public String getGmail_owner() {
        return Gmail_owner;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public void setGmail_owner(String gmail_owner) {
        Gmail_owner = gmail_owner;
    }

    public String getGmail_text() {
        return Gmail_text;
    }

    public void setGmail_text(String gmail_text) {
        Gmail_text = gmail_text;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Gmail{" +
                "Id=" + Id +
                ", Gmail_owner='" + Gmail_owner + '\'' +
                ", Gmail_text='" + Gmail_text + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
    public Gmail(){

    }

    public Gmail(Integer id, String gmail_owner, String gmail_text, String time) {
        Id = id;
        Gmail_owner = gmail_owner;
        Gmail_text = gmail_text;
        this.time = time;
    }
}
