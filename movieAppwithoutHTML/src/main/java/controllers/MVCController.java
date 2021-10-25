package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import models.Movie;
import models.MovieList;
import services.FridayService;
import services.MovieService;

import java.util.List;

@Controller
public class MVCController {

    private MovieService movieService = new MovieService();

    @GetMapping("/")
    @ResponseBody
    public String welcome(){
        return "Welcome to IMDB";
    }

    @GetMapping("/friday")
    @ResponseBody
    public boolean isItFriday(){
       return FridayService.isItFriday();
    }

    @GetMapping("/getFirst")
    @ResponseBody
    public String findFirstMovie(){
        Movie movie = movieService.findFirstMovie();
        return movie.toString();
    }

    @GetMapping("/getMovies")
    @ResponseBody
    public String getMovies(){
        List<Movie> searchResult = movieService.findMovies();
        return new MovieList(searchResult).toString();
    }

    @GetMapping("/getMoviesByTitle")
    @ResponseBody
    public String getMoviesByTitle(@RequestParam String title){
        List<Movie> searchResult= movieService.findMoviesByTitle(title);
        return new MovieList(searchResult).toString();
    }
}
