package employee;

public class Employee {
	private int num;
	private String name;
	private float salary,increasing;
	
	public Employee(int num, String name, float salary, float increasing) {
		super();
		this.num = num;
		this.name = name;
		this.salary = salary;
		this.increasing = increasing;
	}
	public float growth() {
		float salary2 = finaSalary();
		return salary2 - salary;
	}
	public float finaSalary() {
		return salary * increasing;
	}
}
