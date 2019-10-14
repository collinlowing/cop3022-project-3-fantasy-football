
public class RunningBack extends FootballPlayer
{
	private int runningAttempts;
	private int totalRunningYards;
	private int touchdowns;
	
	public RunningBack()
	{
		this("Bobby Billy-Bob", Position.BENCH, "Washington Gun-Takers", 0, 0, 0, 0);
	}
	
	public RunningBack(String name, Position position, String team, int numGames, int runningAttempts, int totalRunningYards, int touchdowns)
	{
		super(name, position, team, numGames);
		
		this.runningAttempts = runningAttempts;
		this.totalRunningYards = totalRunningYards;
		this.touchdowns = touchdowns;
	}
	
	public double averageYardsPerGame()
	{
		if(super.getNumGamesPlayed() <= 0)
			return 0;
		else
			return this.totalRunningYards / super.getNumGamesPlayed();
	}
	
	public double averageYardsPerAttempt()
	{
		if(super.getNumGamesPlayed() <= 0)
			return 0;
		else
			return this.totalRunningYards / this.runningAttempts;
	}
	
	public double averageTouchdownsPerGame()
	{
		if(super.getNumGamesPlayed() <= 0)
			return 0;
		else
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
				+ "Average Running Yards Per Game: " + this.averageYardsPerGame() + ", Average Yards Per Running Attempt: " + this.averageYardsPerAttempt() + ", Average Touchdowns Per Game: " + this.averageTouchdownsPerGame() + "\n"
				+ "Player's Rating: " + this.playerRating();
	}
}
