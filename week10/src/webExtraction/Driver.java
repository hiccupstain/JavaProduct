package webExtraction;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Driver {
	public static void main(String[] args) {
		ArrayList<String> picList = new ArrayList<String>();
		ArrayList<String> hrefList = new ArrayList<String>();
		ArrayList<String> titleList = new ArrayList<String>();
		ArrayList<Link> linkList = new ArrayList<Link>();
		ArrayList<Picture> pictureList = new ArrayList<Picture>();
		String[] temp1;
		String title="";

		//Scanner s = new Scanner(System.in);
		//System.out.println("请输入:");
		// String info = s.next();

		String str = "<html><head><title>欢迎访问武汉纺织大学主页</title></head></html>\r\n" + " <body>\r\n"
				+ "  <img src='1.jpg'/>\r\n" + "  <a href='1.htm'>首页</a>\r\n" + "  <a href='2.htm'>教务处</a>\r\n"
				+ "  <a href='3.htm'>数计学院</a>\r\n" + "  <img src='2.jpg'/>\r\n" + "  <img src='3.jpg'/>\r\n"
				+ " </body>\r\n" + "</html>";
		// 找标题，并把标题与其他部分分离
		String pat1 = "(<html><head><title>)(.*)(</title></head></html>)"/**/;
		Pattern p1 = Pattern.compile(pat1);
		Matcher m1 = p1.matcher(str);
		if (m1.find()) {
			title = m1.group(2);
		}
		temp1 = p1.split(str);

		// 找图片
		String pat2 = "<(img)(.*?)(>)";
		Pattern p2 = Pattern.compile(pat2);
		Matcher m2 = p2.matcher(temp1[1]);
		if (m2.find()) {
			boolean hasPic = true;
			while (hasPic) {
				String group = m2.group(2);
				Pattern src = Pattern.compile("(src)=(\"|\')(.*?)(\\\"|\\')");
				Matcher m = src.matcher(group);
				if (m.find()) {
					picList.add(m.group(3));
				}
				hasPic = m2.find();
			}

		}

		// 找超链接
		String pat3 = "<(a)(.*?)(>)";
		Pattern p3 = Pattern.compile(pat3);
		Matcher m3 = p3.matcher(temp1[1]);
		if (m3.find()) {
			boolean hasLink = true;
			while (hasLink) {
				// 找链接
				String group = m3.group(2);
				Pattern href = Pattern.compile("(href)=(\"|\')(.*?)(\\\"|\\')");
				Matcher m = href.matcher(group);
				if (m.find()) {
					hrefList.add(m.group(3));
				}

				hasLink = m3.find();
			}
		}

		// 找标题
		String pat4 = "(>)(.*?)(<)";
		Pattern p4 = Pattern.compile(pat4);
		Matcher m4 = p4.matcher(temp1[1]);
		boolean hasTitle = m4.find();
		while (hasTitle) {
			titleList.add(m4.group(2));
			hasTitle = m4.find();
		}
		
		for (int i = 0; i < picList.size(); i++) {
			Picture p = new Picture(picList.get(i));
			pictureList.add(p);
		}
		
		for (int i = 0; i < hrefList.size(); i++) {
			Link l = new Link(titleList.get(i),hrefList.get(i));
			linkList.add(l);
		}
		
		System.out.println("网页标题:"+title);
		System.out.print("网页中共有"+picList.size()+"个图片,文件名为");
		for (Picture p : pictureList) {
			System.out.print(p.toString());
		}
		System.out.println();
		System.out.println("网页中包含"+linkList.size()+"个超链接，超链接信息如下:");
		System.out.println("名称"+"\t"+"地址");
		for (Link link : linkList) {
			System.out.println(link.toString());
		}
	}
}
