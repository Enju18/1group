package com.ott.dto;

import org.apache.ibatis.type.Alias;

@Alias("inquiryAnswer")
public class InquiryAnswerDTO {
	private int InquiryNum;
	private String title;
	private String content;
	private String wdate;
	
	public InquiryAnswerDTO() {}
	
	public InquiryAnswerDTO(int inquiryNum, String title, String content, String wdate) {
		super();
		InquiryNum = inquiryNum;
		this.title = title;
		this.content = content;
		this.wdate = wdate;
	}

	public int getInquiryNum() {
		return InquiryNum;
	}

	public void setInquiryNum(int inquiryNum) {
		InquiryNum = inquiryNum;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWdate() {
		return wdate;
	}

	public void setWdate(String wdate) {
		this.wdate = wdate;
	}

	@Override
	public String toString() {
		return "InquiryAnswerDTO [InquiryNum=" + InquiryNum + ", title=" + title + ", content=" + content + ", wdate="
				+ wdate + "]";
	}

	
}
