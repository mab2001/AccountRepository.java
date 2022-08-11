package repository;

import entity.Sms;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SmsRepository {
    public static List<Sms> showAllSmss(Connection connection) throws SQLException {
        List<Sms> smss = new ArrayList<>();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from initsmstable");
        while (resultSet.next()) {
            Sms sms = new Sms();
            sms.setId(resultSet.getInt("id"));
            sms.setSms_owner(resultSet.getString("sms_owner"));
            sms.setSms_text(resultSet.getString("sms_text"));
            sms.setTime(resultSet.getString("time"));
            smss.add(sms);
        }
        statement.close();
        return smss;
    }
}
