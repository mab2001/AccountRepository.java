package entity;

public class Message {

    private Integer messageId;
    private String messageLocation;
    private String messageOwner;
    private String messageText;
    private Integer messageTime;

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public String getMessageLocation() {
        return messageLocation;
    }

    public void setMessageLocation(String messageLocation) {
        this.messageLocation = messageLocation;
    }

    public String getMessageOwner() {
        return messageOwner;
    }

    public void setMessageOwner(String messageOwner) {
        this.messageOwner = messageOwner;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public Integer getMessageTime() {
        return messageTime;
    }

    public void setMessageTime(Integer messageTime) {
        this.messageTime = messageTime;
    }

    @Override
    public String toString() {
        return "message{" +
                "messageId=" + messageId +
                ", messageLocation='" + messageLocation + '\'' +
                ", messageOwner='" + messageOwner + '\'' +
                ", messageText='" + messageText + '\'' +
                ", messageTime=" + messageTime +
                '}';
    }
}
