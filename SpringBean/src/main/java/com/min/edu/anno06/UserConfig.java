package com.min.edu.anno06;

import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {
	public UserDto userDto() {
		UserDto dto = new UserDto();
		return dto;
	}
}
