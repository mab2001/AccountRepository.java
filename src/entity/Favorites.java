package entity;

public class Favorites {

    private Integer Id;
    private String who_favorited;
    private String favorite;
    private String time;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getWho_favorited() {
        return who_favorited;
    }

    public void setWho_favorited(String who_favorited) {
        this.who_favorited = who_favorited;
    }

    public String getFavorite() {
        return favorite;
    }

    public void setFavorite(String favorite) {
        this.favorite = favorite;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Favorites{" +
                "Id=" + Id +
                ", who_favorited='" + who_favorited + '\'' +
                ", favorite='" + favorite + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
    public Favorites(){

    }

    public Favorites(Integer id, String who_favorited, String favorite, String time) {
        Id = id;
        this.who_favorited = who_favorited;
        this.favorite = favorite;
        this.time = time;
    }
}
