
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
		return super.getNumGamesPlayed() / this.totalRunningYards;
	}
	
	public double averageYardsPerAttempt()
	{
		return this.totalRunningYards / this.runningAttempts;
	}
	
	public double averageTouchdownsPerGame()
	{
		return super.getNumGamesPlayed() / this.touchdowns;
	}
	
	@Override
	public int playerRating()
	{
		return (int) (averageTouchdownsPerGame() + averageYardsPerAttempt()+ (averageYardsPerGame() / 5));
	}
	
	public String toString()
	{
		return "";
	}
}
