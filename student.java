import java.util.Scanner;
public class student {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
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
					System.out.println("��������ɼ�");
					break;
				}
				System.out.println("ƽ����:"+ average(score));
				break;
			case 3:
				if(flag == 0) {
					System.out.println("��������ɼ�");
					break;
				}
				System.out.println("��߷�:"+ maxNum(score));
				break;
			case 4:
				if(flag == 0) {
					System.out.println("��������ɼ�");
					break;
				}
				System.out.println("ƽ����:"+ minNum(score));
				break;
			case 5:
				if(flag == 0) {
					System.out.println("��������ɼ�");
					break;
				}
				paixu(score);
				break;
			default:
				System.out.println("������Ч������������");
			}
			choice = menu();
			
		}
		System.out.println("�����������лʹ�ã�");
	}
	
	public static int menu() {
		Scanner s = new Scanner(System.in);
		System.out.println("1.¼��ѧ���ɼ�");
		System.out.println("2.����ƽ����");
		System.out.println("3.�����߷�");
		System.out.println("4.�����ͷ�");
		System.out.println("5.���ɼ�����");
		System.out.println("6.�˳�");
		System.out.print("������ѡ��:");
		int choose = s.nextInt();
		return choose;
	}
	
	public static int input(int score[],int flag) {
		int num = 0;
		Scanner scan = new Scanner(System.in);
		for (int j = 0; j < score.length; j++) {
			System.out.print("�������"+(j+1)+"��ѧ���ĳɼ�:");
			num = scan.nextInt();
			while(num<=0 || num>=100) {
				System.out.print("����������:");
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
