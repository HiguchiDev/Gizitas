package database_access;
import java.io.Serializable;
import java.sql.Date;

public class IdaApplicationFormInfoTbl implements Serializable{
	private String applicationFromNbr;
	private Date entryDt;
	private String groupId;

	public String getApplicationFromNbr() {
		return applicationFromNbr;
	}
	public void setApplicationFromNbr(String applicationFromNbr) {
		this.applicationFromNbr = applicationFromNbr;
	}
	public Date getEntryDt() {
		return entryDt;
	}
	public void setEntryDt(Date entryDt) {
		this.entryDt = entryDt;
	}
	public String getGroupId() {
		return groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

}
