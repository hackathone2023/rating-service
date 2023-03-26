package com.evergreen.login.service.impl;

import java.util.Arrays;

import org.springframework.stereotype.Service;

import com.evergreen.login.domain.companyinfo.CompanyInfoRequest;
import com.evergreen.login.domain.companyinfo.CompanyInfoResponse;
import com.evergreen.login.domain.usage.DataResponse;
import com.evergreen.login.domain.usage.MonthsEnum;
import com.evergreen.login.domain.usage.QuartersEnum;
import com.evergreen.login.domain.usage.Usage;
import com.evergreen.login.domain.usage.UsageType;
import com.evergreen.login.domain.usage.WeeksEnum;
import com.evergreen.login.domain.usage.YearsEnum;
import com.evergreen.login.service.CompanyInfoService;

@Service
public class CompanyInfoServiceImpl implements CompanyInfoService {

	@Override
	public CompanyInfoResponse getUsage(CompanyInfoRequest companyInfoRequest) {
		CompanyInfoResponse companyInfoResponse = new CompanyInfoResponse();

		companyInfoResponse.setSuccess(Boolean.TRUE);
		DataResponse data = new DataResponse();

		// Kilo Tons
		UsageType chemicalUsage = new UsageType();
		String chemicalWeeklyData[] = { "26", "24", "28", "27", "25" };
		chemicalUsage.setWeekly(new Usage(getNames(WeeksEnum.class), chemicalWeeklyData));
		String chemicalMonthlyData[] = { "109", "90", "104", "117", "121", "119", "123", "141", "136", "127", "128",
				"113" };
		chemicalUsage.setMonthly(new Usage(getNames(MonthsEnum.class), chemicalMonthlyData));
		String chemicalQuarterlyData[] = { "380", "340", "420", "460" };
		chemicalUsage.setQuarterly(new Usage(getNames(QuartersEnum.class), chemicalQuarterlyData));
		String chemicalYearlyData[] = { "1470", "1410", "1270", "1340", "1510" };
		chemicalUsage.setYearly(new Usage(getNames(YearsEnum.class), chemicalYearlyData));
		data.setChemical(chemicalUsage);

		// Million kWh
		UsageType energyUsage = new UsageType();
		String energyWeeklyData[] = { "26", "24", "18", "18", "18" };
		energyUsage.setWeekly(new Usage(getNames(WeeksEnum.class), energyWeeklyData));
		String energyMonthlyData[] = { "109", "90", "104", "117", "121", "119", "123", "141", "136", "127", "128",
				"113" };
		energyUsage.setMonthly(new Usage(getNames(MonthsEnum.class), energyMonthlyData));
		String energyQuarterlyData[] = { "380", "340", "420", "460" };
		energyUsage.setQuarterly(new Usage(getNames(QuartersEnum.class), energyQuarterlyData));
		String energylYearlyData[] = { "1470", "1410", "1270", "1340", "1510" };
		energyUsage.setYearly(new Usage(getNames(YearsEnum.class), energylYearlyData));
		data.setEnergy(energyUsage);

		// Kilo Yards
		UsageType fabricUsage = new UsageType();
		String fabricWeeklyData[] = { "11", "14", "8", "13", "15" };
		fabricUsage.setWeekly(new Usage(getNames(WeeksEnum.class), fabricWeeklyData));
		String fabricMonthlyData[] = { "49", "35", "46", "56", "53", "58", "62", "71", "74", "67", "65", "113" };
		fabricUsage.setMonthly(new Usage(getNames(MonthsEnum.class), fabricMonthlyData));
		String fabricQuarterlyData[] = { "130", "185", "235", "280" };
		fabricUsage.setQuarterly(new Usage(getNames(QuartersEnum.class), fabricQuarterlyData));
		String fabricYearlyData[] = { "820", "780", "630", "710", "850" };
		fabricUsage.setYearly(new Usage(getNames(YearsEnum.class), fabricYearlyData));
		data.setFabric(fabricUsage);

		// Kilo Tons
		UsageType rawMaterialsUsage = new UsageType();
		String rawMaterialsWeeklyData[] = { "1.2", "1.3", "2.1", "1.9", "1.5" };
		rawMaterialsUsage.setWeekly(new Usage(getNames(WeeksEnum.class), rawMaterialsWeeklyData));
		String rawMaterialsMonthlyData[] = { "4.2", "4", "4.8", "5.4", "6.6", "5.9", "6.2", "7.9", "7.8", "7.2", "6.9",
				"113" };
		rawMaterialsUsage.setMonthly(new Usage(getNames(MonthsEnum.class), rawMaterialsMonthlyData));
		String rawMaterialsQuarterlyData[] = { "19", "24", "27", "32" };
		rawMaterialsUsage.setQuarterly(new Usage(getNames(QuartersEnum.class), rawMaterialsQuarterlyData));
		String rawMaterialsYearlyData[] = { "86", "63", "75", "82", "91" };
		rawMaterialsUsage.setYearly(new Usage(getNames(YearsEnum.class), rawMaterialsYearlyData));
		data.setRawMaterials(rawMaterialsUsage);

		// Billion Gallons
		UsageType waterUsage = new UsageType();
		String waterWeeklyData[] = { "26", "24", "28", "27", "25" };
		waterUsage.setWeekly(new Usage(getNames(WeeksEnum.class), waterWeeklyData));
		String waterMonthlyData[] = { "109", "90", "104", "117", "121", "119", "123", "141", "136", "127", "128",
				"113" };
		waterUsage.setMonthly(new Usage(getNames(MonthsEnum.class), waterMonthlyData));
		String waterQuarterlyData[] = { "380", "340", "420", "460" };
		waterUsage.setQuarterly(new Usage(getNames(YearsEnum.class), waterQuarterlyData));
		String waterYearlyData[] = { "1470", "1410", "1270", "1340", "1510" };
		waterUsage.setYearly(new Usage(getNames(WeeksEnum.class), waterYearlyData));
		data.setWater(waterUsage);

		companyInfoResponse.setData(data);
		return companyInfoResponse;
	}

	public static String[] getNames(Class<? extends Enum<?>> e) {
		return Arrays.stream(e.getEnumConstants()).map(Enum::name).toArray(String[]::new);
	}
}
