package com.school;

public class Student extends User{
	private int sid;
	private int grade;
	private String regstatus;
	
	public Student(int sid, String name, int age, String address, int phone, int grade, String username, String password, String regstatus) {
		super(name, age, address, phone, username, password);
		
		this.grade = grade;
		this.sid = sid;
		this.regstatus = regstatus;
	}

	public int getSid() {
		return sid;
	}

	public int getGrade() {
		return grade;
	}

	public String getRegstatus() {
		return regstatus;
	}

}