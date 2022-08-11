package entity;

public class UserProfile {

    private Integer Id;
    private String nickname;
    private String username;
    private String bio;
    private String Gender;
    private String birthday;
    private Integer post_number;
    private Integer follower_number;
    private Integer following_number;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Integer getPost_number() {
        return post_number;
    }

    public void setPost_number(Integer post_number) {
        this.post_number = post_number;
    }

    public Integer getFollower_number() {
        return follower_number;
    }

    public void setFollower_number(Integer follower_number) {
        this.follower_number = follower_number;
    }

    public Integer getFollowing_number() {
        return following_number;
    }

    public void setFollowing_number(Integer following_number) {
        this.following_number = following_number;
    }

    @Override
    public String toString() {
        return "UserProfile{" +
                "Id=" + Id +
                ", nickname='" + nickname + '\'' +
                ", username='" + username + '\'' +
                ", bio='" + bio + '\'' +
                ", Gender='" + Gender + '\'' +
                ", birthday='" + birthday + '\'' +
                ", post_number=" + post_number +
                ", follower_number=" + follower_number +
                ", following_number=" + following_number +
                '}';
    }

    public UserProfile(){

    }

    public UserProfile(Integer id, String nickname, String username, String bio, String gender, String birthday, Integer post_number, Integer follower_number, Integer following_number) {
        Id = id;
        this.nickname = nickname;
        this.username = username;
        this.bio = bio;
        Gender = gender;
        this.birthday = birthday;
        this.post_number = post_number;
        this.follower_number = follower_number;
        this.following_number = following_number;
    }
}
