package entity;

public class Group {

    private Integer groupId;
    private String groupName;
    private String groupType;
    private String groupCreator;
    private Integer groupAdminsNumber;
    private Integer groupMembersNumber;
    private String groupBio;
    private Integer groupCreateTime;

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

    public Integer getGroupCreateTime() {
        return groupCreateTime;
    }

    public void setGroupCreateTime(Integer groupCreateTime) {
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
}
