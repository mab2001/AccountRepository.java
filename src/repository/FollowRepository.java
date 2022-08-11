package repository;

import entity.Follow;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class FollowRepository {
    public static List<Follow> showAllFollows(Connection connection) throws SQLException {
        List<Follow> follows = new ArrayList<>();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from initfollowtable");
        while (resultSet.next()) {
            Follow follow = new Follow();
            follow.setId(resultSet.getInt("id"));
            follow.setFollowing(resultSet.getString("following"));
            follow.setWho_followed(resultSet.getString("who_followed?"));
            follow.setTime(resultSet.getString("time"));
            follows.add(follow);
        }
        statement.close();
        return follows;
    }
}
