class Team {

	private String teamName;

	public Team() {
		this.teamName = "No Name";
	}

	public Team(String name) {
		this.teamName = name;
	}

	public void setTeamName(String name) {
		this.teamName = name;
	}

	public String getTeamName() {
		return this.teamName;
	}

	@Override
	public String toString() {
		return "Team Name: " + teamName;
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj instanceof Team) {
			Team  t = (Team)obj;
			return this.getTeamName().equals(t.getTeamName());
		}
		return false;
	}
}
