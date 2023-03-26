package com.evergreen.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.evergreen.login.domain.companyinfo.CompanyInfoRequest;
import com.evergreen.login.domain.companyinfo.CompanyInfoResponse;
import com.evergreen.login.service.CompanyInfoService;

@Controller
@RequestMapping("/companyinfo")
public class CompanyInfoController {

	@Autowired
	CompanyInfoService companyInfoService;

	@CrossOrigin
	@PostMapping(value = "/usage")
	public @ResponseBody CompanyInfoResponse getUsage(@RequestBody CompanyInfoRequest companyInfoRequest) {
		return companyInfoService.getUsage(companyInfoRequest);
	}
}
