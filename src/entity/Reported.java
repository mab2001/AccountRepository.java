package entity;

public class Reported {

    private Integer Id;
    private String reported_group;
    private String who_reported;
    private String time;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getReported_group() {
        return reported_group;
    }

    public void setReported_group(String reported_group) {
        this.reported_group = reported_group;
    }

    public String getWho_reported() {
        return who_reported;
    }

    public void setWho_reported(String who_reported) {
        this.who_reported = who_reported;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Reported{" +
                "Id=" + Id +
                ", reported_group='" + reported_group + '\'' +
                ", who_reported='" + who_reported + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
    public Reported(){

    }

    public Reported(Integer id, String reported_group, String who_reported, String time) {
        Id = id;
        this.reported_group = reported_group;
        this.who_reported = who_reported;
        this.time = time;
    }
}
