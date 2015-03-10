package com.adansoft.great21.dataaccess.entities;

// Generated Mar 10, 2015 11:08:35 AM by Hibernate Tools 3.4.0.CR1

/**
 * GameRoundId generated by hbm2java
 */
public class GameRoundId implements java.io.Serializable {

	private String gameRoundId;
	private String gameInstanceId;

	public GameRoundId() {
	}

	public GameRoundId(String gameRoundId, String gameInstanceId) {
		this.gameRoundId = gameRoundId;
		this.gameInstanceId = gameInstanceId;
	}

	public String getGameRoundId() {
		return this.gameRoundId;
	}

	public void setGameRoundId(String gameRoundId) {
		this.gameRoundId = gameRoundId;
	}

	public String getGameInstanceId() {
		return this.gameInstanceId;
	}

	public void setGameInstanceId(String gameInstanceId) {
		this.gameInstanceId = gameInstanceId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof GameRoundId))
			return false;
		GameRoundId castOther = (GameRoundId) other;

		return ((this.getGameRoundId() == castOther.getGameRoundId()) || (this
				.getGameRoundId() != null && castOther.getGameRoundId() != null && this
				.getGameRoundId().equals(castOther.getGameRoundId())))
				&& ((this.getGameInstanceId() == castOther.getGameInstanceId()) || (this
						.getGameInstanceId() != null
						&& castOther.getGameInstanceId() != null && this
						.getGameInstanceId().equals(
								castOther.getGameInstanceId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getGameRoundId() == null ? 0 : this.getGameRoundId()
						.hashCode());
		result = 37
				* result
				+ (getGameInstanceId() == null ? 0 : this.getGameInstanceId()
						.hashCode());
		return result;
	}

}
