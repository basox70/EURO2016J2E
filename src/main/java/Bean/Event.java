package Bean;

import java.util.Date;

public class Event {
	private int id, team1Score, team2Score, teamVictory;
	private Date date;
	private String weather, name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTeam1Score() {
		return team1Score;
	}
	public void setTeam1Score(int team1Score) {
		this.team1Score = team1Score;
	}
	public int getTeam2Score() {
		return team2Score;
	}
	public void setTeam2Score(int team2Score) {
		this.team2Score = team2Score;
	}
	public int getTeamVictory() {
		return teamVictory;
	}
	public void setTeamVictory(int teamVictory) {
		this.teamVictory = teamVictory;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getWeather() {
		return weather;
	}
	public void setWeather(String weather) {
		this.weather = weather;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
