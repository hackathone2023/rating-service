package com.evergreen.login.domain.usage;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Usage {

	private String[] label;
	private String[] data;

}
