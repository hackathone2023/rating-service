package com.evergreen.login.domain.usage;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class UsageType {

	private Usage weekly;
	private Usage monthly;
	private Usage quarterly;
	private Usage yearly;
}
