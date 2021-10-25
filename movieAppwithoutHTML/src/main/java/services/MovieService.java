package services;

import models.Movie;
import repository.MovieRepository;

import java.util.List;

public class MovieService {

    //private MovieDTO movieDTO = new MovieDTO(); // populates list with two test movies
    private MovieRepository movieRepository = new MovieRepository();

    // Uses hardcode in-memory list
   /* public Movie findFirstMovie(int i) {
        return movieDTO.findMovie(i);
    }*/

    public Movie findFirstMovie() {
        return movieRepository.findFirstMovie();
    }

    public List<Movie> findMovies() {
        return movieRepository.findAllMovies();
    }

    public List<Movie> findMoviesByTitle(String title) {
        return movieRepository.findMoviesByTitle(title);
    }
}
