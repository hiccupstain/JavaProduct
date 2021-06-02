package student;

public class Student {
	private String name;
	private String phoneNumber;
	private String studentNumber;
	
	public String displayStudent() {
		return "name=" + name + ", phoneNumber=" + phoneNumber + ", studentNumber=" + studentNumber;
	}

	public Student() {
		super();
	}

	public Student(String name, String phoneNumber, String studentNumber) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.studentNumber = studentNumber;
	}
}
