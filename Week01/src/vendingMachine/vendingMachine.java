package vendingMachine;

import java.util.Scanner;

public class vendingMachine {
	public static void main(String args[]) {
		//��������
		//��Ԫ����ֵ
		int
		oneDollar = 1,
		twoDollars = 2;
		//Ӳ�ҵ���ֵ
		float 	
		fifty = 0.5f,
		twenty = 0.2f,
		ten = 0.1f,
		five = 0.05f;
		float number;//�����Ǯ
		//�һ��ɸ�����ֵ������
		int twoAmounts,oneAmounts,fiftyAmounts,twentyAmounts,tenAmounts,fiveAmounts;
		
		
		//��������
		Scanner s = new Scanner(System.in);
		System.out.println("��������Ǯ����");
		number = s.nextFloat();
		
		//���ݴ���
		//2��Ԫ
		twoAmounts = (int) (number/twoDollars);
		number -= twoAmounts*twoDollars;
		//1��Ԫ
		oneAmounts = (int) (number/oneDollar);
		number -= oneAmounts*oneDollar;
		//50����
		fiftyAmounts = (int) (number/fifty);
		number -= fiftyAmounts*fifty;
		//20����
		twentyAmounts = (int) (number/twenty);
		number -= twentyAmounts*twenty;
		//10����
		tenAmounts = (int) (number/ten);
		number -= tenAmounts*ten;
		//5����
		fiveAmounts = (int) (number/five);
		
		//�������
		System.out.print(twoAmounts+"��2$");
		System.out.print("+");
		System.out.print(oneAmounts+"��1$");
		System.out.print("+");
		System.out.print(fiftyAmounts+"��50c");
		System.out.print("+");
		System.out.print(twentyAmounts+"��20c");
		System.out.print("+");
		System.out.print(tenAmounts+"��10c");
		System.out.print("+");
		System.out.print(fiveAmounts+"��5c");
	}
}


		

