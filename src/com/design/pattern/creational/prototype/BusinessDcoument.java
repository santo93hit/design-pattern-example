package com.design.pattern.creational.prototype;

import java.util.Date;

public class BusinessDcoument implements Cloneable{

	private String documentKey;
	private String documentName;
	private Date uploadedDate;
	
	public BusinessDcoument() {
		
	}	

	/**
	 * @param documentKey
	 * @param documentName
	 * @param uploadedDate
	 */
	public BusinessDcoument(String documentKey, String documentName, Date uploadedDate) {
		super();
		this.documentKey = documentKey;
		this.documentName = documentName;
		this.uploadedDate = uploadedDate;
	}

	public String getDocumentKey() {
		return documentKey;
	}

	public void setDocumentKey(String documentKey) {
		this.documentKey = documentKey;
	}

	public String getDocumentName() {
		return documentName;
	}

	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}

	public Date getUploadedDate() {
		return uploadedDate;
	}

	public void setUploadedDate(Date uploadedDate) {
		this.uploadedDate = uploadedDate;
	}

	public BusinessDcoument clone() throws CloneNotSupportedException{
		return new BusinessDcoument(this.documentKey,this.documentName,this.uploadedDate);
	}
	
	@Override
	public String toString() {
		return "BusinessDcoument [documentKey=" + documentKey + ", documentName=" + documentName + ", uploadedDate="
				+ uploadedDate + "]";
	}

}
