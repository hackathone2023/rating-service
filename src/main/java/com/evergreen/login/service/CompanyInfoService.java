package com.evergreen.login.service;

import com.evergreen.login.domain.companyinfo.CompanyInfoRequest;
import com.evergreen.login.domain.companyinfo.CompanyInfoResponse;

public interface CompanyInfoService {

	public CompanyInfoResponse getUsage(CompanyInfoRequest companyInfoRequest);
}
