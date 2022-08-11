package utils;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseInitializer {

    public void createTables(Connection connection) throws SQLException {
        initaccounttable(connection.createStatement());
        initadmintable(connection.createStatement());
        initbannedtable(connection.createStatement());
        initblocktable(connection.createStatement());
        initclosefriendtable(connection.createStatement());
        initcommenttable(connection.createStatement());
        initfavoritetable(connection.createStatement());
        initfollowtable(connection.createStatement());
        initgmailtable(connection.createStatement());
        initgroupmessagetable(connection.createStatement());
        initgrouptable(connection.createStatement());
        initkickedtable(connection.createStatement());
        initlikecommenttable(connection.createStatement());
        initlikesposttable(connection.createStatement());
        initmembertable(connection.createStatement());
        initmutedtable(connection.createStatement());
        initpagesviewtable(connection.createStatement());
        initposttable(connection.createStatement());
        initprivatechatmessagetable(connection.createStatement());
        initprivatechattable(connection.createStatement());
        initprofiletable(connection.createStatement());
        initreportedtable(connection.createStatement());
        initsmstable(connection.createStatement());
        initviewposttable(connection.createStatement());
    }

    private void initprivatechattable(Statement statement) throws SQLException {
        statement.executeUpdate("CREATE TABLE IF NOT EXISTS"+
                "PrivateChat(privatechatId int NOT NULL AUTO_INCREMENT, " +
                "privatechatOwner varchar(255), " +
                "privatechatSender varchar(255), " +
                "privatechatMessagesNumber varchar(255), " +
                "privatechatCreateTime varchar(255), " +
                "privatechatMuteType varchar(255), " +
                "privatechatBlockType varchar(255), " +
                "PRIMARY KEY (id)");
        statement.close();}

    private void initviewposttable(Statement statement) throws SQLException {
        statement.executeUpdate("CREATE TABLE IF NOT EXISTS"+
                "ViewPost(id int NOT NULL AUTO_INCREMENT, " +
                "post_owner varchar(255), " +
                "number_of_post varchar(255), " +
                "visitor varchar(255), " +
                "time varchar(255), " +
                "PRIMARY KEY (id)");
                statement.close();}

    private void initsmstable(Statement statement) throws SQLException {
        statement.executeUpdate("CREATE TABLE IF NOT EXISTS"+
                "Sms(id int NOT NULL AUTO_INCREMENT, " +
                "sms_owner varchar(255), " +
                "sms_text varchar(255), " +
                "time varchar(255), " +
                "PRIMARY KEY (id)");
                statement.close();}

    private void initreportedtable(Statement statement) throws SQLException {
        statement.executeUpdate("CREATE TABLE IF NOT EXISTS"+
                "Reported(id int NOT NULL AUTO_INCREMENT, " +
                "reported_group varchar(255), " +
                "who_reported? varchar(255), " +
                "time varchar(255), " +
                "PRIMARY KEY (id)");
                statement.close();}

    private void initprofiletable(Statement statement) throws SQLException {
        statement.executeUpdate("CREATE TABLE IF NOT EXISTS"+
                "Profile(id int NOT NULL AUTO_INCREMENT, " +
                "nickname varchar(255), " +
                "username varchar(255), " +
                "bio varchar(255), " +
                "Gender varchar(255), " +
                "birthday varchar(255), " +
                "post_number varchar(255), " +
                "follower_number varchar(255), " +
                "following_number varchar(255), " +
                "PRIMARY KEY (id)");
                statement.close();}

    private void initprivatechatmessagetable(Statement statement) throws SQLException {
        statement.executeUpdate("CREATE TABLE IF NOT EXISTS"+
                "PrivateChatMessage(id int NOT NULL AUTO_INCREMENT, "  +
                "chat_owner varchar(255), " +
                "sender varchar(255), " +
                "text varchar(255), " +
                "replied? varchar(255), " +
                "whome_replied? varchar(255), " +
                "what_replied? varchar(255), " +
                "forwarded? varchar(255), " +
                "forwarded_of_where? varchar(255), " +
                "edited? varchar(255), " +
                "time varchar(255), " +
                "PRIMARY KEY (id)");
                statement.close();}

    private void initposttable(Statement statement) throws SQLException {
        statement.executeUpdate("CREATE TABLE IF NOT EXISTS" +
                "Post(postID int NOT NULL AUTO_INCREMENT, " +
                "post_owner varchar(255), " +
                "number_of_post varchar(255), " +
                "has_ad? varchar(255), " +
                "text varchar(255), " +
                "is_it_edited? varchar(255), " +
                "like_number varchar(255), " +
                "view_number varchar(255), " +
                "comment_number varchar(255), " +
                "time varchar(255), " +
                "PRIMARY KEY (id)");
                statement.close();}

    private void initpagesviewtable(Statement statement) throws SQLException {
        statement.executeUpdate("CREATE TABLE IF NOT EXISTS"+
                "PagesView(id int NOT NULL AUTO_INCREMENT, " +
                "post_owner varchar(255), " +
                "visitor varchar(255), " +
                "time varchar(255), " +
                "PRIMARY KEY (id)");
                statement.close();}

    private void initmutedtable(Statement statement) throws SQLException {
        statement.executeUpdate("CREATE TABLE IF NOT EXISTS"+
                "Muted(id int NOT NULL AUTO_INCREMENT, " +
                "who_muted? varchar(255), " +
                "muted varchar(255), " +
                "time varchar(255), " +
                "PRIMARY KEY (id)");
                statement.close();}

    private void initmembertable(Statement statement) throws SQLException {
        statement.executeUpdate("CREATE TABLE IF NOT EXISTS"+
                "Member(id int NOT NULL AUTO_INCREMENT, " +
                "group_name varchar(255), " +
                "member_name varchar(255), " +
                "who_added? varchar(255), " +
                "time varchar(255), " +
                "PRIMARY KEY (id)");
                statement.close();}

    private void initlikesposttable(Statement statement) throws SQLException {
        statement.executeUpdate("CREATE TABLE IF NOT EXISTS"+
                "LikesPost(id int NOT NULL AUTO_INCREMENT, " +
                "post_owner varchar(255), " +
                "number_of_post varchar(255), " +
                "who_liked? varchar(255), " +
                "time varchar(255), " +
                "PRIMARY KEY (id)");
                statement.close();}

    private void initlikecommenttable(Statement statement) throws SQLException {
        statement.executeUpdate("CREATE TABLE IF NOT EXISTS"+
                "LikeComment(id int NOT NULL AUTO_INCREMENT, " +
                "post_owner varchar(255), " +
                "number_of_post varchar(255), " +
                "number_of_comment varchar(255), " +
                "who_liked? varchar(255), " +
                "time varchar(255), " +
                "PRIMARY KEY (id)");
                statement.close();}

    private void initkickedtable(Statement statement) throws SQLException {
        statement.executeUpdate("CREATE TABLE IF NOT EXISTS"+
                "Kicked(id int NOT NULL AUTO_INCREMENT, " +
                "group_name varchar(255), " +
                "who_kicked? varchar(255), " +
                "kicked varchar(255), " +
                "time varchar(255), " +
                "PRIMARY KEY (id)");
                statement.close();}

    private void initgrouptable(Statement statement) throws SQLException {
        statement.executeUpdate("CREATE TABLE IF NOT EXISTS"+
                "Group(groupId int NOT NULL AUTO_INCREMENT, " +
                "groupName varchar(255), " +
                "groupType(public or private?) varchar(255), " +
                "groupCreator varchar(255), " +
                "groupAdminsNumber varchar(255), "+
                "groupMembersNumber varchar(255), "+
                "groupBio varchar(255), "+
                "groupCreateTime varchar(255), " +
                "PRIMARY KEY (id)");
                statement.close();}

    private void initgroupmessagetable(Statement statement) throws SQLException {
        statement.executeUpdate("CREATE TABLE IF NOT EXISTS"+
                "GroupMessage(id int NOT NULL AUTO_INCREMENT, " +
                "group_name varchar(255), " +
                "sender varchar(255), " +
                "text varchar(255), " +
                "replied? varchar(255), " +
                "whome_replied? varchar(255), " +
                "what_replied? varchar(255), " +
                "forwarded? varchar(255), " +
                "forwarded_of_where? varchar(255), " +
                "edited? varchar(255), " +
                "time varchar(255), " +
                "PRIMARY KEY (id)");
                statement.close();}

    private void initgmailtable(Statement statement) throws SQLException {
        statement.executeUpdate("CREATE TABLE IF NOT EXISTS"+
                "Gmail(id int NOT NULL AUTO_INCREMENT, " +
                "Gmail_owner varchar(255), " +
                "Gmail_text varchar(255), " +
                "time varchar(255), " +
                "PRIMARY KEY (id)");
                statement.close();}

    private void initfollowtable(Statement statement) throws SQLException {
        statement.executeUpdate("CREATE TABLE IF NOT EXISTS"+
                "entity.Follow(id int NOT NULL AUTO_INCREMENT, " +
                "following varchar(255), " +
                "who_followed? varchar(255), " +
                "time varchar(255), " +
                "PRIMARY KEY (id)");
                statement.close();}

    private void initfavoritetable(Statement statement) throws SQLException {
        statement.executeUpdate("CREATE TABLE IF NOT EXISTS"+
                "Favorite(id int NOT NULL AUTO_INCREMENT, " +
                "who_favorited? varchar(255), " +
                "favorite varchar(255), " +
                "PRIMARY KEY (id)");
                statement.close();}

    private void initcommenttable(Statement statement) throws SQLException {
        statement.executeUpdate("CREATE TABLE IF NOT EXISTS"+
                "Comment(id int NOT NULL AUTO_INCREMENT, " +
                "post_owner varchar(255), " +
                "number_of_post varchar(255), " +
                "number_of_comment varchar(255), " +
                "sender varchar(255), " +
                "comment_text varchar(255), " +
                "like_number varchar(255), " +
                "time varchar(255), " +
                "PRIMARY KEY (id)");
                statement.close();}

    private void initclosefriendtable(Statement statement) throws SQLException {
        statement.executeUpdate("CREATE TABLE IF NOT EXISTS"+
                "CloseFriend(id int NOT NULL AUTO_INCREMENT, " +
                "who_friended? varchar(255), " +
                "friend varchar(255), " +
                "PRIMARY KEY (id)");
                statement.close();}

    private void initblocktable(Statement statement) throws SQLException {
        statement.executeUpdate("CREATE TABLE IF NOT EXISTS"+
                "Block(id int NOT NULL AUTO_INCREMENT, " +
                "who_blocked? varchar(255), " +
                "blocked varchar(255), " +
                "time varchar(255), " +
                "PRIMARY KEY (id)");
                statement.close();}

    private void initbannedtable(Statement statement) throws SQLException {
        statement.executeUpdate("CREATE TABLE IF NOT EXISTS"+
                "Banned(id int NOT NULL AUTO_INCREMENT, " +
                "group_name varchar(255), " +
                "banned varchar(255), " +
                "who_banned? varchar(255), " +
                "time varchar(255), " +
                "PRIMARY KEY (id)");
                statement.close();
    }

    private void initadmintable(Statement statement) throws SQLException {
        statement.executeUpdate("CREATE TABLE IF NOT EXISTS"+
                "Admin(id int NOT NULL AUTO_INCREMENT, " +
                "group_name varchar(255), " +
                "admin_name varchar(255), " +
                "who_admined? varchar(255), " +
                "time varchar(255), " +
                "PRIMARY KEY (id)");
                statement.close();
    }

    private void initaccounttable(Statement statement) throws SQLException {
        statement.executeUpdate("CREATE TABLE IF NOT EXISTS " +
                "Account(id int NOT NULL AUTO_INCREMENT, " +
                "username varchar(255), " +
                "password varchar(255), " +
                "mobile_phone_number varchar(255), " +
                "Gmail varchar(255), " +
                "type_of_account varchar(255), " +
                "last_seen varchar(255), " +
                "accountCreateTime varchar(255), " +
                "PRIMARY KEY (id)");
        statement.close();
    }

}
