<div id="GameArena" style="display: none">
	<div class="row">
		<div class="col-lg-12">
			<h2>My Game</h2>
		</div>
		<div id="Arena" class="col-lg-12">
			<div id="Joker" class="joker"></div>
			<div id="centerstage" class="centerstage"></div>
			<div id="DeckNextCard" class="deckNextCard"></div>
			<div id="OpenCard" class="opencard"></div>
			<%@include file="./GameArena_GameTools.jsp" %>
			
			<div id="player1" class="player player1-position">			
				<div class="indicator">
					<p>you</p>
				</div>
				<i class=" fa fa-user"></i>
				<%@include file="./GameArena_CardDropPickUpArea.jsp" %>
				<div id="cards" class="player-cards">
                    <div class="pointDisplayer">-20</div>
                    
					<div id="cardContent">
						<div id="Sevencard-1" data-replacecard="false"
							class="card Sevencard-1-pos">
							<div class="cardindicator"></div>
						</div>
						<div id="Sevencard-2" data-replacecard="false"
							class="card Sevencard-2-pos">
							<div class="cardindicator"></div>
						</div>
						<div id="Sevencard-3" data-replacecard="false"
							class="card Sevencard-3-pos">
							<div class="cardindicator"></div>
						</div>
						<div id="Sevencard-4" data-replacecard="false"
							class="card Sevencard-4-pos">
							<div class="cardindicator"></div>
						</div>
						<div id="Sevencard-5" data-replacecard="false"
							class="card Sevencard-5-pos">
							<div class="cardindicator"></div>
						</div>
						<div id="Sevencard-6" data-replacecard="false"
							class="card Sevencard-6-pos">
							<div class="cardindicator"></div>
						</div>
						<div id="Sevencard-7" data-replacecard="false"
							class="card Sevencard-7-pos">
							<div class="cardindicator"></div>
						</div>
					</div>

					<!-- <div id="card-1" class="card card-1-pos"></div>
					<div id="card0" class="card card0-pos"></div>
					<div id="card1" class="card card1-pos"></div>
					<div id="card2" class="card card2-pos"></div>
					<div id="card3" class="card card3-pos"></div>
					<div id="card4" class="card card4-pos"></div>
					<div id="card5" class="card card5-pos"></div>
					<div id="card6" class="card card6-pos"></div>
					<div id="card7" class="card card7-pos"></div>
					<div id="card8" class="card card8-pos"></div>
					<div id="card9" class="card card9-pos"></div>
					<div id="card10" class="card card10-pos"></div>
					<div id="card11" class="card card11-pos"></div> -->
				</div>
			</div>
			<div id="player2" class="player player2-position">
				<div class="indicator">
					<p>Player 2</p>
				</div>
				<i class="fa fa-user"></i>
				<div class="PlayerDropCard drop2"></div>
			</div>
			<div id="player3" class="player player3-position">
				<div class="indicator">
					<p>Player 3</p>
				</div>
				<i class="fa fa-user"></i>
				<div class="PlayerDropCard drop3"></div>
			</div>
			<div id="player4" class="player player4-position">
				<div class="indicator">
					<p>Player 4</p>
				</div>
				<i class="fa fa-user"></i>
				<div class="PlayerDropCard drop4"></div>
			</div>
			<div id="player5" class="player player5-position">
				<div class="indicator">
					<p>Player 5</p>
				</div>
				<i class="fa fa-user"></i>
				<div class="PlayerDropCard drop5"></div>
			</div>
			<div id="player6" class="player player6-position">
				<div class="indicator">
					<p>Player 6</p>
				</div>
				<i class="fa fa-user"></i>
				<div class="PlayerDropCard drop6"></div>
			</div>
			<div id="player7" class="player player7-position">
				<div class="indicator">
					<p>Player 7</p>
				</div>
				<i class="fa fa-user"></i>
				<div class="PlayerDropCard drop7"></div>
			</div>
			<div id="player8" class="player player8-position">
				<div class="indicator">
					<p>Player 8</p>
				</div>
				<i class="fa fa-user"></i>
				<div class="PlayerDropCard drop8"></div>
			</div>
		</div>
	</div>
</div>