package com.assignment.controllers;


import com.assignment.models.Movies;
import com.assignment.services.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
@RequiredArgsConstructor
public class MovieController {

    private final MovieService movieService;


    @PostMapping("/add")
    public ResponseEntity<Movies>createMovieHandler(@RequestBody Movies movie){

        Movies savedMovie = movieService.createMovie(movie);
        return new ResponseEntity<>(savedMovie, HttpStatus.OK);
    }

    @GetMapping("/get")
    public ResponseEntity<List<Movies>>getAllMovieHandler(){

        List<Movies> allMovies = movieService.getAllMovies();
        return new ResponseEntity<>(allMovies, HttpStatus.OK);
    }
}
