package com.min.edu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

import com.min.edu.anno04.Radio;

//@ComponentScan(basePackages="com.min.edu.anno04")
@ComponentScan({"com.min.edu.anno04", "com.min.edu.anno05", "com.min.edu.anno06"})
public class RemoteMain {

	public static void main(String[] args) {
		ApplicationContext bean= new AnnotationConfigApplicationContext(RemoteMain.class);
		Radio obj = bean.getBean("radio",Radio.class);
		
		obj.powerOn();
		obj.powerOff();
	}
}
