package com.assignment.services.impl;


import com.assignment.models.Review;
import com.assignment.repository.MovieRepository;
import com.assignment.repository.ReviewRepository;
import com.assignment.services.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReviewServiceImpl implements ReviewService {

    private final ReviewRepository reviewRepository;
    private final MovieRepository movieRepository;


    @Override
    public Review addReview(Long movieId, Review review) throws Exception {

        return movieRepository.findById(movieId).map(movie->{
            review.setMovie(movie);
            return reviewRepository.save(review);
        }).orElseThrow(()->new Exception("Movie Not Found with Id "+movieId));
    }

    @Override
    public Review updateReview(Long id, Review review) throws Exception {
        Review exitReview = reviewRepository.findById(id).orElseThrow(()->new Exception("Review Not Found with id "+id));

        if(!review.getComment().isBlank() || review.getComment().length()>1){
            exitReview.setComment(review.getComment());
        }
        if(review.getRating()>0){
            exitReview.setRating(review.getRating());
        }
        return reviewRepository.save(exitReview);
    }
}
