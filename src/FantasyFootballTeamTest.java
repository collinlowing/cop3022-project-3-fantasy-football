import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FantasyFootballTeamTest 
{

	@Test
	void test() 
	{
		// Initializing team
		FantasyFootballTeam team1 = new FantasyFootballTeam("My Team", "Collin Lowing", 3);
		
		// Initializes some test objects
		FootballPlayer cWilkins = new DefensiveBack("Christian Wilkins", Position.DEFENSIVEBACK, "Miami Dolphins", 10, 10, 10, 10);	
		FootballPlayer jRosen = new QuarterBack("Josh Rosen", Position.QUARTERBACK, "Miami Dolphins", 10, 10, 10, 10, 10);			
		FootballPlayer kDrake = new RunningBack("Kenyan Drake", Position.RUNNINGBACK, "Miami Dolphins", 10, 10, 10, 10);
		
		// Adds player correctly
		assertEquals("Player added.", team1.addPlayer(cWilkins));
		assertEquals("Player added.", team1.addPlayer(jRosen));
		assertEquals("Player added.", team1.addPlayer(kDrake));
		
		// Stops out of bounds errors successfully when array is full
		assertEquals("ERROR: There is no more room on the team.", team1.addPlayer(cWilkins));
		
		// Prints team list correctly
		assertEquals("Team Name: My Team Owner: Collin Lowing\n\n"
				+ "Name: Christian Wilkins, Position: Defensive Back, NFL Team: Miami Dolphins\n"
				+ "Average Tackles Per Game: 1.0, Average Intercepts Per Game: 1.0, Average Forced Fumbles Per Game: 1.0\n"
				+ "Player's Rating: 22\n\n"
				+ "Name: Josh Rosen, Position: Quarter Back, NFL Team: Miami Dolphins\n" 
				+ "Completion Percentage: 1.0, Average Passing Yards Per Game: 1.0\n"
				+ "Average Touch Downs Per Game: 1.0, Player's Rating: 101\n\n"
				+ "Name: Kenyan Drake, Position: Running Back, NFL Team: Miami Dolphins\n"
				+ "Average Running Yards Per Game: 1.0, Average Yards Per Running Attempt: 1.0, Average Touchdowns Per Game: 1.0\n"
				+ "Player's Rating: 2\n\n", team1.toString());
		
		// Searches for players by position, non-case sensitive
		assertEquals("Name: Christian Wilkins, Position: Defensive Back, NFL Team: Miami Dolphins\n"
				+ "Average Tackles Per Game: 1.0, Average Intercepts Per Game: 1.0, Average Forced Fumbles Per Game: 1.0\n"
				+ "Player's Rating: 22", team1.findPlayerbyPosition("defensive back"));
		assertEquals("Name: Josh Rosen, Position: Quarter Back, NFL Team: Miami Dolphins\n" 
				+ "Completion Percentage: 1.0, Average Passing Yards Per Game: 1.0\n"
				+ "Average Touch Downs Per Game: 1.0, Player's Rating: 101", team1.findPlayerbyPosition("Quarter Back"));
		
		// Returns no found player at position message successfully
		assertEquals("No player at Mascot", team1.findPlayerbyPosition("Mascot"));
	}

}
