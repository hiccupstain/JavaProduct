import java.util.Scanner;

public class fsNumber {
	public static void main (String[] args) {
		int arr[];
		arr = new int [2];
		int  firstNum=0,secondNum = 0;
		
		menu(arr);
		firstNum = arr[0];
		secondNum = arr[1];
		while (firstNum > secondNum) {
			System.out.print("输入的数字不合法，请重新输入:");
		menu(arr);
		firstNum = arr[0];
		secondNum = arr[1];
		}
		
		oddMumber(firstNum,secondNum);
		evenSum(firstNum,secondNum);
		oddSquareSum(firstNum,secondNum);
	}

	public static void menu (int arr[]) {
		Scanner s = new Scanner (System.in);
		System.out.print("请输入第一个数:");
		arr[0] = s.nextInt();
		System.out.print("请输入第二个数:");
		arr[1] = s.nextInt();
	}

	public static void oddMumber(int firstNum,int secondNum) {
		System.out.print("a.其中的奇数分别有:");
		for (int i = firstNum;i <= secondNum;i++) {
			if(i%2 == 1) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

	public static void evenSum(int firstNum,int secondNum) {
		int n = 0;
		for (int i = firstNum;i <= secondNum;i++) {
			if(i%2 == 0) {
				n++;
			}
		}
		System.out.println("b.偶数的个数是" + n);
	}


	public static void oddSquareSum(int firstNum,int secondNum) {
		int sum = 0;
		for (int i = firstNum;i <= secondNum;i++) {
			if(i%2 == 1) {
				sum = sum +(int) Math.pow(i,2);
			}
		}
		System.out.println("c.奇数的平方和为" + sum);
	}

}
