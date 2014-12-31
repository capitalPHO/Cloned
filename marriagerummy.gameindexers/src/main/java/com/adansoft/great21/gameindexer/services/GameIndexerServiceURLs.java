package com.adansoft.great21.gameindexer.services;

public class GameIndexerServiceURLs {

	public final static String GAMEBROWSER_BASE = "/IndexerServices/GameBrowser";
	public final static String CREATEGAME = "createGame";
	public final static String DELETEGAME = "removeGame";
	public final static String GETGAMELIST = "GetGameListinLobby/{lobbyName}";
	public final static String ADD_PLAYER = "Player/Add";
	public final static String REMOVE_PLAYER = "Player/Remove";
	
	
	public final static String GAMELAUNCHER_BASE = "/IndexerServices/GameLauncher";
	public final static String ADDCHATMESSAGES = "/ChatMessages/Add";
	public final static String GETCHATMESSAGES = "/ChatMessages/Get";
	public final static String GETPLAYERSINGAME = "/Game/GetPlayers";
}
