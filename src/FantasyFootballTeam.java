
public class FantasyFootballTeam
{
	private String teamName;
	private String teamOwner;
	private FootballPlayer [] playerTeam; // Array of player objects
	private int arraySize; // Total size of the array
	private int filledSize; // How much of the array is filled
	
	// Parameterized constructor
	FantasyFootballTeam(String teamName, String teamOwner, int arraySize)
	{
		this.teamName = teamName;
		this.teamOwner = teamOwner;
		
		this.arraySize = arraySize;
		this.filledSize = 0;
		this.playerTeam = new FootballPlayer[arraySize];
	}
	
	// Adds a player to the list
	public String addPlayer(FootballPlayer player)
	{
		if(filledSize > arraySize - 1)
		{
			return "ERROR: There is no more room on the team.";
		}
		else
		{
			playerTeam[filledSize] = player;
			filledSize++;
			
			return "Player added.";
		}
	}
	
	// Searches for all players in a specific position
	public String findPlayerbyPosition(String position)
	{
		String string = "";
		for(int i = 0; i < this.filledSize; i++)
		{
			if(this.playerTeam[i].getPosition().equalsIgnoreCase(position))
				string += this.playerTeam[i];
		}
		if(string.equals(""))
			return "No player at " + position;
		else
			return string;
	}
	
	public String toString()
	{
		String string = "";
		string = "Team Name: " + this.teamName + " Owner: " + this.teamOwner + "\n\n";
		
		for(int i = 0; i < filledSize; i++)
		{
			string += this.playerTeam[i] + "\n\n";
		}
		
		return string;
	}
}
