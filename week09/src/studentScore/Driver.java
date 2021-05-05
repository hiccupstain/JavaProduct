package studentScore;

import java.util.ArrayList;

public class Driver {
	public static void main(String[] args) {
		Dao dao = new Dao();
		ArrayList<Student> list =dao.readStudent();
		ArrayList<Score> listScore = dao.readScore();
		
		ArrayList<ScoreList> scoreList = dao.setSubAverage(listScore);		
		dao.setStuAverage(listScore, list);
		
		System.out.println("按学生统计:");
		for (Student student : list) {
			System.out.println(student.toString());
		}
		System.out.println("按课程统计:");
		for (ScoreList sl : scoreList) {
			System.out.println(sl.toString());
		}
	}
}
