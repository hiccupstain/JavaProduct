import java.util.Scanner;

public class picture {
	public static void main(String[] args) {
		
		//变量定义
		//变量定义
		int crownNumber = 0,frameType,crown;
		double length,width,totalCost = 0,totalLength = 0,totalSquare = 0,colourCost = 0,
				frameCost = 0,cardboardCost = 0,glassCost = 0,crownCost = 0;
		String colour;
		//常量定义
		final double colouringCost = 0.1,regularFrame = 0.15,fancyFrame = 0.25,cardboard = 0.02,
				glass = 0.07 ,crownsCost = 0.35;

		
		//数据输入
		System.out.println("请输入照片的长和宽:");
		Scanner s = new Scanner (System.in);
		System.out.print("长:");
		length = s.nextInt();
		System.out.print("宽:");
		width = s.nextInt();
		System.out.print("请选择相框的种类：1:普通版，2:豪华版:");
		frameType = s.nextInt();
		System.out.print("请选择想要的颜色：");
		colour = s.next();
		System.out.print("是否需要订冠：1.是，0.否");
		crown = s.nextInt();
		if (crown == 1) {
			System.out.print("请选择冠的个数:");
			crownNumber = s.nextInt();
		}

		
		//数据处理
		totalLength = (length + width) * 2;//相片的周长
		totalSquare = length * width;//照片的面积
		
		colourCost = totalLength * colouringCost;//涂颜料的花费
		cardboardCost = totalSquare * cardboard;//纸板花费
		glassCost = totalSquare * glass;//玻璃花费
		
		//装框花费
		if(frameType == 1) {
			frameCost = totalLength * regularFrame;
		}
		else {
			frameCost = totalLength * fancyFrame;
		}
		
		//装冠花费
		if (crown == 1) {
			crownCost = crownNumber * crownsCost;
		}
		
		//总合计花费
		totalCost = colourCost + cardboardCost + glassCost + crownCost + frameCost;
		
		//数据输出
		System.out.println("装框该相片需要" + totalCost + "美元");
	}
}
