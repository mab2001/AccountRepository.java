package utils;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseInitializer {

    public void createTables(Connection connection) throws SQLException {
        initaccounttable(connection.createStatement());
        initadminetable(connection.createStatement());
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
        initprofiletable(connection.createStatement());
        initreportedtable(connection.createStatement());
        initsmstable(connection.createStatement());
        initviewposttable(connection.createStatement());
    }

    private void initviewposttable(Statement statement) throws SQLException {
        statement.executeUpdate("CREATE TABLE IF NOT EXISTS"+
                "ViewPost(id int NOT NULL AUTO_INCREMENT, " +
                "پست کیه؟ varchar(255), " +
                "پست چندمه؟ varchar(255), " +
                "کی دیده؟ varchar(255), " +
                "زمان دقیق varchar(255), " +
                "PRIMARY KEY (id)");
                statement.close();}

    private void initsmstable(Statement statement) throws SQLException {
        statement.executeUpdate("CREATE TABLE IF NOT EXISTS"+
                "Sms(id int NOT NULL AUTO_INCREMENT, " +
                "برای کی رفته؟ varchar(255), " +
                "متن sms varchar(255), " +
                "زمان دقیق varchar(255), " +
                "PRIMARY KEY (id)");
                statement.close();}

    private void initreportedtable(Statement statement) throws SQLException {
        statement.executeUpdate("CREATE TABLE IF NOT EXISTS"+
                "Reported(id int NOT NULL AUTO_INCREMENT, " +
                "نام گروه ریپورت شده varchar(255), " +
                "کی ریپورت کرده؟ varchar(255), " +
                "زمان ریپورت varchar(255), " +
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
                "تعداد پست varchar(255), " +
                "تعداد فالور varchar(255), " +
                "تعداد فالوینگ varchar(255), " +
                "PRIMARY KEY (id)");
                statement.close();}

    private void initprivatechatmessagetable(Statement statement) throws SQLException {
        statement.executeUpdate("CREATE TABLE IF NOT EXISTS"+
                "PrivateChatMessage(id int NOT NULL AUTO_INCREMENT, "  +
                "کی - کی varchar(255), " +
                "فرستنده کیه varchar(255), " +
                "متن چیه varchar(255), " +
                "ریپلای شده؟ varchar(255), " +
                "از کی ریپلای شده؟ varchar(255), " +
                "از چ متنی ریپلای شده؟ varchar(255), " +
                "فروارد شده؟ varchar(255), " +
                "از کجا فروارد شده؟ varchar(255), " +
                "ادیت شده؟ varchar(255), " +
                "زمان دقیق پیام varchar(255), " +
                "PRIMARY KEY (id)");
                statement.close();}

    private void initposttable(Statement statement) throws SQLException {
        statement.executeUpdate("CREATE TABLE IF NOT EXISTS" +
                "Post(id int NOT NULL AUTO_INCREMENT, " +
                "پست کیه varchar(255), " +
                "پست چندمه varchar(255), " +
                "ad داره؟ varchar(255), " +
                "متن varchar(255), " +
                "ادیت شده؟ varchar(255), " +
                "تعداد لایک varchar(255), " +
                "تعداد بازدید varchar(255), " +
                "تعداد کامنت varchar(255), " +
                "زمان دقیق پست varchar(255), " +
                "PRIMARY KEY (id)");
                statement.close();}

    private void initpagesviewtable(Statement statement) throws SQLException {
        statement.executeUpdate("CREATE TABLE IF NOT EXISTS"+
                "PagesView(id int NOT NULL AUTO_INCREMENT, " +
                "پیج کیه varchar(255), " +
                "کی دیده varchar(255), " +
                "زمان دقیق varchar(255), " +
                "PRIMARY KEY (id)");
                statement.close();}

    private void initmutedtable(Statement statement) throws SQLException {
        statement.executeUpdate("CREATE TABLE IF NOT EXISTS"+
                "Muted(id int NOT NULL AUTO_INCREMENT, " +
                "کی میوت شده؟ varchar(255), " +
                "کی میوت کرده؟ varchar(255), " +
                "زمان میوت varchar(255), " +
                "PRIMARY KEY (id)");
                statement.close();}

    private void initmembertable(Statement statement) throws SQLException {
        statement.executeUpdate("CREATE TABLE IF NOT EXISTS"+
                "Member(id int NOT NULL AUTO_INCREMENT, " +
                "نام گروه varchar(255), " +
                "نام عضو varchar(255), " +
                "کی ادد کرده؟ varchar(255), " +
                "زمان ادد شدن varchar(255), " +
                "PRIMARY KEY (id)");
                statement.close();}

    private void initlikesposttable(Statement statement) throws SQLException {
        statement.executeUpdate("CREATE TABLE IF NOT EXISTS"+
                "LikesPost(id int NOT NULL AUTO_INCREMENT, " +
                "پست کیه varchar(255), " +
                "پست چندمه varchar(255), " +
                "کی لایک کرده varchar(255), " +
                "زمان دقیق لایک varchar(255), " +
                "PRIMARY KEY (id)");
                statement.close();}

    private void initlikecommenttable(Statement statement) throws SQLException {
        statement.executeUpdate("CREATE TABLE IF NOT EXISTS"+
                "LikeComment(id int NOT NULL AUTO_INCREMENT, " +
                "پست کیه varchar(255), " +
                "پست چندمه varchar(255), " +
                "کامنت چندمه varchar(255), " +
                "کی لایک کرده varchar(255), " +
                "زمان دقیق لایک varchar(255), " +
                "PRIMARY KEY (id)");
                statement.close();}

    private void initkickedtable(Statement statement) throws SQLException {
        statement.executeUpdate("CREATE TABLE IF NOT EXISTS"+
                "Kicked(id int NOT NULL AUTO_INCREMENT, " +
                "نام گروه varchar(255), " +
                "کی کیک شده؟ varchar(255), " +
                "کی کیک کرده؟ varchar(255), " +
                "زمان کیک varchar(255), " +
                "PRIMARY KEY (id)");
                statement.close();}

    private void initgrouptable(Statement statement) throws SQLException {
        statement.executeUpdate("CREATE TABLE IF NOT EXISTS"+
                "Group(id int NOT NULL AUTO_INCREMENT, " +
                "نام گروه varchar(255), " +
                "bio varchar(255), " +
                "groupType(public or private?) varchar(255), " +
                "سازنده varchar(255), " +
                "زمان تشکیل گروه varchar(255), " +
                "PRIMARY KEY (id)");
                statement.close();}

    private void initgroupmessagetable(Statement statement) throws SQLException {
        statement.executeUpdate("CREATE TABLE IF NOT EXISTS"+
                "GroupMessage(id int NOT NULL AUTO_INCREMENT, " +
                "نام گروه varchar(255), " +
                "فرستنده کیه varchar(255), " +
                "متن چیه varchar(255), " +
                "ریپلای شده؟ varchar(255), " +
                "از کی ریپلای شده؟ varchar(255), " +
                "از چ متنی ریپلای شده؟ varchar(255), " +
                "فروارد شده؟ varchar(255), " +
                "از کجا فروارد شده؟ varchar(255), " +
                "ادیت شده؟ varchar(255), " +
                "زمان دقیق پیام varchar(255), " +
                "PRIMARY KEY (id)");
                statement.close();}

    private void initgmailtable(Statement statement) throws SQLException {
        statement.executeUpdate("CREATE TABLE IF NOT EXISTS"+
                "Gmail(id int NOT NULL AUTO_INCREMENT, " +
                "برای کی رفته؟ varchar(255), " +
                "متن Gmail varchar(255), " +
                "زمان دقیق varchar(255), " +
                "PRIMARY KEY (id)");
                statement.close();}

    private void initfollowtable(Statement statement) throws SQLException {
        statement.executeUpdate("CREATE TABLE IF NOT EXISTS"+
                "Follow(id int NOT NULL AUTO_INCREMENT, " +
                "کی فالو شده varchar(255), " +
                "کی فالو کرده varchar(255), " +
                "زمان دقیق varchar(255), " +
                "PRIMARY KEY (id)");
                statement.close();}

    private void initfavoritetable(Statement statement) throws SQLException {
        statement.executeUpdate("CREATE TABLE IF NOT EXISTS"+
                "Favorite(id int NOT NULL AUTO_INCREMENT, " +
                "کی فیوریت کرده؟ varchar(255), " +
                "کی فیوریت شده؟ varchar(255), " +
                "PRIMARY KEY (id)");
                statement.close();}

    private void initcommenttable(Statement statement) throws SQLException {
        statement.executeUpdate("CREATE TABLE IF NOT EXISTS"+
                "Comment(id int NOT NULL AUTO_INCREMENT, " +
                "پست کیه varchar(255), " +
                "پست چندمه varchar(255), " +
                "کامنت چندمه varchar(255), " +
                "کی نوشته varchar(255), " +
                "متن کامنت varchar(255), " +
                "تعداد لایک varchar(255), " +
                "زمان دقیق کامنت varchar(255), " +
                "PRIMARY KEY (id)");
                statement.close();}

    private void initclosefriendtable(Statement statement) throws SQLException {
        statement.executeUpdate("CREATE TABLE IF NOT EXISTS"+
                "CloseFriend(id int NOT NULL AUTO_INCREMENT, " +
                "کی فرند کرده؟ varchar(255), " +
                "کی فرند شده؟ varchar(255), " +
                "PRIMARY KEY (id)");
                statement.close();}

    private void initblocktable(Statement statement) throws SQLException {
        statement.executeUpdate("CREATE TABLE IF NOT EXISTS"+
                "Block(id int NOT NULL AUTO_INCREMENT, " +
                "کی بلاک کرده؟ varchar(255), " +
                "کی بلاک شده؟ varchar(255), " +
                "زمان دقیق بلاک varchar(255), " +
                "PRIMARY KEY (id)");
                statement.close();}

    private void initbannedtable(Statement statement) throws SQLException {
        statement.executeUpdate("CREATE TABLE IF NOT EXISTS"+
                "Banned(id int NOT NULL AUTO_INCREMENT, " +
                "نام گروه varchar(255), " +
                "کی بن شده؟ varchar(255), " +
                "کی بن کرده؟ varchar(255), " +
                "زمان بن varchar(255), " +
                "PRIMARY KEY (id)");
                statement.close();
    }

    private void initadminetable(Statement statement) throws SQLException {
        statement.executeUpdate("CREATE TABLE IF NOT EXISTS"+
                "Admine(id int NOT NULL AUTO_INCREMENT, " +
                "نام گروه varchar(255), " +
                "نام ادمین varchar(255), " +
                "کی ادمینش کرد؟ varchar(255), " +
                "زمان ادمین شدن varchar(255), " +
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
