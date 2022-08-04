import entity.User;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Authorization {

    public static void CreateAnAccount(){
        Scanner scanner = new Scanner(System.in);
        User user = new User();

        user.setUserName(getUserName(scanner, user));
        user.setUserPassWord(getPassword(scanner,user));
        user.setUserPhoneNumber(getPhoneNumber(scanner,user));
        user.setUserGmail(getGmail(scanner,user));
        user.setUserAccountType(getAccountType(scanner,user));
        user.setUserAccountCreateTime(getAccountCreateTime());

        /*System.out.println(user.getUserName());
        System.out.println(user.getUserPassWord());
        System.out.println(user.getUserPhoneNumber());
        System.out.println(user.getUserGmail());
        System.out.println(user.getUserAccountType());
        System.out.println(user.getUserAccountCreateTime());*/

        SqlJar sqlJar=new SqlJar();
        boolean status = sqlJar.InsertUser(user);
        if (status) System.out.println("Your Account is Created Successfully. Welcome!");
        else System.out.println("Unfortunately A Problem Has Occurred.");


    }

    private static String getAccountCreateTime() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDateTime now = LocalDateTime.now();
        return now.format(dtf);
    }

    private static String getAccountType(Scanner scanner,User user) {
        System.out.println("Select your AccountType:");
        System.out.println("-Type 1 For \"regular\"");
        System.out.println("-Type 2 For \"commercial\"");

        int accountType = scanner.nextInt();
         while (!(accountType==1 || accountType==2)){
             System.out.println("Invalid Command! Please Try Again");
             accountType=scanner.nextInt();
         }

        if (accountType==1) {
            System.out.println("You Chose regular");
            return "regular";
        }else {
            System.out.println("You Chose commercial");
            return "commercial";
        }
    }

    private static String getGmail(Scanner scanner,User user)  {
        System.out.println(":برای بازیابی جیمیل خود را وارد نمایید");
        //System.out.println("داشته باشد@gmail.comباید");
        return scanner.nextLine();
        //TODO Gmail must be Checked for prohibited characters

    }

    private static String getPhoneNumber(Scanner scanner,User user) {
        System.out.println(":برای بازیابی شماره تلفن همراه خود را وارد نمایید");
        System.out.println("یک عدد 11 رقمی که فراموش نخواهید کرد");
        return scanner.nextLine();
        //TODO PhoneNumber must be Checked for prohibited characters
    }

    private static String getPassword(Scanner scanner,User user) {
        System.out.println("Enter Your Desired Password:");
        //System.out.println("password can be from a-z , A-Z , 0-9 , @ and _ ");
        //System.out.println("and should be atLeast 8 characters");
        String password1 = scanner.nextLine();
        //TODO Password must be Checked for prohibited characters

        System.out.println("Please Enter Your Password Again");
        String password2 = scanner.nextLine();
        if (password1.equals(password2)) {
            return password2;
        } else {
            System.out.println("the two passwords don't match, please try again");
            String password3 = scanner.nextLine();
            while (!password3.equals(password1)) {
                System.out.println("the two passwords don't match, please try again");
                password3 = scanner.nextLine();
            }
            return password3;
        }
    }

    private static String getUserName(Scanner scanner, User user) {
        System.out.println("Enter Your Desired username:");
        System.out.println("UserName Can't Have Space");
        return scanner.nextLine();
        //TODO Check if The Chosen Username is Duplicate
    }
}
