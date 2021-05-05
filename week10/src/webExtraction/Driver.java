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
		//System.out.println("������:");
		// String info = s.next();

		String str = "<html><head><title>��ӭ�����人��֯��ѧ��ҳ</title></head></html>\r\n" + " <body>\r\n"
				+ "  <img src='1.jpg'/>\r\n" + "  <a href='1.htm'>��ҳ</a>\r\n" + "  <a href='2.htm'>����</a>\r\n"
				+ "  <a href='3.htm'>����ѧԺ</a>\r\n" + "  <img src='2.jpg'/>\r\n" + "  <img src='3.jpg'/>\r\n"
				+ " </body>\r\n" + "</html>";
		// �ұ��⣬���ѱ������������ַ���
		String pat1 = "(<html><head><title>)(.*)(</title></head></html>)"/**/;
		Pattern p1 = Pattern.compile(pat1);
		Matcher m1 = p1.matcher(str);
		if (m1.find()) {
			title = m1.group(2);
		}
		temp1 = p1.split(str);

		// ��ͼƬ
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

		// �ҳ�����
		String pat3 = "<(a)(.*?)(>)";
		Pattern p3 = Pattern.compile(pat3);
		Matcher m3 = p3.matcher(temp1[1]);
		if (m3.find()) {
			boolean hasLink = true;
			while (hasLink) {
				// ������
				String group = m3.group(2);
				Pattern href = Pattern.compile("(href)=(\"|\')(.*?)(\\\"|\\')");
				Matcher m = href.matcher(group);
				if (m.find()) {
					hrefList.add(m.group(3));
				}

				hasLink = m3.find();
			}
		}

		// �ұ���
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
		
		System.out.println("��ҳ����:"+title);
		System.out.print("��ҳ�й���"+picList.size()+"��ͼƬ,�ļ���Ϊ");
		for (Picture p : pictureList) {
			System.out.print(p.toString());
		}
		System.out.println();
		System.out.println("��ҳ�а���"+linkList.size()+"�������ӣ���������Ϣ����:");
		System.out.println("����"+"\t"+"��ַ");
		for (Link link : linkList) {
			System.out.println(link.toString());
		}
	}
}
