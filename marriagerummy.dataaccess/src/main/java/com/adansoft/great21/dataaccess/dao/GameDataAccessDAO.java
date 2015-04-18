package com.adansoft.great21.dataaccess.dao;


import com.adansoft.great21.dataaccess.gamedata.schemas.PersistNewGame;
import com.adansoft.great21.dataaccess.gamedata.schemas.PersistNewRound;
import com.adansoft.great21.dataaccess.gamedata.schemas.PersistPointsorCashforRound;
import com.adansoft.great21.dataaccess.gamedata.schemas.UpdateGameStatus;


public interface GameDataAccessDAO {

	public void createGame(PersistNewGame request);
	
	public void launchGame(UpdateGameStatus request);
	
	public void cancelGame(UpdateGameStatus request);
	
	public void updatePlayerInfoforRound(PersistPointsorCashforRound request);
	
	public void createNewRound(PersistNewRound request);
	
	public void finishRound(PersistNewRound request);
	
	
	

	
}
