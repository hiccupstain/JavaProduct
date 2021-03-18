import java.util.Scanner;
public class student {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int choice = menu();
		int score[] = null;
		score = new int[5];
		int flag = 0;
		
		while(choice != 6) {
			switch(choice) {
			case 1:
				flag = input(score,flag);
				break;
			case 2:
				if(flag == 0) {
					System.out.println("请先输入成绩");
					break;
				}
				System.out.println("平均分:"+ average(score));
				break;
			case 3:
				if(flag == 0) {
					System.out.println("请先输入成绩");
					break;
				}
				System.out.println("最高分:"+ maxNum(score));
				break;
			case 4:
				if(flag == 0) {
					System.out.println("请先输入成绩");
					break;
				}
				System.out.println("平均分:"+ minNum(score));
				break;
			case 5:
				if(flag == 0) {
					System.out.println("请先输入成绩");
					break;
				}
				paixu(score);
				break;
			default:
				System.out.println("输入无效，请重新输入");
			}
			choice = menu();
			
		}
		System.out.println("程序结束，感谢使用！");
	}
	
	public static int menu() {
		Scanner s = new Scanner(System.in);
		System.out.println("1.录入学生成绩");
		System.out.println("2.计算平均分");
		System.out.println("3.输出最高分");
		System.out.println("4.输出最低分");
		System.out.println("5.给成绩排序");
		System.out.println("6.退出");
		System.out.print("请输入选项:");
		int choose = s.nextInt();
		return choose;
	}
	
	public static int input(int score[],int flag) {
		int num = 0;
		Scanner scan = new Scanner(System.in);
		for (int j = 0; j < score.length; j++) {
			System.out.print("请输入第"+(j+1)+"个学生的成绩:");
			num = scan.nextInt();
			while(num<=0 || num>=100) {
				System.out.print("请重新输入:");
				num = scan.nextInt();
			}
			score[j] = num;
		}
		return flag = 1;
	}
	
	public static int average(int score[]) {
		int avg = 0;
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum = sum + score[i];
		}
		avg = sum / score.length;
		return avg;
	}
	
	public static int maxNum(int score[]) {
		int max = 0;
		for (int i = 0; i < score.length; i++) {
			if(score[i] > max) {
				max = score[i];
			}
		}
		return max;
	}
	
	public static int minNum(int score[]) {
		int min = 0;
		for (int i = 0; i < score.length; i++) {
			if(score[i] > min) {
				min = score[i];
			}
		}
		return min;
	}
	
	public static void paixu(int score[]) {
		java.util.Arrays.sort(score);
		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i] + "\t");
		}
		System.err.println();
	}
}
