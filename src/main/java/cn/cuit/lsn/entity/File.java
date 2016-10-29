package cn.cuit.lsn.entity;

import java.util.Date;

public class File {
	
	private long fileId;
	
	private String fileName;
	
	private int fileType;
	
	private String fileLoc;
	
	private Date fileCreateTime;
	
	private Date fileChangedTime;
	
	public long getFileId() {
		return fileId;
	}
	
	public void setFileId(long fileId) {
		this.fileId = fileId;
	}
	
	public String getFileName() {
		return fileName;
	}
	
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	public int getFileType() {
		return fileType;
	}
	
	public void setFileType(int fileType) {
		this.fileType = fileType;
	}
	
	public String getFileLoc() {
		return fileLoc;
	}
	
	public void setFileLoc(String fileLoc) {
		this.fileLoc = fileLoc;
	}
	
	public Date getFileCreateTime() {
		return fileCreateTime;
	}
	
	public void setFileCreateTime(Date fileCreateTime) {
		this.fileCreateTime = fileCreateTime;
	}
	
	public Date getFileChangedTime() {
		return fileChangedTime;
	}
	
	public void setFileChangedTime(Date fileChangedTime) {
		this.fileChangedTime = fileChangedTime;
	}
	
}
