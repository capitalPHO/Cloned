package com.adansoft.great21.dataaccess.entities;

// Generated May 8, 2015 10:59:13 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * UserAudit generated by hbm2java
 */
public class UserAudit implements java.io.Serializable {

	private Long logInstanceId;
	private long userId;
	private Date lastLoggedinDate;
	private Date lastLoggedoutDate;
	private String device;

	public UserAudit() {
	}

	public UserAudit(long userId) {
		this.userId = userId;
	}

	public UserAudit(long userId, Date lastLoggedinDate,
			Date lastLoggedoutDate, String device) {
		this.userId = userId;
		this.lastLoggedinDate = lastLoggedinDate;
		this.lastLoggedoutDate = lastLoggedoutDate;
		this.device = device;
	}

	public Long getLogInstanceId() {
		return this.logInstanceId;
	}

	public void setLogInstanceId(Long logInstanceId) {
		this.logInstanceId = logInstanceId;
	}

	public long getUserId() {
		return this.userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public Date getLastLoggedinDate() {
		return this.lastLoggedinDate;
	}

	public void setLastLoggedinDate(Date lastLoggedinDate) {
		this.lastLoggedinDate = lastLoggedinDate;
	}

	public Date getLastLoggedoutDate() {
		return this.lastLoggedoutDate;
	}

	public void setLastLoggedoutDate(Date lastLoggedoutDate) {
		this.lastLoggedoutDate = lastLoggedoutDate;
	}

	public String getDevice() {
		return this.device;
	}

	public void setDevice(String device) {
		this.device = device;
	}

}
