import java.util.Scanner;

public class guessNumber {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String choice;
		int random,num;
		int times = 1;
		
		Scanner s = new Scanner(System.in);
	
		do {
			random = (int) (Math.random()*1000);
			System.out.println(random);
			System.out.print("请输入一个数:");
			num = s.nextInt();
			while(num != random) {
				if(num > random) {
					System.out.println("太大了！请重新输入");
				}else {
					System.out.println("太小了！请重新输入");
				}
				num = s.nextInt();
				times++;
			}
			System.out.println("恭喜你猜对了，你一共猜了" + times + "次");
			System.out.println("请问你是否还想在玩一次:y/n");
			choice = s.next();

		}while(choice.equals("y"));
		System.out.println("游戏结束！");
	}

}
