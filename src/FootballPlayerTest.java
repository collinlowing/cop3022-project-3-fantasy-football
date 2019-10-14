import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FootballPlayerTest 
{

	@Test
	void test() 
	{
		FootballPlayer kNorton = new DefensiveBack("Kendrick Norton", Position.DEFENSIVEBACK, "Miami Dolphins", 10, 10, 10, 10);	//Player Rating == 22
		FootballPlayer cWilkins = new DefensiveBack("Christian Wilkins", Position.DEFENSIVEBACK, "Miami Dolphins", 10, 10, 10, 10);	//Player Rating == 22
		FootballPlayer jRosen = new QuarterBack("Josh Rosen", Position.QUARTERBACK, "Miami Dolphins", 10, 10, 10, 10, 10);			//Player Rating == 101
		FootballPlayer kDrake = new RunningBack("Kenyan Drake", Position.RUNNINGBACK, "Miami Dolphins", 10, 10, 10, 10);			//Player Rating == 2
		
		assertEquals(0, kNorton.compareTo(cWilkins.playerRating()));
		assertEquals(1, jRosen.compareTo(kDrake.playerRating()));
		assertEquals(-1, kDrake.compareTo(kNorton.playerRating()));
	}

}
