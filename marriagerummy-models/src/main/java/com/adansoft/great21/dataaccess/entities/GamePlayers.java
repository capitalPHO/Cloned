package com.adansoft.great21.dataaccess.entities;

// Generated May 11, 2015 1:47:12 PM by Hibernate Tools 3.4.0.CR1

/**
 * GamePlayers generated by hbm2java
 */
public class GamePlayers implements java.io.Serializable {

	private String gameInstanceId;
	private Integer numOfPlayers;
	private Long player1Idn;
	private Long player2Idn;
	private Long player3Idn;
	private Long player4Idn;
	private Long player5Idn;
	private Long player6Idn;
	private Long player7Idn;
	private Long player8Idn;

	public GamePlayers() {
	}

	public GamePlayers(String gameInstanceId) {
		this.gameInstanceId = gameInstanceId;
	}

	public GamePlayers(String gameInstanceId, Integer numOfPlayers,
			Long player1Idn, Long player2Idn, Long player3Idn, Long player4Idn,
			Long player5Idn, Long player6Idn, Long player7Idn, Long player8Idn) {
		this.gameInstanceId = gameInstanceId;
		this.numOfPlayers = numOfPlayers;
		this.player1Idn = player1Idn;
		this.player2Idn = player2Idn;
		this.player3Idn = player3Idn;
		this.player4Idn = player4Idn;
		this.player5Idn = player5Idn;
		this.player6Idn = player6Idn;
		this.player7Idn = player7Idn;
		this.player8Idn = player8Idn;
	}

	public String getGameInstanceId() {
		return this.gameInstanceId;
	}

	public void setGameInstanceId(String gameInstanceId) {
		this.gameInstanceId = gameInstanceId;
	}

	public Integer getNumOfPlayers() {
		return this.numOfPlayers;
	}

	public void setNumOfPlayers(Integer numOfPlayers) {
		this.numOfPlayers = numOfPlayers;
	}

	public Long getPlayer1Idn() {
		return this.player1Idn;
	}

	public void setPlayer1Idn(Long player1Idn) {
		this.player1Idn = player1Idn;
	}

	public Long getPlayer2Idn() {
		return this.player2Idn;
	}

	public void setPlayer2Idn(Long player2Idn) {
		this.player2Idn = player2Idn;
	}

	public Long getPlayer3Idn() {
		return this.player3Idn;
	}

	public void setPlayer3Idn(Long player3Idn) {
		this.player3Idn = player3Idn;
	}

	public Long getPlayer4Idn() {
		return this.player4Idn;
	}

	public void setPlayer4Idn(Long player4Idn) {
		this.player4Idn = player4Idn;
	}

	public Long getPlayer5Idn() {
		return this.player5Idn;
	}

	public void setPlayer5Idn(Long player5Idn) {
		this.player5Idn = player5Idn;
	}

	public Long getPlayer6Idn() {
		return this.player6Idn;
	}

	public void setPlayer6Idn(Long player6Idn) {
		this.player6Idn = player6Idn;
	}

	public Long getPlayer7Idn() {
		return this.player7Idn;
	}

	public void setPlayer7Idn(Long player7Idn) {
		this.player7Idn = player7Idn;
	}

	public Long getPlayer8Idn() {
		return this.player8Idn;
	}

	public void setPlayer8Idn(Long player8Idn) {
		this.player8Idn = player8Idn;
	}

}
