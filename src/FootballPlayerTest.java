import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FootballPlayerTest 
{

	@Test
	void test() 
	{
		FootballPlayer benchedPlayer = new FootballPlayer();
		assertEquals("Name: Bobby Billy-Bob, Position: Benched, NFL Team: Washington Gun-Takers", benchedPlayer.toString());
	}

}
