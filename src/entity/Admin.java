package entity;

public class Admin {

    private Integer Id;
    private String group_name;
    private String admin_name;
    private String who_admined;
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

    public String getAdmin_name() {
        return admin_name;
    }

    public void setAdmin_name(String admin_name) {
        this.admin_name = admin_name;
    }

    public String getWho_admined() {
        return who_admined;
    }

    public void setWho_admined(String who_admined) {
        this.who_admined = who_admined;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "Id=" + Id +
                ", group_name='" + group_name + '\'' +
                ", admin_name='" + admin_name + '\'' +
                ", who_admined='" + who_admined + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
    public Admin(){

    }

    public Admin(Integer id, String group_name, String admin_name, String who_admined, String time) {
        Id = id;
        this.group_name = group_name;
        this.admin_name = admin_name;
        this.who_admined = who_admined;
        this.time = time;
    }
}
