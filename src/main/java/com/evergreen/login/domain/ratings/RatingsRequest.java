package com.evergreen.login.domain.ratings;

import com.evergreen.login.domain.common.CommonRequest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class RatingsRequest extends CommonRequest {

	private double chemicalWastage;
	private double energyWastage;
	private double fabricWastage;
	private double rawMaterialsWastage;
	private double waterWastage;
}
