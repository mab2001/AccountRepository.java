package repository;

import entity.Banned;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BannedRepository {

    public static List<Banned> showAllBanneds(Connection connection) throws SQLException {
        List<Banned> banneds = new ArrayList<>();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from initbannedtable");
        while (resultSet.next()) {
            Banned banned = new Banned();
            banned.setId(resultSet.getInt("id"));
            banned.setGroup_name(resultSet.getString("group_name"));
            banned.setBanned(resultSet.getString("banned"));
            banned.setWho_banned(resultSet.getString("who_banned?"));
            banned.setTime(resultSet.getString("time"));
            banneds.add(banned);
        }
        statement.close();
        return banneds;
    }
}
