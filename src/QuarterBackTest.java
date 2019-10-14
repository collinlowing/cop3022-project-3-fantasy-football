import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QuarterBackTest 
{

	@Test
	void test() 
	{
		QuarterBack qb = new QuarterBack();
		assertEquals("Name: Bobby Billy-Bob, Position: Benched, NFL Team: Washington Gun-Takers\n"
				+ "Completion Percentage: 0.0, Average Passing Yards Per Game: 0.0\n"
				+ "Average Touch Downs Per Game: 0.0, Player's Rating: 0", qb.toString());
		
		FootballPlayer p = new QuarterBack("Josh Rosen", Position.QUARTERBACK, "Miami Dolphins", 10, 10, 10, 10, 10);
		assertEquals("Name: Josh Rosen, Position: Quarter Back, NFL Team: Miami Dolphins\n"
				+ "Completion Percentage: 1.0, Average Passing Yards Per Game: 1.0\n"
				+ "Average Touch Downs Per Game: 1.0, Player's Rating: 101", p.toString());
	}

}
