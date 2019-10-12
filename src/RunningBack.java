
public class RunningBack extends FootballPlayer
{
	private int runningAttempts;
	private int totalRunningYards;
	private int touchdowns;
	
	public RunningBack()
	{
		this(0, 0, 0);
	}
	
	public RunningBack(int runningAttempts, int totalRunningYards, int touchdowns)
	{
		this.runningAttempts = runningAttempts;
		this.totalRunningYards = totalRunningYards;
		this.touchdowns = touchdowns;
	}
	
	public double averageYardsPerGame()
	{
		return this.totalRunningYards / super.getNumGamesPlayed();
	}
	
	public double averageYardsPerAttempt()
	{
		return this.totalRunningYards / this.runningAttempts;
	}
	
	public double averageTouchdownsPerGame()
	{
		return this.touchdowns / super.getNumGamesPlayed();
	}
	
	@Override
	public int playerRating()
	{
		return (int) (averageTouchdownsPerGame() + averageYardsPerAttempt()+ (averageYardsPerGame() / 5));
	}
	
	public String toString()
	{
		return super.toString()
				+ "Average Running Yards Per Game: " + this.averageYardsPerGame() + ", Average Yards Per Running Attempt: " + this.averageYardsPerAttempt() + ", Average Touchdowns Per Game: " + this.averageTouchdownsPerGame();
	}
}
