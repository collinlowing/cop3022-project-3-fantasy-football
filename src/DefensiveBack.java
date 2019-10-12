
public class DefensiveBack extends FootballPlayer
{
	private int numTackles;
	private int numIntercepts;
	private int numForcedFumbles;
	
	public DefensiveBack()
	{
		this(0, 0, 0);
	}
	
	public DefensiveBack(int numTackles, int numIntercepts, int numForcedFumbles)
	{
		this.numTackles = numTackles;
		this.numIntercepts = numIntercepts;
		this.numForcedFumbles = numForcedFumbles;
	}
	
	public double averageTacklesPerGame()
	{
		return this.numTackles / super.getNumGamesPlayed();
	}
	
	public double averageInterceptionsPerGame()
	{
		return this.numIntercepts / super.getNumGamesPlayed();
	}
	
	public double averageForcedFumblesPerGame()
	{
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
				+ "Average Tacles Per Game: " + this.averageInterceptionsPerGame() + ", Average Intercepts Per Game: " + this.averageInterceptionsPerGame() + ", Average Forced Fumbles Per Game: " + this.averageForcedFumblesPerGame() + "\n" 
				+ "Player's Rating: " + this.playerRating();
	}
}
