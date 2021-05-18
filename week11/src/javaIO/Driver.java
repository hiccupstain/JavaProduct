package javaIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Driver {
	public static void main(String[] args) {
		try {

			File aFile = new File("e:/javaTest/question.txt");
			FileReader fr = new FileReader(aFile);
			BufferedReader br = new BufferedReader(fr);
			
			File bFile = new File("e:/javaTest/answer.txt");
			FileWriter fw = new FileWriter(bFile);
			PrintWriter pw = new PrintWriter(fw);

			String info = "";
			String pat = "(\\w{3,8}).(\\d+).((\\d+))?";
			String op = "";
			int num1 = 0;
			int num2 = 0;
			String result = "";
			Pattern p = Pattern.compile(pat);
			String str="";
			
			while ((info = br.readLine()) != null) {
				str = info;
				Matcher m = p.matcher(info);
				System.out.println(m.groupCount());
				if (m.find()) {
					op = m.group(1);
					num1=Integer.valueOf(m.group(2));
					if(!op.equals("doubleMe")) {
						num2=Integer.valueOf(m.group(3));
					}
				}
				
				result = cal(op,num1,num2);
				pw.println(info+"="+result);
			}
			
			fr.close();
			br.close();
			pw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public static String cal(String op,int num1,int num2) {
		String result="";
		switch(op) {
		case "add":
			result =  String.valueOf(num1+num2);
			break;
		case "sub":
			result =  String.valueOf(num1-num2);
			break;
		case "muti":
			result =  String.valueOf(num1*num2);
			break;
		case "div":
			result =  String.valueOf(num1/num2);
			break;
		case "doubleMe":
			result =  String.valueOf(num1*2);
			break;
		}
		return result;
	}
}
