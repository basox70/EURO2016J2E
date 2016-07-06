/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import bean.Event;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Alexy Duquesnoy
 */
public class EventDTO implements Serializable {

    private int idEvent;
    private int team1Score;
    private int team2Score;
    private int realVictory;
    private Date eventDate;
    private String weather;
    private String name;
    private TeamDTO team1;
    private TeamDTO team2;

    public EventDTO(Event event) {
        this.idEvent = event.getIdEvent();
        this.team1Score = event.getTeam1Score();
        this.team2Score = event.getTeam2Score();
        this.realVictory = event.getRealVictory();
        this.eventDate = event.getEventDate();
        this.weather = event.getWeather();
        this.name = event.getName();
        this.team1 = new TeamDTO(event.getTeam1());
        this.team2 = new TeamDTO(event.getTeam2());
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

    public int getRealVictory() {
        return realVictory;
    }

    public void setRealVictory(int realVictory) {
        this.realVictory = realVictory;
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

    public TeamDTO getTeam1() {
        return team1;
    }

    public void setTeam1(TeamDTO team1) {
        this.team1 = team1;
    }

    public TeamDTO getTeam2() {
        return team2;
    }

    public void setTeam2(TeamDTO team2) {
        this.team2 = team2;
    }

}
