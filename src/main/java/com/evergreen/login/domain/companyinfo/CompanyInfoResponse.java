package com.evergreen.login.domain.companyinfo;

import com.evergreen.login.domain.usage.DataResponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class CompanyInfoResponse {

	private boolean success;
	private DataResponse data;
}
