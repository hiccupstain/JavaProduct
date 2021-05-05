package studentScore;

public class ScoreList {
	private String subject;
	private String average;
	@Override
	public String toString() {
		String info="";
		info+="课程"+"     "+"平均分"+"\n";
		info+=subject+"     "+average+"\n";
		return info;
	}
	public String getSubjct() {
		return subject;
	}
	public void setSubjct(String subjct) {
		this.subject = subjct;
	}
	public String getAverage() {
		return average;
	}
	public void setAverage(String average) {
		this.average = average;
	}
	public ScoreList() {
		super();
	}
}
