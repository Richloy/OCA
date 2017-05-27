// Assignment 4 - Team & TeamTest.

public class Team {
    private String teamName;
    
    public Team(){
      this("Unknown Name");
    }
    
    public Team(String teamName){
      this.teamName=teamName;
    }

    public void setTeamName(String teamName){
      this.teamName=teamName;
    }
    
    public String getTeamName(){
        return teamName;
    }
    
	@Override
    public String toString(){
      return "TeamName: " + teamName;
    }
   
    @Override
    public boolean equals(Object obj){
      // Are both references pointing at the same object in memory?
      if (this == obj){
        return true;
      }
	   
      // Is the object reference passed to the method of class type, Team?  
      if(obj instanceof Team){
       Team teamPassed =(Team)obj; // perform a cast.
       return this.getTeamName().equals(teamPassed.getTeamName());
      }
        
      return false;
    }
}
