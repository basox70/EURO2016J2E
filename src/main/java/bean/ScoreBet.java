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
@Table(name="scoreBet")
public class ScoreBet { //extends Bet {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="idScoreBet")
    private int idScoreBet;

    @Column(name="scoreTeam1")
    private int scoreTeam1;
    
    @Column(name="scoreTeam2")
    private int scoreTeam2;

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

    public int getScoreTeam1() {
        return scoreTeam1;
    }

    public void setScoreTeam1(int scoreTeam1) {
        this.scoreTeam1 = scoreTeam1;
    }

    public int getScoreTeam2() {
        return scoreTeam2;
    }

    public void setScoreTeam2(int scoreTeam2) {
        this.scoreTeam2 = scoreTeam2;
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
