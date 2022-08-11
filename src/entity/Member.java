package entity;

public class Member {

    private Integer Id;
    private String group_name;
    private String member_name;
    private String who_added;
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

    public String getMember_name() {
        return member_name;
    }

    public void setMember_name(String member_name) {
        this.member_name = member_name;
    }

    public String getWho_added() {
        return who_added;
    }

    public void setWho_added(String who_added) {
        this.who_added = who_added;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Member{" +
                "Id=" + Id +
                ", group_name='" + group_name + '\'' +
                ", member_name='" + member_name + '\'' +
                ", who_added='" + who_added + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
    public Member(){

    }

    public Member(Integer id, String group_name, String member_name, String who_added, String time) {
        Id = id;
        this.group_name = group_name;
        this.member_name = member_name;
        this.who_added = who_added;
        this.time = time;
    }
}
