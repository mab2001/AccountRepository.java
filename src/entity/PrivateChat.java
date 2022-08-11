package entity;

public class PrivateChat {

    private Integer privatechatId;
    private String privatechatOwner;
    private String privatechatSender;
    private Integer privatechatMessagesNumber;
    private String privatechatCreateTime;
    private String privatechatMuteType;
    private String privatechatBlockType;

    public String getPrivatechatOwner() {
        return privatechatOwner;
    }

    public void setPrivatechatOwner(String privatechatOwner) {
        this.privatechatOwner = privatechatOwner;
    }

    public String getPrivatechatSender() {
        return privatechatSender;
    }

    public void setPrivatechatSender(String privatechatSender) {
        this.privatechatSender = privatechatSender;
    }

    public Integer getPrivatechatId() {
        return privatechatId;
    }

    public void setPrivatechatId(Integer privatechatId) {
        this.privatechatId = privatechatId;
    }

    public Integer getPrivatechatMessagesNumber() {
        return privatechatMessagesNumber;
    }

    public void setPrivatechatMessagesNumber(Integer privatechatMessagesNumber) {
        this.privatechatMessagesNumber = privatechatMessagesNumber;
    }

    public String getPrivatechatCreateTime() {
        return privatechatCreateTime;
    }

    public void setPrivatechatCreateTime(String privatechatCreateTime) {
        this.privatechatCreateTime = privatechatCreateTime;
    }

    public String getPrivatechatMuteType() {
        return privatechatMuteType;
    }

    public void setPrivatechatMuteType(String privatechatMuteType) {
        this.privatechatMuteType = privatechatMuteType;
    }

    public String getPrivatechatBlockType() {
        return privatechatBlockType;
    }

    public void setPrivatechatBlockType(String privatechatBlockType) {
        this.privatechatBlockType = privatechatBlockType;
    }

    @Override
    public String toString() {
        return "PrivateChat{" +
                "privatechatId=" + privatechatId +
                ", privatechatOwner='" + privatechatOwner + '\'' +
                ", privatechatSender='" + privatechatSender + '\'' +
                ", privatechatMessagesNumber=" + privatechatMessagesNumber +
                ", privatechatCreateTime='" + privatechatCreateTime + '\'' +
                ", privatechatMuteType='" + privatechatMuteType + '\'' +
                ", privatechatBlockType='" + privatechatBlockType + '\'' +
                '}';
    }

    public PrivateChat(){

    }

    public PrivateChat(Integer privatechatId, String privatechatOwner, String privatechatSender, Integer privatechatMessagesNumber, String privatechatCreateTime, String privatechatMuteType, String privatechatBlockType) {
        this.privatechatId = privatechatId;
        this.privatechatOwner = privatechatOwner;
        this.privatechatSender = privatechatSender;
        this.privatechatMessagesNumber = privatechatMessagesNumber;
        this.privatechatCreateTime = privatechatCreateTime;
        this.privatechatMuteType = privatechatMuteType;
        this.privatechatBlockType = privatechatBlockType;
    }
}
