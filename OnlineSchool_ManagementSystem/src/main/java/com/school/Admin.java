package com.school;

public class Admin extends User{
	private String NIC;
	private String email;
	private int AID;
	private String position;
	private double salary;
	
	public Admin(int AID, String name, int age, String address, int phone, String NIC, String email, String position, double salary, String username, String password) {
		super(name, age, address, phone, username, password);
		this.NIC = NIC;
		this.email = email;
		this.AID = AID;
		this.position = position;
		this.salary = salary;
	}

	public String getNIC() {
		return NIC;
	}

	public String getEmail() {
		return email;
	}

	public int getAID() {
		return AID;
	}

	public String getPosition() {
		return position;
	}

	public double getSalary() {
		return salary;
	}
}


