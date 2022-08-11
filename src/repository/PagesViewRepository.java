package repository;

import entity.PagesView;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PagesViewRepository {
    public static List<PagesView> showAllPagesViews(Connection connection) throws SQLException {
        List<PagesView> pagesViews = new ArrayList<>();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from initpagesviewtable");
        while (resultSet.next()) {
            PagesView pagesView = new PagesView();
            pagesView.setId(resultSet.getInt("id"));
            pagesView.setPost_owner(resultSet.getString("post_owner"));
            pagesView.setVisitor(resultSet.getString("visitor"));
            pagesView.setTime(resultSet.getString("time"));
            pagesViews.add(pagesView);
        }
        statement.close();
        return pagesViews;
    }
}
