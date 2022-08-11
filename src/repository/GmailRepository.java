package repository;

import entity.Gmail;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class GmailRepository {
    public static List<Gmail> showAllGmails(Connection connection) throws SQLException {
        List<Gmail> gmails = new ArrayList<>();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from initgmailtable");
        while (resultSet.next()) {
            Gmail gmail = new Gmail();
            gmail.setId(resultSet.getInt("id"));
            gmail.setGmail_owner(resultSet.getString("Gmail_owner"));
            gmail.setGmail_text(resultSet.getString("Gmail_text"));
            gmail.setTime(resultSet.getString("time"));
            gmails.add(gmail);
        }
        statement.close();
        return gmails;
    }
}
