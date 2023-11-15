package com.school;

public class Teacher extends User{
	private String NIC;
	private String email;
	private int TID;
	private double salary;
	
	public Teacher(int TID, String name, int age, String address, int phone, String NIC, String email, double salary, String username, String password) {
		super(name, age, address, phone, username, password);
		this.NIC = NIC;
		this.email = email;
		this.TID = TID;
		this.salary = salary;
	}

	public String getNIC() {
		return NIC;
	}

	public String getEmail() {
		return email;
	}

	public int getTID() {
		return TID;
	}

	public double getSalary() {
		return salary;
	}
}

