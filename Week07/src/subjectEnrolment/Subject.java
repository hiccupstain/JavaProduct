package subjectEnrolment;

public class Subject {
	private String ID;
	private String name;
	private String semester;
	private String year;

	@Override
	public String toString() {
		String info="";
		info +="课程id:"+ ID +",";
		info +="课程名称:"+name+",";
		info +="课程学期:"+semester+",";
		info +="课程学年:"+year;
		return info;
}

	public String getID() {
		return ID;
	}

	public void setID(String ID) {
		this.ID = ID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public Subject(String ID, String name, String semester, String year) {
		super();
		this.ID = ID;
		this.name = name;
		this.semester = semester;
		this.year = year;
	}
}
