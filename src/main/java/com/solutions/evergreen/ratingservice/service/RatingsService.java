package com.solutions.evergreen.ratingservice.service;

import com.solutions.evergreen.ratingservice.domain.ratings.RatingsRequest;
import com.solutions.evergreen.ratingservice.domain.ratings.RatingsResponse;

public interface RatingsService {

	public RatingsResponse getGreenRating(RatingsRequest ratingsRequest);

}
