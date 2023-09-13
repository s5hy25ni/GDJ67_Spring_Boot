package com.min.edu.anno06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements IUserService {
	
	@Autowired
	private UserDto dto01;
	
	@Qualifier("userDto")
	public void setDto01(UserDto dto01) {
		this.dto01 = dto01;
	}

	@Override
	public void addUser() {
		System.out.println("추가된 멤버 : "+dto01);
	}
}
