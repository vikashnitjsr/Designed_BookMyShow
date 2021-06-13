package searchBar;

import movie.Show;
import users.Admin;

import java.util.Date;
import java.util.List;


public class Movie
{
    private String name;
    private String description;
    private String genre;
    private String durationInMinutes;
    private Date dateOfRelease;
    private String country;
    private List<Show> Shows;
    private Admin movieAddedBy;

     public List<Show> getAllShow(); // List of all shows of this MOVIE


}
