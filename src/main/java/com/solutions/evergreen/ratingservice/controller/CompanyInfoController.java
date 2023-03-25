package com.solutions.evergreen.ratingservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.solutions.evergreen.ratingservice.domain.companyinfo.CompanyInfoRequest;
import com.solutions.evergreen.ratingservice.domain.companyinfo.CompanyInfoResponse;
import com.solutions.evergreen.ratingservice.service.CompanyInfoService;

@Controller
@RequestMapping("/companyinfo")
public class CompanyInfoController {

	@Autowired
	CompanyInfoService companyInfoService;

	@RequestMapping(value = "/usage")
	public @ResponseBody CompanyInfoResponse getUsage(@RequestBody CompanyInfoRequest companyInfoRequest) {
		return companyInfoService.getUsage(companyInfoRequest);
	}
}
