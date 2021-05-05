package subjectEnrolment;

import java.util.Scanner;

public class Driver {
	static SubjectEnrolment subject;
	
	public static void main(String[] args) {
		int choice = menu();
		while (choice != 5) {
			switch (choice) {
			case 1:
				createSubject();
				break;
			case 2:
				addStudent();
				break;
			case 3:
				deleteStudent();
				break;
			case 4:
				printSubject();
				break;
			default:
				break;
			}
			choice = menu();
		}
	}

	public static int menu() {
		int choice;
		Scanner s = new Scanner(System.in);
		System.out.println("====选课系统====");
		System.out.println("1.创建课程");
		System.out.println("2.选课");
		System.out.println("3.退选");
		System.out.println("4.打印名单");
		System.out.println("5.退出");
		System.out.print("请选择(1-5):");
		choice = s.nextInt();
		if(choice>5 || choice<1) {
			System.out.println("无效选择,请重新输入");
		}
		return choice;
	}

	public static void createSubject() {
		Scanner sca = new Scanner(System.in);
		System.out.print("请输入课程号:");
		String subjectID = sca.next();
		System.out.print("请输入课程名:");
		String subjectName = sca.next();
		System.out.print("请输入课程学期:");
		String subjectSemester = sca.next();
		System.out.print("请输入课程学年:");
		String subjectYear = sca.next();
		System.out.print("请输入课程容纳的最大人数:");
		int maxsize = sca.nextInt();

		Subject suj = new Subject(subjectID, subjectName, subjectSemester, subjectYear);
		subject = new SubjectEnrolment(suj, maxsize);
		System.out.println("创建成功,信息如下:");
		System.out.println(subject.getSubject().toString()+"，最大人数:"+subject.maxSize());
	}

	public static void addStudent() {
		if(subject == null) {
			System.out.println("请先创建课程");
			return;
		}
		if (subject.isFull()) {
			System.out.println("课程人数已满");
			return;
		}
		Scanner s = new Scanner(System.in);
		System.out.print("请输入学生Id:");
		String studentId = s.next();
		for(int i=0;i<subject.size();i++){
			if(studentId.equals(subject.get(i).getId())){
				System.out.println("Id重复");
				return;
			}
		}
		System.out.print("请输入学生姓名:");
		String studentName = s.next();
		Student stu = new Student(studentId, studentName);
		
		if (subject.add(stu)) {
			System.out.println("选课成功");
			System.out.println("当前信息如下:");
			System.out.println(subject.getSubject().toString()+"，最大人数:"+subject.maxSize());
			System.out.println("选课人数:"+subject.size());
			System.out.println("学号 姓名");
			System.out.println(subject.toString());
			return;
		}
	}
	
	public static void deleteStudent(){
		if(subject == null) {
			System.out.println("请先创建课程");
			return;
		}
		Scanner s = new Scanner(System.in);
		System.out.println("请输入学生Id:");
		String id = s.next();
		if(subject.indexOf(id)<0){
			System.out.println("该学生没有选该课或Id不存在");
			return;
		}
		if(subject.remove(subject.indexOf(id))){
			System.out.println("退选成功");
			System.out.println("当前信息如下:");
			System.out.println(subject.getSubject().toString()+"，最大人数:"+subject.maxSize());
			System.out.println("选课人数:"+subject.size());
			System.out.println("学号 姓名");
			System.out.println(subject.toString());
		}
	}

	public static void printSubject() {
		System.out.println(subject.getSubject().toString()+"，最大人数:"+subject.maxSize());
		System.out.println("选课人数:"+subject.size());
		System.out.println("学号 姓名");
		System.out.println(subject.toString());
	}
}
