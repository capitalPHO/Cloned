package com.adansoft.great21.dataaccess.entities;

// Generated Apr 21, 2015 5:06:09 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * Game generated by hbm2java
 */
public class Game implements java.io.Serializable {

	private String gameInstanceId;
	private String gameLobby;
	private String gameType;
	private String hostedBy;
	private Date createdDate;
	private Boolean isActive;
	private Date cancelledDate;
	private Date completedDate;
	private Boolean pointsBased;
	private Boolean percardBased;

	public Game() {
	}

	public Game(String gameInstanceId, String gameLobby, String gameType,
			String hostedBy, Date createdDate) {
		this.gameInstanceId = gameInstanceId;
		this.gameLobby = gameLobby;
		this.gameType = gameType;
		this.hostedBy = hostedBy;
		this.createdDate = createdDate;
	}

	public Game(String gameInstanceId, String gameLobby, String gameType,
			String hostedBy, Date createdDate, Boolean isActive,
			Date cancelledDate, Date completedDate, Boolean pointsBased,
			Boolean percardBased) {
		this.gameInstanceId = gameInstanceId;
		this.gameLobby = gameLobby;
		this.gameType = gameType;
		this.hostedBy = hostedBy;
		this.createdDate = createdDate;
		this.isActive = isActive;
		this.cancelledDate = cancelledDate;
		this.completedDate = completedDate;
		this.pointsBased = pointsBased;
		this.percardBased = percardBased;
	}

	public String getGameInstanceId() {
		return this.gameInstanceId;
	}

	public void setGameInstanceId(String gameInstanceId) {
		this.gameInstanceId = gameInstanceId;
	}

	public String getGameLobby() {
		return this.gameLobby;
	}

	public void setGameLobby(String gameLobby) {
		this.gameLobby = gameLobby;
	}

	public String getGameType() {
		return this.gameType;
	}

	public void setGameType(String gameType) {
		this.gameType = gameType;
	}

	public String getHostedBy() {
		return this.hostedBy;
	}

	public void setHostedBy(String hostedBy) {
		this.hostedBy = hostedBy;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Date getCancelledDate() {
		return this.cancelledDate;
	}

	public void setCancelledDate(Date cancelledDate) {
		this.cancelledDate = cancelledDate;
	}

	public Date getCompletedDate() {
		return this.completedDate;
	}

	public void setCompletedDate(Date completedDate) {
		this.completedDate = completedDate;
	}

	public Boolean getPointsBased() {
		return this.pointsBased;
	}

	public void setPointsBased(Boolean pointsBased) {
		this.pointsBased = pointsBased;
	}

	public Boolean getPercardBased() {
		return this.percardBased;
	}

	public void setPercardBased(Boolean percardBased) {
		this.percardBased = percardBased;
	}

}
