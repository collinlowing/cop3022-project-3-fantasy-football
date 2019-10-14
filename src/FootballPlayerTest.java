import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FootballPlayerTest 
{

	@Test
	void test() 
	{
		// Initializing objects for testing
		FootballPlayer kNorton = new DefensiveBack("Kendrick Norton", Position.DEFENSIVEBACK, "Miami Dolphins", 10, 10, 10, 10);	//Player Rating == 22
		FootballPlayer cWilkins = new DefensiveBack("Christian Wilkins", Position.DEFENSIVEBACK, "Miami Dolphins", 10, 10, 10, 10);	//Player Rating == 22
		FootballPlayer jRosen = new QuarterBack("Josh Rosen", Position.QUARTERBACK, "Miami Dolphins", 10, 10, 10, 10, 10);			//Player Rating == 101
		FootballPlayer kDrake = new RunningBack("Kenyan Drake", Position.RUNNINGBACK, "Miami Dolphins", 10, 10, 10, 10);			//Player Rating == 2
		
		// Equal
		assertEquals(0, kNorton.compareTo(cWilkins.playerRating()));
		// Greater than
		assertEquals(1, jRosen.compareTo(kDrake.playerRating()));
		// Less than
		assertEquals(-1, kDrake.compareTo(kNorton.playerRating()));
	}

}
