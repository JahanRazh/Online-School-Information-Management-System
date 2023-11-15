package com.school;

public class Subject {
	private String subID;
	private int teacherID;
	private String subName;
	private String desc;
	private int hrs;
	
	public Subject(String subID, int teacherID, String subName, String desc, int hrs) {
		this.subID = subID;
		this.subName = subName;
		this.desc = desc;
		this.hrs = hrs;
		this.teacherID = teacherID;
	}

	public int getteacherID() {
		return teacherID;
	}

	public String getSubID() {
		return subID;
	}

	public String getSubName() {
		return subName;
	}

	public String getDesc() {
		return desc;
	}

	public int getHrs() {
		return hrs;
	}

}
