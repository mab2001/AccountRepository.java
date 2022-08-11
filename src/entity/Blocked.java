package entity;

public class Blocked {

    private Integer Id;
    private String who_blocked;
    private String blocked;
    private String time;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getWho_blocked() {
        return who_blocked;
    }

    public void setWho_blocked(String who_blocked) {
        this.who_blocked = who_blocked;
    }

    public String getBlocked() {
        return blocked;
    }

    public void setBlocked(String blocked) {
        this.blocked = blocked;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Blocked{" +
                "Id=" + Id +
                ", who_blocked='" + who_blocked + '\'' +
                ", blocked='" + blocked + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
    public Blocked(){

    }

    public Blocked(Integer id, String who_blocked, String blocked, String time) {
        Id = id;
        this.who_blocked = who_blocked;
        this.blocked = blocked;
        this.time = time;
    }
}
