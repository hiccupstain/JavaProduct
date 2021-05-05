package nestedExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Driver {
	public static void main(String[] args) {
		String expression = "(\\w{3,8}\\(\\d+\\,\\d+\\))";// ������������ʽ
		String pat = "(\\w{3,8}).(\\d+).(\\d+)";
		String str = "add(5,max(10,sub(5,2)))";
		String sStr=str;

		Pattern p = Pattern.compile(expression);
		Matcher m = p.matcher(str);

		boolean has = m.find();
		if(!has) {
			System.out.println("���벻�Ϸ�");
			return;
		}
		String op = "";
		int num1 = 0;
		int num2 = 0;
		String result = "";
		while (has) {
			Pattern pa = Pattern.compile(pat);
			Matcher ma = pa.matcher(m.group(1));

			// ��ȡ�����������
			if (ma.find()) {
				op = ma.group(1);
				num1 = Integer.valueOf(ma.group(2));
				num2 = Integer.valueOf(ma.group(3));
			}
			// ������
			switch (op) {
			case "sub":
				result = String.valueOf((num1 - num2));
				break;
			case "add":
				result = String.valueOf((num1 + num2));
				break;
			case "max":
				if (num1 > num2) {
					result = String.valueOf(num1);
				} else if (num1 < num2) {
					result = String.valueOf(num2);
				}
				break;
			case "min":
				if (num1 > num2) {
					result = String.valueOf(num2);
				} else if (num1 < num2) {
					result = String.valueOf(num1);
				}
				break;
			case "doubleMe":
				result = String.valueOf(num1 * num1);
				break;
			}
			// �滻�ӱ��ʽ
			str = m.replaceAll(result);
			m = p.matcher(str);
			has=m.find();
		}
		System.out.println(sStr+"="+result);
	}
}