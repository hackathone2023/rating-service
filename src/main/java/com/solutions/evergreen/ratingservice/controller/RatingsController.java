package com.solutions.evergreen.ratingservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.solutions.evergreen.ratingservice.domain.ratings.RatingsRequest;
import com.solutions.evergreen.ratingservice.domain.ratings.RatingsResponse;
import com.solutions.evergreen.ratingservice.service.RatingsService;

@Controller
@RequestMapping("/ratings")
public class RatingsController {

	@Autowired
	RatingsService ratingsService;

	@RequestMapping("/greenRating/get")
	public @ResponseBody RatingsResponse getGreenRating(@RequestBody RatingsRequest ratingsRequest) {
		return ratingsService.getGreenRating(ratingsRequest);
	}
}
