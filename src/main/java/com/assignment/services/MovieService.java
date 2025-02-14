package com.assignment.services;

import com.assignment.models.Movies;

import java.util.List;

public interface MovieService {
    List<Movies> getAllMovies();
    Movies createMovie(Movies movie);
}
