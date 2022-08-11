package repository;

import entity.Muted;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MutedRepository {
    public static List<Muted> showAllMuteds(Connection connection) throws SQLException {
        List<Muted> muteds = new ArrayList<>();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from initmutedtable");
        while (resultSet.next()) {
            Muted muted = new Muted();
            muted.setId(resultSet.getInt("id"));
            muted.setWho_muted(resultSet.getString("who_muted?"));
            muted.setMuted(resultSet.getString("muted"));
            muted.setTime(resultSet.getString("time"));
            muteds.add(muted);
        }
        statement.close();
        return muteds;
    }
}
