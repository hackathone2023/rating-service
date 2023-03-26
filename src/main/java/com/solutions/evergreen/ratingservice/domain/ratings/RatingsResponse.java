package com.solutions.evergreen.ratingservice.domain.ratings;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class RatingsResponse {

	private BigDecimal greenRating;
}
