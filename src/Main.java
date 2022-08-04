import entity.User;
import repository.AccountRepository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*try {

            List<User> users= AccountRepository.showAllAccounts(mySqlJar.Connect());
            for (int i=1;i<=users.size();i++){
                System.out.println(users.get(i-1).getUserName());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }*/
        Authorization.CreateAnAccount();



    }


}
