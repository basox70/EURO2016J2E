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
@Table(name="victoryBet")
public class VictoryBet { //extends Bet {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="idVictoryBet")
    private int idScoreBet;

    @Column(name="score")
    private int score;

    @Column(name="points")
    private int points;
    
    @Column(name="date")
    private Date date;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idBettor")
    private Bettor bettor;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idEvent")
    private Event event;

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getIdScoreBet() {
        return idScoreBet;
    }

    public void setIdScoreBet(int idScoreBet) {
        this.idScoreBet = idScoreBet;
    }

    public Bettor getBettor() {
        return bettor;
    }

    public void setBettor(Bettor bettor) {
        this.bettor = bettor;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

}

