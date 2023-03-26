package com.evergreen.login.controller;

import com.evergreen.login.dto.GreenRatings;
import com.evergreen.login.dto.UsageDto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RatingController {

    @CrossOrigin
    @GetMapping(value = "/companyinfo/usage")
    public List<UsageDto> UsageReport(@RequestParam("evergreenId") String evergreenId) {
        List<UsageDto> usageDtos = new ArrayList<>();
        UsageDto chemicalUsage = new UsageDto();
        chemicalUsage.setWeeklyUsage("150");
        chemicalUsage.setMonthlyUsage("320");
        chemicalUsage.setQuaterUsage("640");
        chemicalUsage.setYearlyUsage("2200");
        usageDtos.add(chemicalUsage);

        UsageDto energyUsage = new UsageDto();
        energyUsage.setWeeklyUsage("700");
        energyUsage.setMonthlyUsage("1500");
        energyUsage.setQuaterUsage("3500");
        energyUsage.setYearlyUsage("7000");
        usageDtos.add(energyUsage);

        UsageDto fabricUsage = new UsageDto();
        fabricUsage.setWeeklyUsage("300");
        fabricUsage.setMonthlyUsage("700");
        fabricUsage.setQuaterUsage("1700");
        fabricUsage.setYearlyUsage("4000");
        usageDtos.add(fabricUsage);

        UsageDto rawMaterialsUsage = new UsageDto();
        rawMaterialsUsage.setWeeklyUsage("5000");
        rawMaterialsUsage.setMonthlyUsage("12000");
        rawMaterialsUsage.setQuaterUsage("25000");
        rawMaterialsUsage.setYearlyUsage("50000");
        usageDtos.add(rawMaterialsUsage);

        UsageDto waterUsage = new UsageDto();
        waterUsage.setWeeklyUsage("7000");
        waterUsage.setMonthlyUsage("15000");
        waterUsage.setQuaterUsage("30000");
        waterUsage.setYearlyUsage("70000");
        usageDtos.add(waterUsage);

        return usageDtos;

    }

    @CrossOrigin
    @PostMapping(value = "/ratings/greenRating/get")
    public GreenRatings UsageReport(@RequestParam("solarUsage") String solarUsage, @RequestParam("oilUsage") String oilUsage) {

        GreenRatings greenRatings = new GreenRatings();

        greenRatings.setGreenRating("4.1");

        return greenRatings;
    }

    @GetMapping("/login/message/v2")
    @CrossOrigin
    public String message(){
        return "Congrats ! your application deployed successfully in Azure Platform. !";
    }

}
