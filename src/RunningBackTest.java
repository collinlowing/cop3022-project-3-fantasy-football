import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RunningBackTest 
{

	@Test
	void test() 
	{
		// Default constructor
		RunningBack rb = new RunningBack();
		assertEquals("Name: Bobby Billy-Bob, Position: Benched, NFL Team: Washington Gun-Takers\n"
				+ "Average Running Yards Per Game: 0.0, Average Yards Per Running Attempt: 0.0, Average Touchdowns Per Game: 0.0\n"
				+ "Player's Rating: 0", rb.toString());
		
		// Parameterized constructor
		FootballPlayer p = new RunningBack("Kenyan Drake", Position.RUNNINGBACK, "Miami Dolphins", 10, 10, 10, 10);
		assertEquals("Name: Kenyan Drake, Position: Running Back, NFL Team: Miami Dolphins\n"
				+ "Average Running Yards Per Game: 1.0, Average Yards Per Running Attempt: 1.0, Average Touchdowns Per Game: 1.0\n"
				+ "Player's Rating: 2", p.toString());
	}

}
