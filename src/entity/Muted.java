package entity;

public class Muted {

    private Integer Id;
    private String who_muted;
    private String muted;
    private String time;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getWho_muted() {
        return who_muted;
    }

    public void setWho_muted(String who_muted) {
        this.who_muted = who_muted;
    }

    public String getMuted() {
        return muted;
    }

    public void setMuted(String muted) {
        this.muted = muted;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Muted{" +
                "Id=" + Id +
                ", who_muted='" + who_muted + '\'' +
                ", muted='" + muted + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
    public Muted(){

    }

    public Muted(Integer id, String who_muted, String muted, String time) {
        Id = id;
        this.who_muted = who_muted;
        this.muted = muted;
        this.time = time;
    }
}
