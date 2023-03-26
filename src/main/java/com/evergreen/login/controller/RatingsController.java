package com.evergreen.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.evergreen.login.domain.ratings.RatingsRequest;
import com.evergreen.login.domain.ratings.RatingsResponse;
import com.evergreen.login.service.RatingsService;

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
