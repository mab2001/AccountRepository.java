package entity;

public class UserProfile {

    private Integer profileID;
    private String profileName;
    private Integer profilePostsNumber;
    private Integer profileFollowersNumber;
    private Integer profileFollowingsNumber;
    private String profileBio;

    public Integer getProfileID() {
        return profileID;
    }

    public void setProfileID(Integer profileID) {
        this.profileID = profileID;
    }

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    public Integer getProfilePostsNumber() {
        return profilePostsNumber;
    }

    public void setProfilePostsNumber(Integer profilePostsNumber) {
        this.profilePostsNumber = profilePostsNumber;
    }

    public Integer getProfileFollowersNumber() {
        return profileFollowersNumber;
    }

    public void setProfileFollowersNumber(Integer profileFollowersNumber) {
        this.profileFollowersNumber = profileFollowersNumber;
    }

    public Integer getProfileFollowingsNumber() {
        return profileFollowingsNumber;
    }

    public void setProfileFollowingsNumber(Integer profileFollowingsNumber) {
        this.profileFollowingsNumber = profileFollowingsNumber;
    }

    public String getProfileBio() {
        return profileBio;
    }

    public void setProfileBio(String profileBio) {
        this.profileBio = profileBio;
    }

    @Override
    public String toString() {
        return "userprofile{" +
                "profileID=" + profileID +
                ", profileName='" + profileName + '\'' +
                ", profilePostsNumber=" + profilePostsNumber +
                ", profileFollowersNumber=" + profileFollowersNumber +
                ", profileFollowingsNumber=" + profileFollowingsNumber +
                ", profileBio='" + profileBio + '\'' +
                '}';
    }
}
