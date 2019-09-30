# Project 3 - Fantasy Football

## Project Outcomes:
Use Java to:
1. Implement an abstract class in Java to produce reusable classes.
1. Develop a program with several classes.
1. Develop a program using an Array of object references.
1. Use method calls to perform logic steps involved in calculations and comparison.
1. Implement a solution involving Inheritance and polymorphism.

## Prep Readings:
ZyBooks 1 - 8.

## Background Information:
![Fantasy football Dungeons and Dragons meme](http://i.imgur.com/WlbqUaa.jpg)
1. Fantasy football is played by millions of people, mainly online.
This project will simulate a simple Fantasy Football team, that includes players and the team.
1. This project will store player information including some statistics that can be used in the game.
1. The statistics will be based on the current season.
1. Remember part of being a strong programmer is being flexible enough to learn about new domains, you don't have to play fantasy football or even understand football to write application in this domain.
However, if you like to get a little better understanding of it you can go to https://en.wikipedia.org/wiki/Fantasy_football\_(American).

## Project Requirements:
1. The project will consist of 6 classes as follows:
	1. Abstract FootballPlayer - hold information related to all players
	1. Specific Players classes designation by position.
		1. Subclass of FootballPlayer
		1. Named based on the player's position such as QuarterBack, RunningBack and DefensiveBack.
		1. Number of games played this season - used to generate statistics.
	1. A FantasyFootball team class that contains a collection of FootballPlayers.
	1. A FantasyFootballTester class that will create the objects and test all the classes methods.

### FootballPlayer Class - Abstract Class
1. Instance variables include:
	1. Player's name.
	1. Position - in this project it's either quarterback, runningback or defensiveback.
	1. NFL Team
	1. Number of Games played this season.
1. Constructors
	1. Default constructor, sets all instance fields to a default value.
	1. Parameterized constructor - sets all instance variables to the parameterized value (hint use mutator methods for data integrity and ease of testing).
	1. Methods
		1. Abstract playersRating method that returns an integer that is calculated based on their statistics (specific formula is outlined in the subclasses below).
		1. compareTo method
			1. Similar to the compareTo method prevalent in the [API](https://docs.oracle.com/javase/8/docs/api/java/lang/Comparable.html#compareTo-T-).
			1. Returns a positive int if the calling player's rating is higher than the parameter's player's rating
			1. Returns a negative int if the calling player's rating is lower than the parameter's player's rating
			1. Return zero if their ratings are equal.
	1. toString method
		1. returns a String representation of the object, in the format:
		```
		Name: Phil Sims, Position: Quarter Back, NFL Team: Giants
		```

### QuarterBack Class - subclass of FootballPlayer
1. Stores statistics specific to QuarterBacks
1. Instance variables (all ints)
	1. Pass Attempts
	1. Pass Completed
	1. Touchdowns Passing
	1. Total Yards Passing
1. Constructors
	1. Default constructor, sets all instance field to a default value. Remember to pass appropriate values to super class.
	1. Parameterized constructor - sets all instance variables to the parameterized value (hint use mutator methods for data integrity and ease of testing)
1. Methods
	1. double completionPercentage()
	Formula: passes completed / pass Attempts
	1. double averagePassingYardsPerGame()
	Formula: total yards passing/games Played
	1. double averageTouchDownsPerGame()
	Formula: touch Downs Passing/games Played
	1. playerRating
		1. overwrite of abstract method
		1. Calculation is the sum of:
		```
		Average Touch Downs Per Game + (Completion Percentage * 100) + (Average Passing Yards Per Game / 5);
		```
	1. toString (hint use the super classes toString)
		1. returns a String representation of the object
		1. In the format:
		```
		Name: Phil Sims, Position: Quarter Back, NFL Team: Giants
		Completion Percentage: 0.25, Average Passing Yards Per Game: 500.00
		Average Touch Downs Per Game: 1.50, Player's Rating: 127
		```

_RunningBack and DefensiveBack are similar to the QB but have slightly different instance variables and statistical methods._

### RunningBack Class
1. Similar to the QuarterBack class except for slightly different instance variables and statistical methods.
1. Instance Variables (all ints)
	1. Running Attempts
	1. Total running yards
	1. Touchdowns
1. Constructors
	1. Default constructor, sets all instance field to a default value. Remember to pass appropriate values to super class.
	1. Parameterized constructor - sets all instance variables to the parameterized value (hint use mutator methods for data integrity and ease of testing)
1. Methods
	1. Statistical methods all return a double
		1. averageYardsPerGame
		1. averageYardsPerAttempt
		1. averageTouchDownsPerGame
	1. playerRating is sum of
	```
	averageTouchDownsPerGame() + averageYardsPerAttempt()+ (averageYardsPerGame()/5);
	```
	1. toString similar to QuarterBack but with RunningBack info.

### DefensiveBack Class
1. Similar to the QuarterBack class except for slightly different instance variables and statistical methods.
1. Instance Variables (all ints)
	1. Tackles
	1. Interceptions
	1. Forced Fumbles
1. Constructors
	1. Default constructor, sets all instance field to a default value. Remember to pass appropriate values to super class.
	1. Parameterized constructor - sets all instance variables to the parameterized value (hint use mutator methods for data integrity and ease of testing)
1. Methods
	1. Statistical method all return a double
		1. averageTacklesPerGame
		1. averageInterceptionsPerGame
		1. averageForcedFumblesPerGame()
	1. playerRating is sum of
	```
	(averageTacklesPerGame() + averageInterceptionsPerGame() + (averageForcedFumblesPerGame()/5)) * 10;
	```
1. toString similar to QuarterBack but with DefensiveBack info

### FantasyFootballTeam Class
1. Stores a collection (Array) of FootballPlayer objects and performs basic search and toString operations.
1. Instance variables
	1. Team Name
	1. Team Owner
	1. Array of FootballPlayer objects
	1. Variable to handle a partially filled array.
1. Parameterized constructor
	1. takes in a team name, owner and size of the array
	1. creates the array.
	1. sets the partially filled array value as appropriate
1. Methods
	1. addPlayer
		1. Takes in a FootballPlayer object and add it to the Array.
		1. Ensures the parameter is not null and the array is not full.
		If it is already full, an error message should be displayed indicating that there is no room on the team.
	1. findPlayerbyPosition
		1. search the array for all players at a particular position (ignore case).
		1. returns a string of all the players at that position or a string stating no players at that position.
		Such as
		```
		No player at QuarterBack found.
		```
	1. toString - a String representation of the object such as
	```
	Team Name: UWF Argos Owner: The Great State of Florida

	Name: Phil Sims, Position: Quarter Back, NFL Team: Giants
	Completion Percentage: 0.25, Average Passing Yards Per Game: 500.00
	Average Touch Downs Per Game: 1.50, Player's Rating: 127

	Name: Jim Brown, Position: Running Back, NFL Team: Browns
	Running Yards Per Game: 104.17, Running Yards Per Attempt: 9.77
	Average Touch Downs Per Game: 0.67, Player's Rating: 31

	Name: Spider Lockart, Position: Defensive Back, NFL Team: Giants
	Tackles Per Game: 1.43, Interceptions Per per Game: 0.36
	Forced Fumbles Per Game: 0.21, Player's Rating 18
	```

### FantasyFootballTester class
1. Create at least two instances of each player type.
	1. Two QuarterBack, RunningBack and DefensiveBack objects.
	1. Hard code these object, No user or file input is required or desired.
1. Create at least two FantasyFootballTeam objects.
1. Add at least one player per position to each team.
1. Compares players to completely test the compareTo method.
1. Test all methods in all the class directly or indirectly.
1. Indirect testing
	1. Calls a method that calls others methods.
	1. Example the playerRating method would call all the statistical methods or the toString would call all the accessor method.

### Sample run
**Example run only, use as a guide not a solution.**
```
Team Name: UWF Argos Owner: The Great State of Florida

Name: Phil Sims, Position: Quarter Back, NFL Team: Giants
Completion Percentage: 0.25, Average Passing Yards Per Game: 500.00
Average Touch Downs Per Game: 1.50, Player's Rating: 127

Name: Jim Brown, Position: Running Back, NFL Team: Browns
Running Yards Per Game: 104.17, Running Yards Per Attempt: 9.77
Average Touch Downs Per Game: 0.67, Player's Rating: 31

Name: Spider Lockart, Position: Defensive Back, NFL Team: Giants
Tackles Per Game: 1.43, Interceptions Per per Game: 0.36
Forced Fumbles Per Game: 0.21, Player's Rating 18


Team Name: Beach Bums Owner: The Dude

Name: Steve Young, Position: Quarter Back, NFL Team: 49ers
Completion Percentage: 0.25, Average Passing Yards Per Game: 375.00
Average Touch Downs Per Game: 1.50, Player's Rating: 102

Name: Saquon Barkley, Position: Running Back, NFL Team: Giants
Running Yards Per Game: 104.50, Running Yards Per Attempt: 11.40
Average Touch Downs Per Game: 0.67, Player's Rating: 33

Name: Aqib Talib, Position: Defensive Back, NFL Team: Rams
Tackles Per Game: 2.14, Interceptions Per per Game: 0.50
Forced Fumbles Per Game: 0.43, Player's Rating 27


Testing Finding player by position "Quarter Back" on team "UWF Argos"
Phil Sims

Testing comparing two players rating
Comparing Phil Sims with Steve Young
Phil Sims has a higher rating;
```

### UML
Create UML Class Diagram for the final version of your project.
The diagram should include:
1. All instance variables, including type and access specifier (+, -).
1. All methods, including parameter list, return type and access specifier (+, -).
1. The FootballPlayerTester does not need to be included.

This UML can be hand-drawn, or made using computer tools as you see fit.

## Submission Requirements:
Your project must be submitted using the instructions below. Any submissions that do not follow the stated requirements will not be graded.
1. You should have 7 files for this assignment:
	1. FootballPlayer.java
	1. QuarterBack.java
	1. RunningBack.java
	1. DefensiveBack.java
	1. FantasyFootballTeam.java
	1. FantasyFootballTester.java
	1. Simply UML Class diagram of your 5 classes, do not include the FantasyFootballTester (jpg, gif, pdf, or png).
1. Remember to compile and run your program one last time before you submit it. If your program will not compile, the graders will not be responsible for trying to test it.

## Important Notes:
1. Projects will be graded on whether they correctly solve the problem, and whether they adhere to good programming practices.
1. Projects must be submitted by the time specified on the due date. Projects submitted after that time will get a grade of zero.
1. Please review UWFs academic conduct policy. Note that viewing another student's solution, whether in whole or in part, is considered academic dishonesty. Also note that submitting code obtained through the Internet or other sources, whether in whole or in part, is considered academic dishonesty. All programs submitted will be reviewed for evidence of academic dishonesty, and all violations will be handled accordingly.
