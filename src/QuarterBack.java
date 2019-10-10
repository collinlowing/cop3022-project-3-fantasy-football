
public class QuarterBack extends FootballPlayer
{
	private int passAttempts;
	private int passCompletes;
	private int touchdownPasses;
	private int totalYardsPassed;
	
	public QuarterBack()
	{
		this(0, 0, 0, 0);
	}
	
	public QuarterBack(int passAttempts, int passCompletes, int touchdownPasses, int totalYardsPassed)
	{
		this.passAttempts = passAttempts;
		this.passCompletes = passCompletes;
		this.touchdownPasses = touchdownPasses;
		this.totalYardsPassed = totalYardsPassed;
	}
	
	public double completionPercentage()
	{
		return this.passCompletes / this.passAttempts;
	}
	
	public double averagePassingYardsPerGame()
	{
		return super.getNumGamesPlayed() / this.totalYardsPassed;
	}
	
	public double averageTouchdownsPerGame()
	{
		return super.getNumGamesPlayed() / this.touchdownPasses;
	}
	
	@Override
	public int playerRating()
	{
		int rating = 0;
		
		rating = (int) (averageTouchdownsPerGame() + (completionPercentage() * 100) + (averagePassingYardsPerGame() / 5));
		
		return rating;
	}
	
	public String toString()
	{
		return super.toString() + "Completion Percentage: " + completionPercentage() + ", Average Passing Yards Per Game: " + averagePassingYardsPerGame() + "\nAverage Touch Downs Per Game: " + averageTouchdownsPerGame() + ", Player's Rating: " + playerRating();
	}
}
