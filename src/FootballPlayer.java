
// Super Class
public abstract class FootballPlayer 
{
	private String playerName;
	private Position position;
	private int numGamesPlayed;
	private String NFL_Team;
	
	//Constructor
	public FootballPlayer()
	{
		this("Bobby Billy-Bob", Position.BENCH, "Washington Gun-Takers", 0);
	}
	
	//Parameterized Constructor
	public FootballPlayer(String name, Position position, String team, int numGames)
	{
		this.playerName = name;
		this.position = position;
		this.NFL_Team = team;
		this.numGamesPlayed = numGames;
	}
	
	// Abstract playerRating method because it can never be instantiated in FootballPlayer but only subclasses.
	public abstract int playerRating();
	
	// Getter method for subclass
	public int getNumGamesPlayed()
	{
		return this.numGamesPlayed;
	}
	
	// Returns a string version of the Position value
	public String getPosition()
	{
		if(this.position == Position.BENCH)
			return "Benched";
		if(this.position == Position.QUARTERBACK)
			return "Quarter Back";
		if(this.position == Position.DEFENSIVEBACK)
			return "Defensive Back";
		if(this.position == Position.RUNNINGBACK)
			return "Running Back";
		else
			return "";
	}
	
	// Compares the rating value for two players
	public int compareTo(int compareRating)
	{
		if(playerRating() == compareRating)
			return 0;
		if(playerRating() > compareRating)
			return 1;
		if(playerRating() < compareRating)
			return -1;
		else									// Throws unresolved compilation problem when this is not present
			return 0; 
	}
	
	public String toString()
	{
		return "Name: " + this.playerName + ", Position: " + this.getPosition() + ", NFL Team: " + this.NFL_Team + "\n";
	}
}
