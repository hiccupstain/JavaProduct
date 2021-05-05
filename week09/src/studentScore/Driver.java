package studentScore;

import java.util.ArrayList;

public class Driver {
	public static void main(String[] args) {
		Dao dao = new Dao();
		ArrayList<Student> list =dao.readStudent();
		ArrayList<Score> listScore = dao.readScore();
		
		ArrayList<ScoreList> scoreList = dao.setSubAverage(listScore);		
		dao.setStuAverage(listScore, list);
		
		System.out.println("��ѧ��ͳ��:");
		for (Student student : list) {
			System.out.println(student.toString());
		}
		System.out.println("���γ�ͳ��:");
		for (ScoreList sl : scoreList) {
			System.out.println(sl.toString());
		}
	}
}
