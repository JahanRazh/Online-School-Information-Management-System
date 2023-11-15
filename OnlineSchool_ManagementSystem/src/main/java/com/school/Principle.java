package com.school;

public class Principle extends User{
	private String NIC;
	private int PID;
	
	public Principle(int PID, String name, int age, String address, int phone, String NIC,  String username, String password) {
		super(name, age, address, phone, username, password);
		this.NIC = NIC;
		this.PID = PID;
		
	}

	public String getNIC() {
		return NIC;
	}

	public int getPID() {
		return PID;
	}

	
}


