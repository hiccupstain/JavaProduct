package vendingMachine;

import java.util.Scanner;

public class vendingMachine {
	public static void main(String args[]) {
		//变量定义
		//美元的面值
		int
		oneDollar = 1,
		twoDollars = 2;
		//硬币的面值
		float 	
		fifty = 0.5f,
		twenty = 0.2f,
		ten = 0.1f,
		five = 0.05f;
		float number;//输入的钱
		//兑换成各个面值的数量
		int twoAmounts,oneAmounts,fiftyAmounts,twentyAmounts,tenAmounts,fiveAmounts;
		
		
		//数据输入
		Scanner s = new Scanner(System.in);
		System.out.println("请输入总钱数：");
		number = s.nextFloat();
		
		//数据处理
		//2美元
		twoAmounts = (int) (number/twoDollars);
		number -= twoAmounts*twoDollars;
		//1美元
		oneAmounts = (int) (number/oneDollar);
		number -= oneAmounts*oneDollar;
		//50美分
		fiftyAmounts = (int) (number/fifty);
		number -= fiftyAmounts*fifty;
		//20美分
		twentyAmounts = (int) (number/twenty);
		number -= twentyAmounts*twenty;
		//10美分
		tenAmounts = (int) (number/ten);
		number -= tenAmounts*ten;
		//5美分
		fiveAmounts = (int) (number/five);
		
		//数据输出
		System.out.print(twoAmounts+"个2$");
		System.out.print("+");
		System.out.print(oneAmounts+"个1$");
		System.out.print("+");
		System.out.print(fiftyAmounts+"个50c");
		System.out.print("+");
		System.out.print(twentyAmounts+"个20c");
		System.out.print("+");
		System.out.print(tenAmounts+"个10c");
		System.out.print("+");
		System.out.print(fiveAmounts+"个5c");
	}
}


		

