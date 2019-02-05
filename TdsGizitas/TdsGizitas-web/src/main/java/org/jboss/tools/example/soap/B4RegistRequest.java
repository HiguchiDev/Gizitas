package org.jboss.tools.example.soap;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "B4RegistRequest")
public class B4RegistRequest {

	private String groupId;
	private String entryDate;
	private String applicationTypeCode;
	private String applicationSubTypeCode;
	private String receptTypeCode;

	public String getGroupId() {
		return groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	public String getEntryDate() {
		return entryDate;
	}
	public void setEntryDate(String entryDate) {
		this.entryDate = entryDate;
	}
	public String getApplicationTypeCode() {
		return applicationTypeCode;
	}
	public void setApplicationTypeCode(String applicationTypeCode) {
		this.applicationTypeCode = applicationTypeCode;
	}
	public String getApplicationSubTypeCode() {
		return applicationSubTypeCode;
	}
	public void setApplicationSubTypeCode(String applicationSubTypeCode) {
		this.applicationSubTypeCode = applicationSubTypeCode;
	}
	public String getReceptTypeCode() {
		return receptTypeCode;
	}
	public void setReceptTypeCode(String receptTypeCode) {
		this.receptTypeCode = receptTypeCode;
	}

}
