// Assignment 4 - Team & TeamTest.

public class TestTeam {
    
    public static void main(String[] args){
      Team team1 = new Team("FC Utd"); 
	  Team team2 = new Team("Utd FC");
      
	  System.out.println("Is " + team1.getTeamName() + " equal to " + team2.getTeamName() + "?  Answer: " + team1.equals(team2)); // false	
	  	  
	  Team team3 = team1;

      System.out.println("Is " + team1.getTeamName() + " equal to " + team3.getTeamName() + "?  Answer: " + team1.equals(team3)); // true		  
    }
}