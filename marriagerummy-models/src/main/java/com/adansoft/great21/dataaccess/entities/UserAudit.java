package com.adansoft.great21.dataaccess.entities;

// Generated Mar 9, 2015 3:06:38 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * UserAudit generated by hbm2java
 */
public class UserAudit implements java.io.Serializable {

	private Long logInstanceId;
	private String nickname;
	private Date lastLoggedinDate;
	private Date lastLoggedoutDate;

	public UserAudit() {
	}

	public UserAudit(String nickname) {
		this.nickname = nickname;
	}

	public UserAudit(String nickname, Date lastLoggedinDate,
			Date lastLoggedoutDate) {
		this.nickname = nickname;
		this.lastLoggedinDate = lastLoggedinDate;
		this.lastLoggedoutDate = lastLoggedoutDate;
	}

	public Long getLogInstanceId() {
		return this.logInstanceId;
	}

	public void setLogInstanceId(Long logInstanceId) {
		this.logInstanceId = logInstanceId;
	}

	public String getNickname() {
		return this.nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
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

}
