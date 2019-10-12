
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
		if(position == Position.BENCH)
			return "Name: " + this.playerName + ", Position: Benched, NFL Team: " + this.NFL_Team + "\n";
		if(position == Position.QUARTERBACK)
			return "Name: " + this.playerName + ", Position: Quarter Back, NFL Team: " + this.NFL_Team + "\n";
		if(position == Position.DEFENSIVEBACK)
			return "Name: " + this.playerName + ", Position: Defensive Back, NFL Team: " + this.NFL_Team + "\n";
		if(position == Position.RUNNINGBACK)
			return "Name: " + this.playerName + ", Position: Running Back, NFL Team: " + this.NFL_Team + "\n";
		else
			return "";
	}
}
