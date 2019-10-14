
public class QuarterBack extends FootballPlayer
{
	private int passAttempts;
	private int passCompletes;
	private int touchdownPasses;
	private int totalYardsPassed;
	
	public QuarterBack()
	{
		this("Bobby Billy-Bob", Position.BENCH, "Washington Gun-Takers", 0, 0, 0, 0, 0);
	}
	
	public QuarterBack(String name, Position position, String team, int numGames, int passAttempts, int passCompletes, int touchdownPasses, int totalYardsPassed)
	{
		super(name, position, team, numGames);
		
		this.passAttempts = passAttempts;
		this.passCompletes = passCompletes;
		this.touchdownPasses = touchdownPasses;
		this.totalYardsPassed = totalYardsPassed;
	}
	
	public double completionPercentage()
	{
		if(this.passAttempts <= 0)
			return 0;
		else
			return this.passCompletes / this.passAttempts;
	}
	
	public double averagePassingYardsPerGame()
	{
		if(super.getNumGamesPlayed() <= 0)
			return 0;
		else
			return this.totalYardsPassed / super.getNumGamesPlayed();
	}
	
	public double averageTouchdownsPerGame()
	{
		if(super.getNumGamesPlayed() <= 0)
			return 0;
		else
			return this.touchdownPasses / super.getNumGamesPlayed();
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
		return super.toString() 
				+ "Completion Percentage: " + completionPercentage() + ", Average Passing Yards Per Game: " + averagePassingYardsPerGame() + "\n"
				+ "Average Touch Downs Per Game: " + averageTouchdownsPerGame() + ", Player's Rating: " + playerRating();
	}
}
