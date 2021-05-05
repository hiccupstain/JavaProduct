import java.util.Scanner;

public class ShuiXianHua {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		int weishu,i,amount,midNum = 0;
		
		System.out.print("请输入水仙花数的位数:");
		Scanner s = new Scanner(System.in);
		weishu = s.nextInt();
		
		int begin = (int)Math.pow(10, weishu-1);
		int end = (int)Math.pow(10, weishu) - 1;
		
		for(i = begin;i <= end;i++) {
			midNum = i;
			amount = 0;
			
			while(midNum != 0) {
				
				amount += (int)Math.pow(midNum%10, weishu);
				midNum = midNum/10;
			}
			
			if(amount == i) {
				System.out.println(i);
			}
		}
		
	}
}


