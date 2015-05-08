package com.adansoft.great21.dataaccess.entities;

// Generated May 8, 2015 10:59:13 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * GameRound generated by hbm2java
 */
public class GameRound implements java.io.Serializable {

	private GameRoundId id;
	private String status;
	private Date createdDate;
	private Date completedDate;

	public GameRound() {
	}

	public GameRound(GameRoundId id) {
		this.id = id;
	}

	public GameRound(GameRoundId id, String status, Date createdDate,
			Date completedDate) {
		this.id = id;
		this.status = status;
		this.createdDate = createdDate;
		this.completedDate = completedDate;
	}

	public GameRoundId getId() {
		return this.id;
	}

	public void setId(GameRoundId id) {
		this.id = id;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getCompletedDate() {
		return this.completedDate;
	}

	public void setCompletedDate(Date completedDate) {
		this.completedDate = completedDate;
	}

}
