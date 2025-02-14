package com.assignment.services.impl;

import com.assignment.models.Movies;
import com.assignment.repository.MovieRepository;
import com.assignment.services.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MovieServiceImpl implements MovieService {

    private final MovieRepository movieRepository;

    @Override
    public List<Movies> getAllMovies() {
        return movieRepository.findAll();
    }

    @Override
    public Movies createMovie(Movies movie) {

        Movies newMovie = new Movies();
        newMovie.setGenre(movie.getGenre());
        newMovie.setTitle(movie.getTitle());
        newMovie.setReviews(movie.getReviews());
        newMovie.setReleaseYear(movie.getReleaseYear());

        return movieRepository.save(newMovie);
    }
}