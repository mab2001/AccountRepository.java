package entity;

public class PrivateChetMessage {

    private Integer Id;
    private String chat_owner;
    private String sender;
    private String text;
    private String replied;
    private String whome_replied;
    private String what_replied;
    private String forwarded;
    private String forwarded_of_where;
    private String edited;
    private String time;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getChat_owner() {
        return chat_owner;
    }

    public void setChat_owner(String chat_owner) {
        this.chat_owner = chat_owner;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getReplied() {
        return replied;
    }

    public void setReplied(String replied) {
        this.replied = replied;
    }

    public String getWhome_replied() {
        return whome_replied;
    }

    public void setWhome_replied(String whome_replied) {
        this.whome_replied = whome_replied;
    }

    public String getWhat_replied() {
        return what_replied;
    }

    public void setWhat_replied(String what_replied) {
        this.what_replied = what_replied;
    }

    public String getForwarded() {
        return forwarded;
    }

    public void setForwarded(String forwarded) {
        this.forwarded = forwarded;
    }

    public String getForwarded_of_where() {
        return forwarded_of_where;
    }

    public void setForwarded_of_where(String forwarded_of_where) {
        this.forwarded_of_where = forwarded_of_where;
    }

    public String getEdited() {
        return edited;
    }

    public void setEdited(String edited) {
        this.edited = edited;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "PrivateChetMessage{" +
                "Id=" + Id +
                ", chat_owner='" + chat_owner + '\'' +
                ", sender='" + sender + '\'' +
                ", text='" + text + '\'' +
                ", replied='" + replied + '\'' +
                ", whome_replied='" + whome_replied + '\'' +
                ", what_replied='" + what_replied + '\'' +
                ", forwarded='" + forwarded + '\'' +
                ", forwarded_of_where='" + forwarded_of_where + '\'' +
                ", edited='" + edited + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
    public PrivateChetMessage(){

    }

    public PrivateChetMessage(Integer id, String chat_owner, String sender, String text, String replied, String whome_replied, String what_replied, String forwarded, String forwarded_of_where, String edited, String time) {
        Id = id;
        this.chat_owner = chat_owner;
        this.sender = sender;
        this.text = text;
        this.replied = replied;
        this.whome_replied = whome_replied;
        this.what_replied = what_replied;
        this.forwarded = forwarded;
        this.forwarded_of_where = forwarded_of_where;
        this.edited = edited;
        this.time = time;
    }
}
