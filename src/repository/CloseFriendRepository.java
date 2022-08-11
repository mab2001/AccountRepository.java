package repository;

import entity.CloseFriend;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CloseFriendRepository {

    public static List<CloseFriend> showAllCloseFriends(Connection connection) throws SQLException {
        List<CloseFriend> friends = new ArrayList<>();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from initclosefriendtable");
        while (resultSet.next()) {
            CloseFriend friend = new CloseFriend();
            friend.setId(resultSet.getInt("id"));
            friend.setWho_friended(resultSet.getString("who_friended?"));
            friend.setFriend(resultSet.getString("friend"));
            friend.setTime(resultSet.getString("time"));
            friends.add(friend);
        }
        statement.close();
        return friends;
    }
}
