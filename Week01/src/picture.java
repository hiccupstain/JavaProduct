import java.util.Scanner;

public class picture {
	public static void main(String[] args) {
		
		//��������
		//��������
		int crownNumber = 0,frameType,crown;
		double length,width,totalCost = 0,totalLength = 0,totalSquare = 0,colourCost = 0,
				frameCost = 0,cardboardCost = 0,glassCost = 0,crownCost = 0;
		String colour;
		//��������
		final double colouringCost = 0.1,regularFrame = 0.15,fancyFrame = 0.25,cardboard = 0.02,
				glass = 0.07 ,crownsCost = 0.35;

		
		//��������
		System.out.println("��������Ƭ�ĳ��Ϳ�:");
		Scanner s = new Scanner (System.in);
		System.out.print("��:");
		length = s.nextInt();
		System.out.print("��:");
		width = s.nextInt();
		System.out.print("��ѡ���������ࣺ1:��ͨ�棬2:������:");
		frameType = s.nextInt();
		System.out.print("��ѡ����Ҫ����ɫ��");
		colour = s.next();
		System.out.print("�Ƿ���Ҫ���ڣ�1.�ǣ�0.��");
		crown = s.nextInt();
		if (crown == 1) {
			System.out.print("��ѡ��ڵĸ���:");
			crownNumber = s.nextInt();
		}

		
		//���ݴ���
		totalLength = (length + width) * 2;//��Ƭ���ܳ�
		totalSquare = length * width;//��Ƭ�����
		
		colourCost = totalLength * colouringCost;//Ϳ���ϵĻ���
		cardboardCost = totalSquare * cardboard;//ֽ�廨��
		glassCost = totalSquare * glass;//��������
		
		//װ�򻨷�
		if(frameType == 1) {
			frameCost = totalLength * regularFrame;
		}
		else {
			frameCost = totalLength * fancyFrame;
		}
		
		//װ�ڻ���
		if (crown == 1) {
			crownCost = crownNumber * crownsCost;
		}
		
		//�ܺϼƻ���
		totalCost = colourCost + cardboardCost + glassCost + crownCost + frameCost;
		
		//�������
		System.out.println("װ�����Ƭ��Ҫ" + totalCost + "��Ԫ");
	}
}
