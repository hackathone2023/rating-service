package com.evergreen.login.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsageDto {

    private String weeklyUsage;
    private String monthlyUsage;
    private String quaterUsage;
    private String yearlyUsage;
}
