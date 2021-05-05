package employee;

public class test {
	public static void main(String[] args) {
		Employee e = new Employee(001,"tom",2000.0f,1.2f);
		System.out.println(e.growth());
		System.out.println(e.finaSalary());
	}
}
