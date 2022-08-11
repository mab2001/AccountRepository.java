package repository;

import entity.Favorites;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class FavoriteRepository {
    public static List<Favorites> showAllFavorites(Connection connection) throws SQLException {
        List<Favorites> favorites = new ArrayList<>();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from initfavoritetable");
        while (resultSet.next()) {
            Favorites favorite = new Favorites();
            favorite.setId(resultSet.getInt("id"));
            favorite.setWho_favorited(resultSet.getString("who_favorited?"));
            favorite.setFavorite(resultSet.getString("favorite"));
            favorite.setTime(resultSet.getString("time"));
            favorites.add(favorite);
        }
        statement.close();
        return favorites;
    }
}
