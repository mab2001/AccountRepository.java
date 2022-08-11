package repository;

import entity.LikeComment;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class LikeCommentRepository {
    public static List<LikeComment> showAllLikeComments(Connection connection) throws SQLException {
        List<LikeComment> likeComments = new ArrayList<>();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from initlikecommenttable");
        while (resultSet.next()) {
            LikeComment likeComment = new LikeComment();
            likeComment.setId(resultSet.getInt("id"));
            likeComment.setPost_owner(resultSet.getString("post_owner"));
            likeComment.setNumber_of_post(resultSet.getInt("number_of_post"));
            likeComment.setNumber_of_comment(resultSet.getInt("number_of_comment"));
            likeComment.setWho_liked(resultSet.getString("who_liked?"));
            likeComment.setTime(resultSet.getString("time"));
            likeComments.add(likeComment);
        }
        statement.close();
        return likeComments;
    }
}
