package bean;

import java.util.Date;

public class Event {
	private int idEvent, team1Score, team2Score, teamVictory;
	private Date eventDate;
	private String weather, name, city;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getIdEvent() {
		return idEvent;
	}
	public void setIdEvent(int idEvent) {
		this.idEvent = idEvent;
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
	public Date getEventDate() {
		return eventDate;
	}
	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
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
