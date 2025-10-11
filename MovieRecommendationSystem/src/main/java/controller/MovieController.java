package controller;

import entities.Movie;
import org.springframework.web.bind.annotation.*;
import service.MovieService;

import java.util.List;

@RestController
@RequestMapping("/api/movies")
public class MovieController {
    private MovieService movieService;
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }
    @GetMapping
    public List<Movie> getMovies() {
        return movieService.getAllMovies();
    }
    @PostMapping
    public Movie addMovie(@RequestBody Movie movie) {
        return movieService.addMovie(movie);
    }
    @DeleteMapping("/{id}")
    public void deleteMovie(@PathVariable int id) {
        movieService.deleteMovie(id);
    }
    @GetMapping("{id}")
    public Movie getMovie(@PathVariable int id) {
        return movieService.getMovieById(id);
    }
}
