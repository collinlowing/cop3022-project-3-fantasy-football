
public class FantasyFootballTeam
{
	private String teamName;
	private String teamOwner;
	private FootballPlayer [] playerTeam;
	private int arraySize = 0;
	private int filledSize = 0;
	
	FantasyFootballTeam(String teamName, String teamOwner, int arraySize)
	{
		this.teamName = teamName;
		this.teamOwner = teamOwner;
		
		this.arraySize = arraySize;
		this.playerTeam = new FootballPlayer[arraySize];
	}
	
	public void addPlayer(FootballPlayer player)
	{
		if(filledSize > arraySize)
		{
			System.err.print("ERROR: There is no more room on the team.");
		}
		else
		{
			playerTeam[filledSize + 1] = player;
			filledSize++;
		}
	}
	
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
		string = "Team Name: " + this.teamName + "Owner: " + this.teamOwner + "\n\n";
		
		for(int i = 0; i < filledSize; i++)
		{
			string += this.playerTeam[i] + "\n\n";
		}
		
		return string;
	}
}
