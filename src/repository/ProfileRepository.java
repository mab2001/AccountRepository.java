package repository;

import entity.UserProfile;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProfileRepository {
    public static List<UserProfile> showAllUserProfiles(Connection connection) throws SQLException {
        List<UserProfile> userProfiles = new ArrayList<>();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from initprofiletable");
        while (resultSet.next()) {
            UserProfile userProfile = new UserProfile();
            userProfile.setId(resultSet.getInt("id"));
            userProfile.setNickname(resultSet.getString("nickname"));
            userProfile.setUsername(resultSet.getString("username"));
            userProfile.setBio(resultSet.getString("bio"));
            userProfile.setGender(resultSet.getString("Gender"));
            userProfile.setBirthday(resultSet.getString("birthday"));
            userProfile.setPost_number(resultSet.getInt("post_number"));
            userProfile.setFollower_number(resultSet.getInt("follower_number"));
            userProfile.setFollowing_number(resultSet.getInt("following_number?"));
            userProfiles.add(userProfile);
        }
        statement.close();
        return userProfiles;
    }
}
