package com.min.edu.inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.min.edu.bin1.RomoteController;

@Component
public class UseBean {
	
	@Autowired
	private RomoteController samsungTelevision;
	
	public UseBean(RomoteController samsungTelevision) {
		this.samsungTelevision = samsungTelevision;
		System.out.println("주입도니 객체 실행");
		print();
	}
	
	public void print() {
		System.out.println("useBean 프린트 실행");
		System.out.println(samsungTelevision.powerOn());
		System.out.println(samsungTelevision.powerOff());
	}
}
