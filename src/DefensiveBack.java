
// Sub Class
public class DefensiveBack extends FootballPlayer
{
	private int numTackles;
	private int numIntercepts;
	private int numForcedFumbles;
	private int numGames;
	
	// Default constructor
	public DefensiveBack()
	{
		this("Bobby Billy-Bob", Position.BENCH, "Washington Gun-Takers", 0, 0, 0, 0);
	}
	
	// Parameterized constructor
	public DefensiveBack(String name, Position position, String team, int numGames, int numTackles, int numIntercepts, int numForcedFumbles)
	{
		super(name, position, team, numGames);
		
		this.numGames = numGames;
		this.numTackles = numTackles;
		this.numIntercepts = numIntercepts;
		this.numForcedFumbles = numForcedFumbles;
	}
	
	public double averageTacklesPerGame()
	{
		if(this.numGames <= 0)								// Safeguards against dividing by 0 error
			return 0;
		else
			return this.numTackles / this.numGames;
	}
	
	public double averageInterceptionsPerGame()
	{
		if(this.numGames <= 0)								// Safeguards against dividing by 0 error
			return 0;
		else
			return this.numIntercepts / this.numGames;
	}
	
	public double averageForcedFumblesPerGame()
	{
		if(this.numGames <= 0)								// Safeguards against dividing by 0 error
			return 0;
		else
			return this.numForcedFumbles / this.numGames;
	}
	
	@Override
	public int playerRating()
	{
		return (int) ((averageTacklesPerGame() + averageInterceptionsPerGame() + (averageForcedFumblesPerGame()/5)) * 10);
	}
	
	public String toString()
	{
		return super.toString()
				+ "Average Tackles Per Game: " + this.averageTacklesPerGame() + ", Average Intercepts Per Game: " + this.averageInterceptionsPerGame() + ", Average Forced Fumbles Per Game: " + this.averageForcedFumblesPerGame() + "\n" 
				+ "Player's Rating: " + this.playerRating();
	}
}
