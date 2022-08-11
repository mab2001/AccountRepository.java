package entity;

public class CloseFriend {

    private Integer Id;
    private String who_friended;
    private String friend;
    private String time;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getWho_friended() {
        return who_friended;
    }

    public void setWho_friended(String who_friended) {
        this.who_friended = who_friended;
    }

    public String getFriend() {
        return friend;
    }

    public void setFriend(String friend) {
        this.friend = friend;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "CloseFriend{" +
                "Id=" + Id +
                ", who_friended='" + who_friended + '\'' +
                ", friend='" + friend + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
    public CloseFriend(){

    }

    public CloseFriend(Integer id, String who_friended, String friend, String time) {
        Id = id;
        this.who_friended = who_friended;
        this.friend = friend;
        this.time = time;
    }
}
