package com.assignment.controllers;

import com.assignment.models.Review;
import com.assignment.services.MovieService;
import com.assignment.services.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movies")
@RequiredArgsConstructor
public class ReviewController {

    private final MovieService movieService;
    private final ReviewService reviewService;

    @PostMapping("/{movieId}/reviews")
    public ResponseEntity<Review> addReview(@PathVariable Long movieId, @RequestBody Review review) throws Exception {
        Review savedReview = reviewService.addReview(movieId, review);
        return new ResponseEntity<>(savedReview, HttpStatus.CREATED);

    }
    @PutMapping("/{reviewId}")
    public ResponseEntity<Review> updateReview(@PathVariable Long reviewId, @RequestBody Review updatedReview) throws Exception {
        Review review = reviewService.updateReview(reviewId, updatedReview);
        return new ResponseEntity<>(review,HttpStatus.OK);
    }
}