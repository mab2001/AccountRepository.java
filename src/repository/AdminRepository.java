package repository;

import entity.Admin;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AdminRepository {

    public static List<Admin> showAllAdmins(Connection connection) throws SQLException {
        List<Admin> admins = new ArrayList<>();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from initadmintable");
        while (resultSet.next()) {
            Admin admin = new Admin();
            admin.setId(resultSet.getInt("id"));
            admin.setGroup_name(resultSet.getString("group_name"));
            admin.setAdmin_name(resultSet.getString("admin_name"));
            admin.setWho_admined(resultSet.getString("who_admined?"));
            admin.setTime(resultSet.getString("time"));
            admins.add(admin);
        }
        statement.close();
        return admins;
    }
}
