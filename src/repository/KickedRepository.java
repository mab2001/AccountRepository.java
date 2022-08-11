package repository;

import entity.Kicked;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class KickedRepository {
    public static List<Kicked> showAllKickeds(Connection connection) throws SQLException {
        List<Kicked> kickeds = new ArrayList<>();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from initkickedtable");
        while (resultSet.next()) {
            Kicked kicked = new Kicked();
            kicked.setId(resultSet.getInt("id"));
            kicked.setGroup_name(resultSet.getString("group_name"));
            kicked.setWho_kicked(resultSet.getString("who_kicked?"));
            kicked.setKicked(resultSet.getString("kicked"));
            kicked.setTime(resultSet.getString("time"));
            kickeds.add(kicked);
        }
        statement.close();
        return kickeds;
    }
}
