package com.school;

public class Notice {
	private int noticeID;
	private String title;
	private String desc;
	
	public Notice(int noticeID, String title, String desc) {
		this.noticeID = noticeID;
		this.title = title;
		this.desc = desc;
	}

	public int getNoticeID() {
		return noticeID;
	}

	public String getTitle() {
		return title;
	}

	public String getDesc() {
		return desc;
	}
	

}
