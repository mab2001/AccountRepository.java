package entity;

public class Kicked {

    private Integer Id;
    private String group_name;
    private String who_kicked;
    private String kicked;
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

    public String getWho_kicked() {
        return who_kicked;
    }

    public void setWho_kicked(String who_kicked) {
        this.who_kicked = who_kicked;
    }

    public String getKicked() {
        return kicked;
    }

    public void setKicked(String kicked) {
        this.kicked = kicked;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Kicked{" +
                "Id=" + Id +
                ", group_name='" + group_name + '\'' +
                ", who_kicked='" + who_kicked + '\'' +
                ", kicked='" + kicked + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
    public Kicked(){

    }

    public Kicked(Integer id, String group_name, String who_kicked, String kicked, String time) {
        Id = id;
        this.group_name = group_name;
        this.who_kicked = who_kicked;
        this.kicked = kicked;
        this.time = time;
    }
}
