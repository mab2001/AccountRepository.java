package entity;

public class User {

    private Integer userId;
    private String userName;
    private String userPassWord;
    private String userPhoneNumber;
    private String userGmail;
    private String userAccountType;
    private String userAccountCreateTime;
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

    public String getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public void setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
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

    public String getUserAccountCreateTime() {
        return userAccountCreateTime;
    }

    public void setUserAccountCreateTime(String userAccountCreateTime) {
        this.userAccountCreateTime = userAccountCreateTime;
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
                ", userMobilePhoneNumber=" + userPhoneNumber +
                ", userGmail='" + userGmail + '\'' +
                ", userAccountType='" + userAccountType + '\'' +
                ", userCreateAccountTime=" + userAccountCreateTime +
                ", userLastSeen='" + userLastSeen + '\'' +
                '}';
    }


    public User(Integer userId, String userName, String userPassWord, String userMobilePhoneNumber, String userGmail, String userAccountType, String userCreateAccountTime, String userLastSeen) {
        this.userId = userId;
        this.userName = userName;
        this.userPassWord = userPassWord;
        this.userPhoneNumber = userMobilePhoneNumber;
        this.userGmail = userGmail;
        this.userAccountType = userAccountType;
        this.userAccountCreateTime = userCreateAccountTime;
        this.userLastSeen = userLastSeen;
    }
    public User(){

    }
}
