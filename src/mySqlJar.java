import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class mySqlJar {
    public static Connection Connect() {

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
}
