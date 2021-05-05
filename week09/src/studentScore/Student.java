package studentScore;

public class Student {
	private String sno;
	private String sname;
	private String sex;
	private String avScore;
	@Override
	public String toString() {
		String info="";
		info+="学号"+"     "+"姓名"+"     "+"性别"+"     "+"平均分"+"\n";
		info+=sno+"     "+sname+"     "+sex+"       "+avScore+"\n";
		return info;
	}
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAvScore() {
		return avScore;
	}
	public void setAvScore(String avScore) {
		this.avScore = avScore;
	}
	public Student() {
		super();
	}
	public Student(String sno, String sname, String sex, String avScore) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.sex = sex;
		this.avScore = avScore;
	}
}
