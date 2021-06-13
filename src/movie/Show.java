package movie;

import movie.CinemaHall;
import searchBar.Movie;

import java.sql.Time;
import java.util.Date;

public class Show
{
    // show = A movie in execution is called as movie.Show //

    private int showID;
    private Time startTime;
    private Time endTime;
    private Date showDate;
    private Movie moviePlayed;
    private CinemaHall PlayedCinemaHall;
}
