package dog;

public class Dog {
	private String name,color;
	private int age;
	public Dog(String name, String color, int age) {
		super();
		this.name = name;
		this.color = color;
		this.age = age;
	}
	
	public void print() {
		System.out.println("����:" + name);
		System.out.println("��ɫ:" + color);
		System.out.println("����:" + age);
	}
}
