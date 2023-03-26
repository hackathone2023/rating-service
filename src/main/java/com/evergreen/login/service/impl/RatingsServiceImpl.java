package com.evergreen.login.service.impl;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import com.evergreen.login.domain.ratings.RatingsRequest;
import com.evergreen.login.domain.ratings.RatingsResponse;
import com.evergreen.login.service.RatingsService;

@Service
public class RatingsServiceImpl implements RatingsService {

	@Override
	public RatingsResponse getGreenRating(RatingsRequest ratingsRequest) {
		RatingsResponse ratingsResponse = new RatingsResponse();
		BigDecimal greenRating = efficiencyPercentage(ratingsRequest.getChemicalWastage())
				.add(efficiencyPercentage(ratingsRequest.getEnergyWastage()))
				.add(efficiencyPercentage(ratingsRequest.getFabricWastage()))
				.add(efficiencyPercentage(ratingsRequest.getRawMaterialsWastage()))
				.add(efficiencyPercentage(ratingsRequest.getWaterWastage()));
		ratingsResponse.setGreenRating(greenRating);
		return ratingsResponse;
	}

	public static BigDecimal efficiencyPercentage(double wastagePercenatge) {
		BigDecimal b1 = new BigDecimal("1");
		BigDecimal b2 = new BigDecimal(Double.toString(wastagePercenatge));
		return b1.subtract(b2);
	}
}
