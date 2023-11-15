package com.school;

public class Payment {
	private int payID;
	private String cardNo;
	private String name;
	private String expiryDate;
	private int cvv;
	
	public Payment(int payID, String cardNo, String name, String expiryDate, int cvv) {
		this.payID = payID;
		this.cardNo = cardNo;
		this.name = name;
		this.expiryDate = expiryDate;
		this.cvv = cvv;
	}

	public int getPayID() {
		return payID;
	}

	public String getCardNo() {
		return cardNo;
	}

	public String getName() {
		return name;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public int getCvv() {
		return cvv;
	}
}

