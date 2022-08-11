package repository;

import entity.GroupMessage;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class GroupMessageRepository {
    public static List<GroupMessage> showAllGroupMessages(Connection connection) throws SQLException {
        List<GroupMessage> groupMessages = new ArrayList<>();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from initgroupmessagetable");
        while (resultSet.next()) {
            GroupMessage groupMessage = new GroupMessage();
            groupMessage.setId(resultSet.getInt("id"));
            groupMessage.setGroup_name(resultSet.getString("group_name"));
            groupMessage.setSender(resultSet.getString("sender"));
            groupMessage.setText(resultSet.getString("text"));
            groupMessage.setReplied(resultSet.getString("replied?"));
            groupMessage.setWhome_replied(resultSet.getString("whome_replied?"));
            groupMessage.setWhat_replied(resultSet.getString("what_replied?"));
            groupMessage.setForwarded(resultSet.getString("forwarded?"));
            groupMessage.setForwarded_of_where(resultSet.getString("forwarded_of_where?"));
            groupMessage.setEdited(resultSet.getString("edited?"));
            groupMessage.setTime(resultSet.getString("time"));
            groupMessages.add(groupMessage);
        }
        statement.close();
        return groupMessages;
    }
}
