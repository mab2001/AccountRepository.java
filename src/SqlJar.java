import entity.*;

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

    public boolean InsertUser(User user) {
        try {
            Statement statement = Connect().createStatement();
            String sql = "INSERT INTO " + STR_VALUES.ACCOUNTS_TABLE + " (group_name,password,mobile_phone_number,Gmail,type_of_account,accountCreateTime) " +
                    "VALUES  ('"
                    + user.getUserName() + "'"
                    + ",'" + user.getUserPassWord() + "'"
                    + ",'" + user.getUserPhoneNumber() + "'"
                    + ",'" + user.getUserGmail() + "'"
                    + ",'" + user.getUserAccountType() + "'"
                    + ",'" + user.getUserLastSeen() + "'"
                    + ",'" + user.getUserAccountCreateTime() + "')";
            statement.execute(sql);
            statement.close();
            return true;
        } catch (SQLException e) {
            System.out.print("Insert User Failed! :");
            e.printStackTrace();
            return false;
        }
    }
    public boolean InsertAdmin(Admin admin) {
        try {
            Statement statement = Connect().createStatement();
            String sql = "INSERT INTO " + STR_VALUES.ADMIN_TABLE + " (username,admin_name,who_admined?,time) " +
                    "VALUES  ('"
                    + admin.getGroup_name() + "'"
                    + ",'" + admin.getAdmin_name() + "'"
                    + ",'" + admin.getWho_admined() + "'"
                    + ",'" + admin.getTime() + "')";
            statement.execute(sql);
            statement.close();
            return true;
        } catch (SQLException e) {
            System.out.print("Insert Admin Failed! :");
            e.printStackTrace();
            return false;
        }
    }
    public boolean InsertBanned(Banned banned) {
        try {
            Statement statement = Connect().createStatement();
            String sql = "INSERT INTO " + STR_VALUES.BANNED_TABLE + " (group_name,banned,who_banned?,time) " +
                    "VALUES  ('"
                    + banned.getGroup_name() + "'"
                    + ",'" + banned.getBanned() + "'"
                    + ",'" + banned.getWho_banned() + "'"
                    + ",'" + banned.getTime() + "')";
            statement.execute(sql);
            statement.close();
            return true;
        } catch (SQLException e) {
            System.out.print("Insert Banned Failed! :");
            e.printStackTrace();
            return false;
        }
    }
    public boolean InsertBlocked(Blocked blocked) {
        try {
            Statement statement = Connect().createStatement();
            String sql = "INSERT INTO " + STR_VALUES.BLOCK_TABLE + " (who_blocked?,blocked,time) " +
                    "VALUES  ('"
                    + blocked.getWho_blocked() + "'"
                    + ",'" + blocked.getBlocked() + "'"
                    + ",'" + blocked.getTime() + "')";
            statement.execute(sql);
            statement.close();
            return true;
        } catch (SQLException e) {
            System.out.print("Insert Blocked Failed! :");
            e.printStackTrace();
            return false;
        }
    }
    public boolean InsertCloseFriend(CloseFriend closeFriend) {
        try {
            Statement statement = Connect().createStatement();
            String sql = "INSERT INTO " + STR_VALUES.CLOSE_FRIEND_TABLE + " (who_friended?,friend) " +
                    "VALUES  ('"
                    + closeFriend.getWho_friended() + "'"
                    + ",'" + closeFriend.getFriend() + "')";
            statement.execute(sql);
            statement.close();
            return true;
        } catch (SQLException e) {
            System.out.print("Insert CloseFriend Failed! :");
            e.printStackTrace();
            return false;
        }
    }
    public boolean InsertComment(Comment comment) {
        try {
            Statement statement = Connect().createStatement();
            String sql = "INSERT INTO " + STR_VALUES.COMMENT_TABLE + " (post_owner,number_of_post,number_of_comment,sender,comment_text,like_number,time) " +
                    "VALUES  ('"
                    + comment.getPost_owner() + "'"
                    + ",'" + comment.getNumber_of_post() + "'"
                    + ",'" + comment.getNumber_of_comment() + "'"
                    + ",'" + comment.getSender() + "'"
                    + ",'" + comment.getComment_text() + "'"
                    + ",'" + comment.getLike_number() + "'"
                    + ",'" + comment.getCommentTime() + "')";
            statement.execute(sql);
            statement.close();
            return true;
        } catch (SQLException e) {
            System.out.print("Insert Comment Failed! :");
            e.printStackTrace();
            return false;
        }
    }
    public boolean InsertFavorite(Favorites favorites) {
        try {
            Statement statement = Connect().createStatement();
            String sql = "INSERT INTO " + STR_VALUES.FAVORITE_TABLE + " (who_favorited?,favorite) " +
                    "VALUES  ('"
                    + favorites.getWho_favorited() + "'"
                    + ",'" + favorites.getFavorite() + "')";
            statement.execute(sql);
            statement.close();
            return true;
        } catch (SQLException e) {
            System.out.print("Insert Favorite Failed! :");
            e.printStackTrace();
            return false;
        }
    }
    public boolean InsertFollow(Follow follow) {
        try {
            Statement statement = Connect().createStatement();
            String sql = "INSERT INTO " + STR_VALUES.FOLLOW_TABLE + " (following,who_followed?) " +
                    "VALUES  ('"
                    + follow.getFollowing() + "'"
                    + ",'" + follow.getWho_followed() + "')";
            statement.execute(sql);
            statement.close();
            return true;
        } catch (SQLException e) {
            System.out.print("Insert Follow Failed! :");
            e.printStackTrace();
            return false;
        }
    }
    public boolean InsertGmail(Gmail gmail) {
        try {
            Statement statement = Connect().createStatement();
            String sql = "INSERT INTO " + STR_VALUES.GMAIL_TABLE + " (Gmail_owner,Gmail_text,time) " +
                    "VALUES  ('"
                    + gmail.getGmail_owner() + "'"
                    + ",'" + gmail.getGmail_text() + "'"
                    + ",'" + gmail.getTime() + "')";
            statement.execute(sql);
            statement.close();
            return true;
        } catch (SQLException e) {
            System.out.print("Insert Gmail Failed! :");
            e.printStackTrace();
            return false;
        }
    }
    public boolean InsertGroupMessage(GroupMessage groupMessage) {
        try {
            Statement statement = Connect().createStatement();
            String sql = "INSERT INTO " + STR_VALUES.GROUP_MESSAGE_TABLE + " (group_name,sender,text,replied?,whome_replied?,what_replied?,forwarded?,forwarded_of_where?,edited?,time) " +
                    "VALUES  ('"
                    + groupMessage.getGroup_name() + "'"
                    + ",'" + groupMessage.getSender() + "'"
                    + ",'" + groupMessage.getText() + "'"
                    + ",'" + groupMessage.getReplied() + "'"
                    + ",'" + groupMessage.getWhome_replied() + "'"
                    + ",'" + groupMessage.getWhat_replied() + "'"
                    + ",'" + groupMessage.getForwarded() + "'"
                    + ",'" + groupMessage.getForwarded_of_where() + "'"
                    + ",'" + groupMessage.getEdited() + "'"
                    + ",'" + groupMessage.getTime() + "')";
            statement.execute(sql);
            statement.close();
            return true;
        } catch (SQLException e) {
            System.out.print("Insert GroupMessage Failed! :");
            e.printStackTrace();
            return false;
        }
    }
}
