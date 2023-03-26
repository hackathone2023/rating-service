package com.evergreen.login.domain.usage;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class DataResponse {

	private UsageType chemical;
	private UsageType energy;
	private UsageType fabric;
	private UsageType rawMaterials;
	private UsageType water;
}
