package entity;

public class PrivateChat {

    private Integer privatechatId;
    private String privatechatName;
    private Integer privatechatMessagesNumber;
    private Integer privatechatCreateTime;
    private String privatechatMuteType;
    private String privatechatReportType;
    private String privatechatBlockType;

    public Integer getPrivatechatId() {
        return privatechatId;
    }

    public void setPrivatechatId(Integer privatechatId) {
        this.privatechatId = privatechatId;
    }

    public String getPrivatechatName() {
        return privatechatName;
    }

    public void setPrivatechatName(String privatechatName) {
        this.privatechatName = privatechatName;
    }

    public Integer getPrivatechatMessagesNumber() {
        return privatechatMessagesNumber;
    }

    public void setPrivatechatMessagesNumber(Integer privatechatMessagesNumber) {
        this.privatechatMessagesNumber = privatechatMessagesNumber;
    }

    public Integer getPrivatechatCreateTime() {
        return privatechatCreateTime;
    }

    public void setPrivatechatCreateTime(Integer privatechatCreateTime) {
        this.privatechatCreateTime = privatechatCreateTime;
    }

    public String getPrivatechatMuteType() {
        return privatechatMuteType;
    }

    public void setPrivatechatMuteType(String privatechatMuteType) {
        this.privatechatMuteType = privatechatMuteType;
    }

    public String getPrivatechatReportType() {
        return privatechatReportType;
    }

    public void setPrivatechatReportType(String privatechatReportType) {
        this.privatechatReportType = privatechatReportType;
    }

    public String getPrivatechatBlockType() {
        return privatechatBlockType;
    }

    public void setPrivatechatBlockType(String privatechatBlockType) {
        this.privatechatBlockType = privatechatBlockType;
    }

    @Override
    public String toString() {
        return "privatechat{" +
                "privatechatId=" + privatechatId +
                ", privatechatName='" + privatechatName + '\'' +
                ", privatechatMessagesNumber=" + privatechatMessagesNumber +
                ", privatechatCreateTime=" + privatechatCreateTime +
                ", privatechatMuteType='" + privatechatMuteType + '\'' +
                ", privatechatReportType='" + privatechatReportType + '\'' +
                ", privatechatBlockType='" + privatechatBlockType + '\'' +
                '}';
    }
}
