package com.solutions.evergreen.ratingservice.domain.companyinfo;

import com.solutions.evergreen.ratingservice.domain.usage.Usage;

import lombok.AllArgsConstructor;

@AllArgsConstructor

public class CompanyInfoResponse {

	private boolean success;
	private Usage chemicalUsage;
	private Usage energyUsage;
	private Usage fabricUsage;
	private Usage rawMaterialsUsage;
	private Usage waterUsage;
}
