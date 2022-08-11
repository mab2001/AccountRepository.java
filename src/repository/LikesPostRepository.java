package repository;

import entity.LikesPost;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class LikesPostRepository {
    public static List<LikesPost> showAllLikesPosts(Connection connection) throws SQLException {
        List<LikesPost> likesPosts = new ArrayList<>();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from initlikesposttable");
        while (resultSet.next()) {
            LikesPost likesPost = new LikesPost();
            likesPost.setId(resultSet.getInt("id"));
            likesPost.setPost_owner(resultSet.getString("post_owner"));
            likesPost.setNumber_of_post(resultSet.getInt("number_of_post"));
            likesPost.setWho_liked(resultSet.getString("who_liked?"));
            likesPost.setTime(resultSet.getString("time"));
            likesPosts.add(likesPost);
        }
        statement.close();
        return likesPosts;
    }
}
