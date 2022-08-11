package repository;

import entity.Blocked;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BlockRepository {

    public static List<Blocked> showAllBlockeds(Connection connection) throws SQLException {
        List<Blocked> blockeds = new ArrayList<>();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from initblocktable");
        while (resultSet.next()) {
            Blocked blocked = new Blocked();
            blocked.setId(resultSet.getInt("id"));
            blocked.setWho_blocked(resultSet.getString("who_blocked?"));
            blocked.setBlocked(resultSet.getString("blocked"));
            blocked.setTime(resultSet.getString("time"));
            blockeds.add(blocked);
        }
        statement.close();
        return blockeds;
    }
}
