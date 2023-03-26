package com.evergreen.login.service.impl;

import org.springframework.stereotype.Service;

import com.evergreen.login.domain.companyinfo.CompanyInfoRequest;
import com.evergreen.login.domain.companyinfo.CompanyInfoResponse;
import com.evergreen.login.domain.usage.Usage;
import com.evergreen.login.service.CompanyInfoService;

@Service
public class CompanyInfoServiceImpl implements CompanyInfoService {

	@Override
	public CompanyInfoResponse getUsage(CompanyInfoRequest companyInfoRequest) {
		CompanyInfoResponse companyInfoResponse = new CompanyInfoResponse();

		companyInfoResponse.setSuccess(Boolean.TRUE);

		Usage chemicalUsage = new Usage();
		chemicalUsage.setWeeklyUsage("10");
		chemicalUsage.setMonthlyUsage("100");
		chemicalUsage.setQuarterlyUsage("1000");
		chemicalUsage.setYearlyUsage("10000");
		companyInfoResponse.setChemicalUsage(chemicalUsage);

		Usage energyUsage = new Usage();
		energyUsage.setWeeklyUsage("20");
		energyUsage.setMonthlyUsage("200");
		energyUsage.setQuarterlyUsage("2000");
		energyUsage.setYearlyUsage("20000");
		companyInfoResponse.setEnergyUsage(energyUsage);

		Usage fabricUsage = new Usage();
		fabricUsage.setWeeklyUsage("30");
		fabricUsage.setMonthlyUsage("300");
		fabricUsage.setQuarterlyUsage("3000");
		fabricUsage.setYearlyUsage("30000");
		companyInfoResponse.setFabricUsage(fabricUsage);

		Usage rawMaterialsUsage = new Usage();
		rawMaterialsUsage.setWeeklyUsage("40");
		rawMaterialsUsage.setMonthlyUsage("400");
		rawMaterialsUsage.setQuarterlyUsage("4000");
		rawMaterialsUsage.setYearlyUsage("40000");
		companyInfoResponse.setRawMaterialsUsage(rawMaterialsUsage);

		Usage waterUsage = new Usage();
		waterUsage.setWeeklyUsage("50");
		waterUsage.setMonthlyUsage("500");
		waterUsage.setQuarterlyUsage("5000");
		waterUsage.setYearlyUsage("50000");
		companyInfoResponse.setWaterUsage(waterUsage);

		return companyInfoResponse;
	}

}
