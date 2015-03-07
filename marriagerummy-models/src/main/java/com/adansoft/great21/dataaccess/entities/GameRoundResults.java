package com.adansoft.great21.dataaccess.entities;

// Generated Mar 6, 2015 4:06:59 PM by Hibernate Tools 4.0.0

/**
 * GameRoundResults generated by hbm2java
 */
public class GameRoundResults implements java.io.Serializable {

	private GameRoundResultsId id;
	private Integer points;
	private Double cash;
	private Boolean hasWon;

	public GameRoundResults() {
	}

	public GameRoundResults(GameRoundResultsId id) {
		this.id = id;
	}

	public GameRoundResults(GameRoundResultsId id, Integer points, Double cash,
			Boolean hasWon) {
		this.id = id;
		this.points = points;
		this.cash = cash;
		this.hasWon = hasWon;
	}

	public GameRoundResultsId getId() {
		return this.id;
	}

	public void setId(GameRoundResultsId id) {
		this.id = id;
	}

	public Integer getPoints() {
		return this.points;
	}

	public void setPoints(Integer points) {
		this.points = points;
	}

	public Double getCash() {
		return this.cash;
	}

	public void setCash(Double cash) {
		this.cash = cash;
	}

	public Boolean getHasWon() {
		return this.hasWon;
	}

	public void setHasWon(Boolean hasWon) {
		this.hasWon = hasWon;
	}

}
