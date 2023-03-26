package com.evergreen.login.domain.companyinfo;

import com.evergreen.login.domain.usage.Usage;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class CompanyInfoResponse {

	private boolean success;
	private Usage chemicalUsage;
	private Usage energyUsage;
	private Usage fabricUsage;
	private Usage rawMaterialsUsage;
	private Usage waterUsage;
}
