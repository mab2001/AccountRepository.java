package repository;

import entity.ViewPost;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ViewPostRepository {
    public static List<ViewPost> showAllViewPosts(Connection connection) throws SQLException {
    List<ViewPost> viewPosts = new ArrayList<>();
    Statement statement = connection.createStatement();
    ResultSet resultSet = statement.executeQuery("select * from initviewposttable");
    while (resultSet.next()) {
        ViewPost viewPost = new ViewPost();
        viewPost.setId(resultSet.getInt("id"));
        viewPost.setPost_owner(resultSet.getString("post_owner"));
        viewPost.setNumber_of_post(resultSet.getInt("number_of_post"));
        viewPost.setVisitor(resultSet.getString("visitor"));
        viewPost.setTime(resultSet.getString("time"));
        viewPosts.add(viewPost);
    }
    statement.close();
    return viewPosts;
}
}
