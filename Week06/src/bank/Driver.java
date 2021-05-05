package bank;

import java.util.Scanner;

public class Driver {
	
	static Customer customer;
	static CheckingAccount ca;
	static SavingAccount sa;
	
	public static void main(String[] args) {
		int choice = menu();
		while(choice!=8) {
			switch(choice) {
			case 1: create();
				break;
			case 2:	save();
				break;
			case 3:	withdraw();
				break;
			case 4:	comsume();
				break;
			case 5:	repay();
				break;
			case 6:	settle();
				break;
			case 7:	balance();
				break;
			}
			choice = menu();
		}
		System.out.println("�����˳�");
	}
	
	public static int menu() {
		int choice;
		System.out.println("========��ӭʹ������ϵͳ========");
		System.out.println("1.����");
		System.out.println("2.���");
		System.out.println("3.ȡ��");
		System.out.println("4.����");
		System.out.println("5.����");
		System.out.println("6.���н���");
		System.out.println("7.��ѯ���");
		System.out.println("8.�˳�");
		System.out.println("��ѡ��(1-8):");
		Scanner s = new Scanner(System.in);
		choice = s.nextInt();
		return choice;
	}
	
	public static int subMenu() {
		int choice;
		System.out.println("��ѡ�񿪿�����");
		System.out.println("1.���ÿ�");
		System.out.println("2.�洢��");
		System.out.println("3.����");
		System.out.println("��ѡ��(1-3):");
		Scanner s = new Scanner(System.in);
		choice = s.nextInt();
		return choice;
	}
	
	public static void create() {
		int choice = subMenu();
		while(choice!=3) {
			switch(choice) {
			case 1:	checkingAccount();
				break;
			case 2:	savingAccount();
				break;
			}
			choice = subMenu();
		}
		System.out.println("��������");
	}
	
	public static void checkingAccount() {
		Scanner s = new Scanner(System.in);
		System.out.print("���������֤��:");
		String ssn = s.next();
		System.out.print("����������:");
		String name = s.next();
		System.out.print("�����뿨��:");
		String accountNum = s.next();
		System.out.print("���������:");
		double balance = s.nextDouble();
		System.out.print("����������:");
		double serviceCharge = s.nextDouble();
		ca = new CheckingAccount(accountNum,balance,serviceCharge);
		customer = new Customer(ssn,name,ca,sa);
	}
	
	public static void savingAccount() {
		Scanner s = new Scanner(System.in);
		System.out.print("���������֤��:");
		String ssn = s.next();
		System.out.print("����������:");
		String name = s.next();
		System.out.print("�����뿨��:");
		String accountNum = s.next();
		System.out.print("���������:");
		double balance = s.nextDouble();
		System.out.print("������������:");
		double interestRate = s.nextDouble();
		
		sa = new SavingAccount(accountNum,balance,interestRate);
		customer = new Customer(ssn,name,ca,sa);
	}

	
	public static void save() {
		Scanner s = new Scanner(System.in);
		System.out.print("����������");
		double money = s.nextDouble();
		customer.getSavingAccount().setBalance(customer.getSavingAccount().getBalance()+money);
		System.out.println("�ɹ�");
	}
	
	public static void withdraw() {
		if(customer.getSavingAccount().getBalance() <= 0) {
			System.out.println("����");
			return;
		}
		Scanner s = new Scanner(System.in);
		System.out.print("������ȡ����");
		double money = s.nextDouble();
		customer.getSavingAccount().setBalance(customer.getSavingAccount().getBalance()-money);
		System.out.println("�ɹ�");
	}
	
	public static void comsume() {
		Scanner s = new Scanner(System.in);
		System.out.print("���������ѽ��");
		double money = s.nextDouble();
		customer.getCheckingAccount().setBalance(customer.getCheckingAccount().getBalance()+money);
		System.out.println("�ɹ�");
	}
	
	public static void repay() {
		Scanner s = new Scanner(System.in);
		System.out.print("�����뻹����");
		double money = s.nextDouble();
		customer.getCheckingAccount().setBalance(customer.getCheckingAccount().getBalance()-money);
		System.out.println("�ɹ�");
	}
	
	public static void settle() {
		customer.getCheckingAccount().assessServiceCharge();
		customer.getSavingAccount().payInterest();
		System.out.println("����ɹ�");
	}
	
	public static void balance() {
		System.out.println("���:");
		System.out.println(customer.getSavingAccount().getBalance());
		System.out.println("���ÿ�:");
		System.out.println(customer.getCheckingAccount().getBalance());
	}
}