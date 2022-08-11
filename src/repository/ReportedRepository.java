package repository;

import entity.Reported;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ReportedRepository {
    public static List<Reported> showAllReporteds(Connection connection) throws SQLException {
        List<Reported> reporteds = new ArrayList<>();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from initreportedtable");
        while (resultSet.next()) {
            Reported reported = new Reported();
            reported.setId(resultSet.getInt("id"));
            reported.setReported_group(resultSet.getString("reported_group"));
            reported.setWho_reported(resultSet.getString("who_reported?"));
            reported.setTime(resultSet.getString("time"));
            reporteds.add(reported);
        }
        statement.close();
        return reporteds;
    }
}
