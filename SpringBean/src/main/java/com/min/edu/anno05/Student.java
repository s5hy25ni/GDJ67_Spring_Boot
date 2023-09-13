package com.min.edu.anno05;

/*
 * Spring Bean Configuration에 xml 작성을 통해 bean으로 등록하여 사용하게 될 클래스
 * @Component에 의해서 하나만 사용되는 것이 아닌 여러 개를 선언하여 사용
 */
public class Student {

	private String name;
	private String addr;
	private String age;
	
	public Student() {
	}
	public Student(String name, String addr, String age) {
		super();
		this.name = name;
		this.addr = addr;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", addr=" + addr + ", age=" + age + "]";
	}
	
	
}
