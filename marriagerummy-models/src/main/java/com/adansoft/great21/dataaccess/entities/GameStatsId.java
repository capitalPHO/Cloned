package com.adansoft.great21.dataaccess.entities;

// Generated May 8, 2015 10:59:13 AM by Hibernate Tools 3.4.0.CR1

/**
 * GameStatsId generated by hbm2java
 */
public class GameStatsId implements java.io.Serializable {

	private String gameInstanceId;
	private long wonByUserid;

	public GameStatsId() {
	}

	public GameStatsId(String gameInstanceId, long wonByUserid) {
		this.gameInstanceId = gameInstanceId;
		this.wonByUserid = wonByUserid;
	}

	public String getGameInstanceId() {
		return this.gameInstanceId;
	}

	public void setGameInstanceId(String gameInstanceId) {
		this.gameInstanceId = gameInstanceId;
	}

	public long getWonByUserid() {
		return this.wonByUserid;
	}

	public void setWonByUserid(long wonByUserid) {
		this.wonByUserid = wonByUserid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof GameStatsId))
			return false;
		GameStatsId castOther = (GameStatsId) other;

		return ((this.getGameInstanceId() == castOther.getGameInstanceId()) || (this
				.getGameInstanceId() != null
				&& castOther.getGameInstanceId() != null && this
				.getGameInstanceId().equals(castOther.getGameInstanceId())))
				&& (this.getWonByUserid() == castOther.getWonByUserid());
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getGameInstanceId() == null ? 0 : this.getGameInstanceId()
						.hashCode());
		result = 37 * result + (int) this.getWonByUserid();
		return result;
	}

}
