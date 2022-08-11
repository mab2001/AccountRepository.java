package entity;

public class Follow {

    private Integer Id;
    private String following;
    private String who_followed;
    private String time;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getFollowing() {
        return following;
    }

    public void setFollowing(String following) {
        this.following = following;
    }

    public String getWho_followed() {
        return who_followed;
    }

    public void setWho_followed(String who_followed) {
        this.who_followed = who_followed;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Follow{" +
                "Id=" + Id +
                ", following='" + following + '\'' +
                ", who_followed='" + who_followed + '\'' +
                ", time='" + time + '\'' +
                '}';
    }

    public Follow(){

    }

    public Follow(Integer id, String following, String who_followed, String time) {
        Id = id;
        this.following = following;
        this.who_followed = who_followed;
        this.time = time;
    }
}
