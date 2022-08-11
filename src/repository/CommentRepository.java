package repository;

import entity.Comment;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CommentRepository {

    public static List<Comment> showAllComments(Connection connection) throws SQLException {
        List<Comment> comments = new ArrayList<>();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from initcommenttable");
        while (resultSet.next()) {
            Comment comment = new Comment();
            comment.setId(resultSet.getInt("id"));
            comment.setPost_owner(resultSet.getString("post_owner"));
            comment.setNumber_of_post(resultSet.getInt("number_of_post"));
            comment.setNumber_of_comment(resultSet.getInt("number_of_comment"));
            comment.setSender(resultSet.getString("sender"));
            comment.setComment_text(resultSet.getString("comment_text"));
            comment.setLike_number(resultSet.getInt("like_number"));
            comment.setCommentTime(resultSet.getString("time"));
            comments.add(comment);
        }
        statement.close();
        return comments;
    }
}
