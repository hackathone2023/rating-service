package com.solutions.evergreen.ratingservice.domain.ratings;

import com.solutions.evergreen.ratingservice.domain.common.CommonRequest;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class RatingsRequest extends CommonRequest {

	private double chemicalWastage;
	private double energyWastage;
	private double fabricWastage;
	private double rawMaterialsWastage;
	private double waterWastage;
}
