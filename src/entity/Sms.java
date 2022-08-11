package entity;

public class Sms {

    private Integer Id;
    private String sms_owner;
    private String sms_text;
    private String time;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getSms_owner() {
        return sms_owner;
    }

    public void setSms_owner(String sms_owner) {
        this.sms_owner = sms_owner;
    }

    public String getSms_text() {
        return sms_text;
    }

    public void setSms_text(String sms_text) {
        this.sms_text = sms_text;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Sms{" +
                "Id=" + Id +
                ", sms_owner='" + sms_owner + '\'' +
                ", sms_text='" + sms_text + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
    public Sms(){

    }

    public Sms(Integer id, String sms_owner, String sms_text, String time) {
        Id = id;
        this.sms_owner = sms_owner;
        this.sms_text = sms_text;
        this.time = time;
    }
}
