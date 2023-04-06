package com.ott.dto;

import org.apache.ibatis.type.Alias;

@Alias("file")
public class FileDTO {
	private String path;
	private String fileName;
	private int inquiryNum;
	private int fileNum;
	private String type;
	
	public FileDTO() {}

	public FileDTO(String path, String fileName, int inquiryNum, int fileNum, String type) {
		this.path = path;
		this.fileName = fileName;
		this.inquiryNum = inquiryNum;
		this.fileNum = fileNum;
		this.type = type;
		switch (fileName.substring(fileName.lastIndexOf('.') + 1).toLowerCase()) {
		case "png":
		case "jpg":
		case "bmp":
		case "gif":
			this.type = "image";
			break;
		default:
			this.type = "normal";
		}
	}
	
	public String getFileName() {
		return fileName;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public int getInquiryNum() {
		return inquiryNum;
	}

	public void setInquiryNum(int inquiryNum) {
		this.inquiryNum = inquiryNum;
	}

	public int getFileNum() {
		return fileNum;
	}

	public void setFileNum(int fileNum) {
		this.fileNum = fileNum;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public String toString() {
		return "FileDTO [path=" + path + ", fileName=" + fileName + ", inquiryNum=" + inquiryNum + ", fileNum="
				+ fileNum + ", type=" + type + "]";
	}
	
	
	
	
	
	
	
}
