package com.school;

public class User {
	private String name;
	private int age;
	private String address;
	private int phone;	
	private String username;
	private String password;
	
	public User(String name, int age, String address, int phone, String username, String password) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.phone = phone;
		this.username = username;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getAddress() {
		return address;
	}

	public int getPhone() {
		return phone;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}
	
	
}

