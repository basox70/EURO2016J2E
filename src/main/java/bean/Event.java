package bean;

import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="event")
public class Event {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="idEvent")
    private int idEvent;
    
    @Column(name="team1Score")
    private int team1Score;
    
    @Column(name="team2Score")
    private int team2Score;
    
    @Column(name="realVictory")
    private int realVictory;
    
    @Column(name="eventDate")
    private Date eventDate;
    
    @Column(name="weather")
    private String weather;
    
    @Column(name="name")
    private String name;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idStadium")
    private Stadium stadium;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idTeam1")
    private Team team1;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idTeam2")
    private Team team2;
    
    
//    
//    @Column(name="name")
//    private String city;
//
//    public String getCity() {
//        return city;
//    }
//
//    public void setCity(String city) {
//        this.city = city;
//    }

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

    public Stadium getStadium() {
        return stadium;
    }

    public void setStadium(Stadium stadium) {
        this.stadium = stadium;
    }

    public Team getTeam1() {
        return team1;
    }

    public void setTeam1(Team team) {
        this.team1 = team;
    }

    public Team getTeam2() {
        return team2;
    }

    public void setTeam2(Team team2) {
        this.team2 = team2;
    }
    
}
