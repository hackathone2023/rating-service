package com.evergreen.login.service;

import com.evergreen.login.domain.ratings.RatingsRequest;
import com.evergreen.login.domain.ratings.RatingsResponse;

public interface RatingsService {

	public RatingsResponse getGreenRating(RatingsRequest ratingsRequest);

}
