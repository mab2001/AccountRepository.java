package repository;

import entity.Post;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PostRepository {
    public static List<Post> showAllPosts(Connection connection) throws SQLException {
        List<Post> posts = new ArrayList<>();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from initposttable");
        while (resultSet.next()) {
            Post post = new Post();
            post.setPostID(resultSet.getInt("postID"));
            post.setPostOwner(resultSet.getString("post_owner"));
            post.setPostNumber(resultSet.getInt("number_of_post"));
            post.setHas_ad(resultSet.getString("has_ad?"));
            post.setPostText(resultSet.getString("text"));
            post.setIs_it_edited(resultSet.getString("is_it_edited?"));
            post.setPostLikesNumber(resultSet.getInt("like_number"));
            post.setPostViewsNumber(resultSet.getInt("view_number"));
            post.setPostCommentNumber(resultSet.getInt("comment_number"));
            post.setPostTime(resultSet.getString("time"));
            posts.add(post);
        }
        statement.close();
        return posts;
    }
}
