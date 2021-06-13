package searchBar;

import java.util.Date;
import java.util.List;

public interface Search {

     List<Movie> searchByTitle(String title);
     List<Movie> searchByCity(String city);
     List<Movie> searchByGenre(String genre);
     List<Movie> searchByLanguage(String language);
     List<Movie> searchByReleaseDate(Date releaseDate);

};


