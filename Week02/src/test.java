import java.util.Scanner;
public class test {

	public static void main(String[] args) {
		int a[] = {1,4,5,45,67};
		System.out.println("«Î ‰»Î:");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		for (int i = 0; i < 5; i++) {
			if (num <= a[i]) {
				for(int j = i;j <= 5;j++) {
					a[j+1] = a[j];
				}
				a[i] = num;
				
			}
		}
		for(int k = 0;k <= 4;k++) {
			System.out.println(a[k]);
		}
	}

}
