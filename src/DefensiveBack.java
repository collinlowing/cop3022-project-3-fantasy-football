
public class DefensiveBack extends FootballPlayer
{
	private int numTackles;
	private int numIntercepts;
	private int numForcedFumbles;
	
	public DefensiveBack()
	{
		this("Bobby Billy-Bob", Position.BENCH, "Washington Gun-Takers", 0, 0, 0, 0);
	}
	
	public DefensiveBack(String name, Position position, String team, int numGames, int numTackles, int numIntercepts, int numForcedFumbles)
	{
		super(name, position, team, numGames);
		
		this.numTackles = numTackles;
		this.numIntercepts = numIntercepts;
		this.numForcedFumbles = numForcedFumbles;
	}
	
	public double averageTacklesPerGame()
	{
		if(super.getNumGamesPlayed() <= 0)
			return 0;
		else
			return this.numTackles / super.getNumGamesPlayed();
	}
	
	public double averageInterceptionsPerGame()
	{
		if(super.getNumGamesPlayed() <= 0)
			return 0;
		else
			return this.numIntercepts / super.getNumGamesPlayed();
	}
	
	public double averageForcedFumblesPerGame()
	{
		if(super.getNumGamesPlayed() <= 0)
			return 0;
		else
			return this.numForcedFumbles / super.getNumGamesPlayed();
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
