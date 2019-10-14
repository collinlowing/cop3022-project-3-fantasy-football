
// Sub Class
public class QuarterBack extends FootballPlayer
{
	private int passAttempts;
	private int passCompletes;
	private int touchdownPasses;
	private int totalYardsPassed;
	private int numGames;
	
	// Default constructor
	public QuarterBack()
	{
		this("Bobby Billy-Bob", Position.BENCH, "Washington Gun-Takers", 0, 0, 0, 0, 0);
	}
	
	// Parameterized constructor
	public QuarterBack(String name, Position position, String team, int numGames, int passAttempts, int passCompletes, int touchdownPasses, int totalYardsPassed)
	{
		super(name, position, team, numGames);
		
		this.numGames = numGames;
		this.passAttempts = passAttempts;
		this.passCompletes = passCompletes;
		this.touchdownPasses = touchdownPasses;
		this.totalYardsPassed = totalYardsPassed;
	}
	
	public double completionPercentage()
	{
		if(this.passAttempts <= 0)							// Safeguards against dividing by 0 error
			return 0;
		else
			return this.passCompletes / this.passAttempts;
	}
	
	public double averagePassingYardsPerGame()				// Safeguards against dividing by 0 error
	{
		if(this.numGames <= 0)
			return 0;
		else
			return this.totalYardsPassed / this.numGames;
	}
	
	public double averageTouchdownsPerGame()				// Safeguards against dividing by 0 error
	{
		if(this.numGames <= 0)
			return 0;
		else
			return this.touchdownPasses / this.numGames;
	}
	
	@Override
	public int playerRating()
	{
		return (int) (averageTouchdownsPerGame() + (completionPercentage() * 100) + (averagePassingYardsPerGame() / 5));
	}
	
	public String toString()
	{
		return super.toString() 
				+ "Completion Percentage: " + completionPercentage() + ", Average Passing Yards Per Game: " + averagePassingYardsPerGame() + "\n"
				+ "Average Touch Downs Per Game: " + averageTouchdownsPerGame() + ", Player's Rating: " + playerRating();
	}
}
