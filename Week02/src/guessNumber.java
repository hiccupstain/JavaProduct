import java.util.Scanner;

public class guessNumber {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		String choice;
		int random,num;
		int times = 1;
		
		Scanner s = new Scanner(System.in);
	
		do {
			random = (int) (Math.random()*1000);
			System.out.println(random);
			System.out.print("������һ����:");
			num = s.nextInt();
			while(num != random) {
				if(num > random) {
					System.out.println("̫���ˣ�����������");
				}else {
					System.out.println("̫С�ˣ�����������");
				}
				num = s.nextInt();
				times++;
			}
			System.out.println("��ϲ��¶��ˣ���һ������" + times + "��");
			System.out.println("�������Ƿ�������һ��:y/n");
			choice = s.next();

		}while(choice.equals("y"));
		System.out.println("��Ϸ������");
	}

}
