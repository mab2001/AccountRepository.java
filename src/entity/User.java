package entity;

public class User {

    private Integer userId;
    private String userName;
    private String userPassWord;
    private Integer userMobilePhoneNumber;
    private String userGmail;
    private String userAccountType;
    private Integer userCreateAccountTime;
    private String userLastSeen;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassWord() {
        return userPassWord;
    }

    public void setUserPassWord(String userPassWord) {
        this.userPassWord = userPassWord;
    }

    public Integer getUserMobilePhoneNumber() {
        return userMobilePhoneNumber;
    }

    public void setUserMobilePhoneNumber(Integer userMobilePhoneNumber) {
        this.userMobilePhoneNumber = userMobilePhoneNumber;
    }

    public String getUserGmail() {
        return userGmail;
    }

    public void setUserGmail(String userGmail) {
        this.userGmail = userGmail;
    }

    public String getUserAccountType() {
        return userAccountType;
    }

    public void setUserAccountType(String userAccountType) {
        this.userAccountType = userAccountType;
    }

    public Integer getUserCreateAccountTime() {
        return userCreateAccountTime;
    }

    public void setUserCreateAccountTime(Integer userCreateAccountTime) {
        this.userCreateAccountTime = userCreateAccountTime;
    }

    public String getUserLastSeen() {
        return userLastSeen;
    }

    public void setUserLastSeen(String userLastSeen) {
        this.userLastSeen = userLastSeen;
    }

    @Override
    public String toString() {
        return "user{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPassWord='" + userPassWord + '\'' +
                ", userMobilePhoneNumber=" + userMobilePhoneNumber +
                ", userGmail='" + userGmail + '\'' +
                ", userAccountType='" + userAccountType + '\'' +
                ", userCreateAccountTime=" + userCreateAccountTime +
                ", userLastSeen='" + userLastSeen + '\'' +
                '}';
    }

    public User(Integer userId, String userName, String userPassWord, Integer userMobilePhoneNumber, String userGmail, String userAccountType, Integer userCreateAccountTime, String userLastSeen) {
        this.userId = userId;
        this.userName = userName;
        this.userPassWord = userPassWord;
        this.userMobilePhoneNumber = userMobilePhoneNumber;
        this.userGmail = userGmail;
        this.userAccountType = userAccountType;
        this.userCreateAccountTime = userCreateAccountTime;
        this.userLastSeen = userLastSeen;
    }
    public User(){

    }
}
