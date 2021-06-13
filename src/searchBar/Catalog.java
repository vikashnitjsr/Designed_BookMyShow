package searchBar;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

// Implemented the searchBar.Search interface all searching ways to get Movies

public class Catalog implements Search {

    HashMap<String , List<Movie>> moviesByTitle;
    HashMap<String , List<Movie>> moviesByCity;
    HashMap<String , List<Movie>> moviesByGenre;
    HashMap<String , List<Movie>> moviesByLanguage;
    HashMap<Date , List<Movie>>  movieByReleaseDate;

    public List<Movie> searchByTitle(String title) {
        return moviesByTitle.get(title);
    }

    public List<Movie> searchByCity(String city) {
        return moviesByCity.get(city);
    }

    public List<Movie> searchByGenre(String genre) {
        return moviesByGenre.get(genre);
    }

    public List<Movie> searchByLanguage(String language) {
        return moviesByLanguage.get(language);
    }

    public List<Movie> searchByReleaseDate(Date releaseDate) {
        return movieByReleaseDate.get(releaseDate);
    }
}
