package entity;

public class Banned {

    private Integer Id;
    private String group_name;
    private String banned;
    private String who_banned;
    private String time;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getGroup_name() {
        return group_name;
    }

    public void setGroup_name(String group_name) {
        this.group_name = group_name;
    }

    public String getBanned() {
        return banned;
    }

    public void setBanned(String banned) {
        this.banned = banned;
    }

    public String getWho_banned() {
        return who_banned;
    }

    public void setWho_banned(String who_banned) {
        this.who_banned = who_banned;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Banned{" +
                "Id=" + Id +
                ", group_name='" + group_name + '\'' +
                ", banned='" + banned + '\'' +
                ", who_banned='" + who_banned + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
    public Banned(){

    }

    public Banned(Integer id, String group_name, String banned, String who_banned, String time) {
        Id = id;
        this.group_name = group_name;
        this.banned = banned;
        this.who_banned = who_banned;
        this.time = time;
    }
}
