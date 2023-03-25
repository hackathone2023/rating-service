package com.solutions.evergreen.ratingservice.service;

import com.solutions.evergreen.ratingservice.domain.companyinfo.CompanyInfoRequest;
import com.solutions.evergreen.ratingservice.domain.companyinfo.CompanyInfoResponse;

public interface CompanyInfoService {

	public CompanyInfoResponse getUsage(CompanyInfoRequest companyInfoRequest);
}
