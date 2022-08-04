import entity.User;

import java.sql.*;

public class SqlJar {
    public  Connection Connect() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root",
                    "mab2000mahdimab@");
            return connection;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return null;
        }

    }

    public boolean InsertUser(User user){
        try {
            Statement statement = Connect().createStatement();
            boolean status = statement.execute("INSERT INTO "+STR_VALUES.ACCOUNTS_TABLE+" (username,password,mobile_phone_number,Gmail,type_of_account,accountCreateTime) " +
                    "VALUES  ("
                    +user.getUserName()
                    +","+user.getUserPassWord()
                    +","+user.getUserPhoneNumber()
                    +","+user.getUserGmail()
                    +","+user.getUserAccountType()
                    +","+user.getUserAccountCreateTime());
            statement.close();
            return status;
        } catch (SQLException e) {
            System.out.print("Insert User Failed! :");
            e.printStackTrace();
            return false;
        }
    }
}
