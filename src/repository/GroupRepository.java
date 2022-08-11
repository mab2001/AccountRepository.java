package repository;

import entity.Group;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class GroupRepository {
    public static List<Group> showAllGroups(Connection connection) throws SQLException {
        List<Group> groups = new ArrayList<>();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from initgrouptable");
        while (resultSet.next()) {
            Group group = new Group();
            group.setGroupId(resultSet.getInt("groupId"));
            group.setGroupName(resultSet.getString("groupName"));
            group.setGroupType(resultSet.getString("groupType(public or private?)"));
            group.setGroupCreator(resultSet.getString("groupCreator"));
            group.setGroupAdminsNumber(resultSet.getInt("groupAdminsNumber"));
            group.setGroupMembersNumber(resultSet.getInt("groupMembersNumber"));
            group.setGroupBio(resultSet.getString("groupBio"));
            group.setGroupCreateTime(resultSet.getString("groupCreateTime"));
            groups.add(group);
        }
        statement.close();
        return groups;
    }
}
