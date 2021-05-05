package studentScore;

public class Score {
	private String sno;
	private String subject;
	private String score;
	private String avScore;
	@Override
	public String toString() {
		return "Score [sno=" + sno + ", subject=" + subject + ", score=" + score + ", avScore=" + avScore + "]";
	}
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	public String getAvScore() {
		return avScore;
	}
	public void setAvScore(String avScore) {
		this.avScore = avScore;
	}
	public Score() {
		super();
	}
	public Score(String sno, String subject, String score, String avScore) {
		super();
		this.sno = sno;
		this.subject = subject;
		this.score = score;
		this.avScore = avScore;
	}
}
