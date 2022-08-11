package entity;

public class GroupMessage {

    private Integer Id;
    private String group_name;
    private String sender;
    private String text;
    private String replied;
    private String whome_replied;
    private String what_replied;
    private String forwarded;
    private String forwarded_of_where;
    private String edited;
    private String time;

    public String getGroup_name() {
        return group_name;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public void setGroup_name(String group_name) {
        this.group_name = group_name;
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
        return "GroupMessage{" +
                "group_name='" + group_name + '\'' +
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
    public GroupMessage(){

    }

    public GroupMessage(Integer id, String group_name, String sender, String text, String replied, String whome_replied, String what_replied, String forwarded, String forwarded_of_where, String edited, String time) {
        Id = id;
        this.group_name = group_name;
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
