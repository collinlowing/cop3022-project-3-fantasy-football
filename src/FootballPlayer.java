
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
	
	public int playerRating()
	{
		int rating = 0;
		
		return rating;
	}
	
	public int getNumGamesPlayed()
	{
		return this.numGamesPlayed;
	}
	
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
	
	public int compareTo(int compareRating)
	{
		if(playerRating() == compareRating)
			return 0;
		if(playerRating() > compareRating)
			return 1;
		if(playerRating() < compareRating)
			return -1;
	}
	
	public String toString()
	{
		return "Name: " + this.playerName + ", Position: " + this.getPosition() + ", NFL Team: " + this.NFL_Team + "\n";
	}
}
