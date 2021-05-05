package studentScore;

import java.util.ArrayList;
import java.util.Scanner;;
public class Dao {
	public ArrayList<Student> readStudent() {
		ArrayList<Student> list = new ArrayList<Student>();
		System.out.println("请输入学生基本信息:");
		Scanner s = new Scanner(System.in);
		String info = s.nextLine();
		while (!info.equals("end")) {
			Student stu = new Student();
			String[] info1 = info.split(",|，");
			stu.setSno(info1[0]);
			stu.setSname(info1[1]);
			stu.setSex(info1[2]);
			list.add(stu);
			info = s.nextLine();
		}
		return list;
	}
	
	public ArrayList<Score> readScore(){
		ArrayList<Score> listScore = new ArrayList<Score>();
		System.out.println("请输入学生成绩:");
		Scanner s = new Scanner(System.in);
		String info = s.nextLine();
		while (!info.equals("end")) {
			Score sco = new Score();
			String[] info1 = info.split(",|，");
			sco.setSno(info1[0]);
			sco.setSubject(info1[1]);
			sco.setScore(info1[2]);
			listScore.add(sco);
			info = s.nextLine();
		} 
		return listScore;
	}
	
	public void setStuAverage(ArrayList<Score> listScore,ArrayList<Student> list) {
		int total=0;
		double average=0;
		int num=0;
		for (Student student : list) {
			for (Score score : listScore) {
				if(score.getSno().equals(student.getSno())){
					total+=Integer.parseInt(score.getScore());
					num++;
				}
			}
			average = total/num;
			student.setAvScore(String.valueOf(average));
		}
	}
	
	public ArrayList<ScoreList> setSubAverage(ArrayList<Score> listScore) {
		ArrayList<ScoreList> scoreList = new ArrayList<ScoreList>();
		int total=0;
		double average=0;
		int num=0;
		int index=-1;
		for (Score score : listScore) {
			String subject = score.getSubject();
			if(score.getSubject().equals(subject)) {
				total+=Integer.parseInt(score.getScore());
				num++;
			}
			average=total/num;
			
			index = query(scoreList, subject);
			if(index!=-1) {
				scoreList.get(index).setAverage(String.valueOf(average));
			}else {
				ScoreList sl = new ScoreList();
				sl.setSubjct(subject);
				sl.setAverage(String.valueOf(average));
				scoreList.add(sl);
			}
		}
		return scoreList;
	}
	
	public int query(ArrayList<ScoreList> scoreList,String subject) {
		int ret=-1;
		for (int i = 0; i < scoreList.size(); i++) {
			ScoreList s = scoreList.get(i);
			if(s.getSubjct().equals(subject)) {
				ret=i;
				break;
			}
		}
		return ret;
	}
}
