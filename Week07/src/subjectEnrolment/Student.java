package subjectEnrolment;

public class Student {
	private String Id;
	private String name;
	@Override
	public String toString() {
		String info = "";
		info = Id + name;
		return info;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student(String id, String name) {
		super();
		Id = id;
		this.name = name;
	}
}
