package repository;

import entity.User;
import utils.ApplicationContext;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AccountRepository {

    public static List<User> showAllAccounts(Connection connection) throws SQLException {
        List<User> users = new ArrayList<>();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from initAccountTable");
        while (resultSet.next()){
            User user = new User();
            user.setUserId(resultSet.getInt("id"));
            user.setUserName(resultSet.getString("username"));
            user.setUserPassWord(resultSet.getString("password"));
            user.setUserMobilePhoneNumber(resultSet.getInt("mobile_phone_number"));
            user.setUserGmail(resultSet.getString("Gmail"));
            user.setUserAccountType(resultSet.getString("type_of_account"));
            user.setUserLastSeen(resultSet.getString("last_seen"));
            user.setUserCreateAccountTime(resultSet.getInt("accountCreateTime"));
            users.add(user);
        }
        statement.close();
        return users;
    }
    public void insertUser(Connection connection) {
        ApplicationContext.getAccountRepository();
        User user = new User();
        System.out.println("enter your username:");
        System.out.println("username cant have space init");
        user.setUserName(ApplicationContext.getStringScanner().nextLine());
        System.out.println("enter your password:");
        System.out.println("password can be from a-z , A-Z , 0-9 , @ and _ ");
        System.out.println("and should be atLeast 8 characters");
        String password1 = ApplicationContext.getStringScanner().nextLine();
        System.out.println("please enter password again");
        String password2 = ApplicationContext.getStringScanner().nextLine();
        if (password1.equals(password2)) {
            user.setUserPassWord(password2);
        } else {
            System.out.println("two password don't match : please try again");
            String password3 = ApplicationContext.getStringScanner().nextLine();
            System.out.println("please enter password again");
            String password4 = ApplicationContext.getStringScanner().nextLine();
            user.setUserPassWord(password3);
        }
        System.out.println(":برای بازیابی شماره تلفن همراه خود را وارد نمایید");
        System.out.println("یک عدد 11 رقمی که فراموش نخواهید کرد");
        user.setUserMobilePhoneNumber(ApplicationContext.getNumberScanner().nextInt());
        System.out.println(":برای بازیابی جیمیل خود را وارد نمایید");
        System.out.println("داشته باشد@gmail.comباید");
        user.setUserGmail(ApplicationContext.getStringScanner().nextLine());
        System.out.println("enter your AccountType(you should write regular or commercial):");
        String accountType = ApplicationContext.getStringScanner().nextLine();
        if (accountType.equals("regular")) {
            user.setUserAccountType("regular");
        } else if (accountType.equals("commercial")) {
            user.setUserAccountType("commercial");
        } else {
            System.out.println("try again");
            user.setUserAccountType("regular");
        }
    }
}
