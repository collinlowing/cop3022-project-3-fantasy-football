import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DefensiveBackTest 
{

	@Test
	void test() 
	{
		// Testing defaults
		DefensiveBack db = new DefensiveBack();
		assertEquals("Name: Bobby Billy-Bob, Position: Benched, NFL Team: Washington Gun-Takers\n"
				+ "Average Tackles Per Game: 0.0, Average Intercepts Per Game: 0.0, Average Forced Fumbles Per Game: 0.0\n"
				+ "Player's Rating: 0", db.toString());
		
		// Testing the parameterized constructor
		FootballPlayer p = new DefensiveBack("Kendrick Norton", Position.DEFENSIVEBACK, "Miami Dolphins", 10, 10, 10, 10);
		assertEquals("Name: Kendrick Norton, Position: Defensive Back, NFL Team: Miami Dolphins\n"
				+ "Average Tackles Per Game: 1.0, Average Intercepts Per Game: 1.0, Average Forced Fumbles Per Game: 1.0\n"
				+ "Player's Rating: 22", p.toString());
	}

}
