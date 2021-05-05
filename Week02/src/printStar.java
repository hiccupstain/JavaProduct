import java.util.Scanner;
public class printStar {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int num;
		System.out.print("请输入三角的行数:");
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		for(int i = 1;i <= num;i++) {
			for(int j = 1;j <= num-i;j++) {
				System.out.print(' ');
			}
			for(int k = 1;k <= i;k++) {
				System.out.print("*" + ' ');
			}
			System.out.println();
		}
		
	}

}
