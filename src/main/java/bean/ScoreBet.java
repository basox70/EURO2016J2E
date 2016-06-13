package bean;

import java.util.Date;

public class ScoreBet extends Bet {
	private int scoreTeam1, scoreTeam2, points;
	private Date betDate;

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public Date getBetDate() {
		return betDate;
	}

	public void setBetDate(Date betDate) {
		this.betDate = betDate;
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
}
