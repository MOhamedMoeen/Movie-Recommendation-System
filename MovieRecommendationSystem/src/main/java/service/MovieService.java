package service;

import entities.Movie;
import org.springframework.stereotype.Service;
import repositories.MovieRepository;

import java.util.List;

@Service
public class MovieService {
    private MovieRepository movieRepository;
    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }
    public Movie getMovieById(int id) {
        return movieRepository.findById(id).get();
    }
    public Movie addMovie(Movie movie) {
        return movieRepository.save(movie);
    }
    public void deleteMovie(int id) {
        movieRepository.deleteById(id);
    }

}
