
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
		return super.getNumGamesPlayed() / this.numTackles;
	}
	
	public double averageInterceptionsPerGame()
	{
		return super.getNumGamesPlayed() / this.numIntercepts;
	}
	
	public double averageForcedFumblesPerGame()
	{
		return super.getNumGamesPlayed() / this.numForcedFumbles;
	}
	
	@Override
	public int playerRating()
	{
		return (int) ((averageTacklesPerGame() + averageInterceptionsPerGame() + (averageForcedFumblesPerGame()/5)) * 10);
	}
	
	public String toString()
	{
		return this.numTackles + " " + this.numIntercepts + " " + this.numForcedFumbles + " " + playerRating();
	}
}
