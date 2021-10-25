package models;

import java.util.ArrayList;
import java.util.List;

public class MovieList {
    private ArrayList<Movie> movies;

    public MovieList(List<Movie> movies) {
        this.movies = (ArrayList<Movie>) movies;
    }

    @Override
    public String toString() {
        String result = "";
        for (Movie m : movies
        ) {
            result += m.toString() + "<br>";
        }
        return result;
    }
}
