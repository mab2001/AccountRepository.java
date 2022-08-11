package repository;

import entity.PrivateChat;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PrivateChatRepository {
    public static List<PrivateChat> showAllPrivateChats(Connection connection) throws SQLException {
        List<PrivateChat> privateChats = new ArrayList<>();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from initprivatechattable");
        while (resultSet.next()) {
            PrivateChat privateChat = new PrivateChat();
            privateChat.setPrivatechatId(resultSet.getInt("privatechatId"));
            privateChat.setPrivatechatOwner(resultSet.getString("privatechatOwner"));
            privateChat.setPrivatechatSender(resultSet.getString("privatechatSender"));
            privateChat.setPrivatechatMessagesNumber(resultSet.getInt("privatechatMessagesNumber"));
            privateChat.setPrivatechatCreateTime(resultSet.getString("privatechatCreateTime"));
            privateChat.setPrivatechatMuteType(resultSet.getString("privatechatMuteType"));
            privateChat.setPrivatechatBlockType(resultSet.getString("privatechatBlockType"));
            privateChats.add(privateChat);
        }
        statement.close();
        return privateChats;
    }
}
