package com.assignment.services;

import com.assignment.models.Review;

public interface ReviewService {
    Review addReview(Long movieId, Review review) throws Exception;
    Review updateReview(Long id,Review review) throws Exception;
}
