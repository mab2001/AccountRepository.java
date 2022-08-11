package entity;

public class Group {

    private Integer groupId;
    private String groupName;
    private String groupType;
    private String groupCreator;
    private Integer groupAdminsNumber;
    private Integer groupMembersNumber;
    private String groupBio;
    private String groupCreateTime;

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupType() {
        return groupType;
    }

    public void setGroupType(String groupType) {
        this.groupType = groupType;
    }

    public String getGroupCreator() {
        return groupCreator;
    }

    public void setGroupCreator(String groupCreator) {
        this.groupCreator = groupCreator;
    }

    public Integer getGroupAdminsNumber() {
        return groupAdminsNumber;
    }

    public void setGroupAdminsNumber(Integer groupAdminsNumber) {
        this.groupAdminsNumber = groupAdminsNumber;
    }

    public Integer getGroupMembersNumber() {
        return groupMembersNumber;
    }

    public void setGroupMembersNumber(Integer groupMembersNumber) {
        this.groupMembersNumber = groupMembersNumber;
    }

    public String getGroupBio() {
        return groupBio;
    }

    public void setGroupBio(String groupBio) {
        this.groupBio = groupBio;
    }

    public String getGroupCreateTime() {
        return groupCreateTime;
    }

    public void setGroupCreateTime(String groupCreateTime) {
        this.groupCreateTime = groupCreateTime;
    }

    @Override
    public String toString() {
        return "group{" +
                "groupId=" + groupId +
                ", groupName='" + groupName + '\'' +
                ", groupType='" + groupType + '\'' +
                ", groupCreator='" + groupCreator + '\'' +
                ", groupAdminsNumber=" + groupAdminsNumber +
                ", groupMembersNumber=" + groupMembersNumber +
                ", groupBio='" + groupBio + '\'' +
                ", groupCreateTime=" + groupCreateTime +
                '}';
    }
    public Group(){

    }

    public Group(Integer groupId, String groupName, String groupType, String groupCreator, Integer groupAdminsNumber, Integer groupMembersNumber, String groupBio, String groupCreateTime) {
        this.groupId = groupId;
        this.groupName = groupName;
        this.groupType = groupType;
        this.groupCreator = groupCreator;
        this.groupAdminsNumber = groupAdminsNumber;
        this.groupMembersNumber = groupMembersNumber;
        this.groupBio = groupBio;
        this.groupCreateTime = groupCreateTime;
    }
}
