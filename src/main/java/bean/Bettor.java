package bean;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "bettor")
public class Bettor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idBettor")
    private int idBettor;

    @Column(name = "currentPositionVictory")
    private int currentPositionVictory;

    @Column(name = "currentPositionScore")
    private int currentPositionScore;

    @Column(name = "login")
    private String login;

    //private String nick;
    @Column(name = "password")
    private String password;

    @OneToMany(mappedBy = "bettor", cascade = CascadeType.ALL)
    private Set<VictoryBet> victoryBets = new HashSet<VictoryBet>();
    
    @OneToMany(mappedBy = "bettor", cascade = CascadeType.ALL)
    private Set<ScoreBet> scoreBets = new HashSet<ScoreBet>();

    public int getIdBettor() {
        return idBettor;
    }

    public void setIdBettor(int idBettor) {
        this.idBettor = idBettor;
    }

    public int getCurrentPositionVictory() {
        return currentPositionVictory;
    }

    public void setCurrentPositionVictory(int currentPositionVictory) {
        this.currentPositionVictory = currentPositionVictory;
    }

    public int getCurrentPositionScore() {
        return currentPositionScore;
    }

    public void setCurrentPositionScore(int currentPositionScore) {
        this.currentPositionScore = currentPositionScore;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    /*public String getNick() {
		return nick;
	}
    public void setNick(String nick) {
            this.nick = nick;
    }*/
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<VictoryBet> getVictoryBets() {
        return victoryBets;
    }

    public void setVictoryBets(Set<VictoryBet> victoryBets) {
        this.victoryBets = victoryBets;
    }

    public Set<ScoreBet> getScoreBets() {
        return scoreBets;
    }

    public void setScoreBets(Set<ScoreBet> scoreBets) {
        this.scoreBets = scoreBets;
    }
    
    

}
