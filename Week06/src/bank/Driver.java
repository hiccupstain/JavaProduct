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
		System.out.println("程序退出");
	}
	
	public static int menu() {
		int choice;
		System.out.println("========欢迎使用银行系统========");
		System.out.println("1.开户");
		System.out.println("2.存款");
		System.out.println("3.取款");
		System.out.println("4.消费");
		System.out.println("5.还款");
		System.out.println("6.银行结算");
		System.out.println("7.查询余额");
		System.out.println("8.退出");
		System.out.println("请选择(1-8):");
		Scanner s = new Scanner(System.in);
		choice = s.nextInt();
		return choice;
	}
	
	public static int subMenu() {
		int choice;
		System.out.println("请选择开卡类型");
		System.out.println("1.信用卡");
		System.out.println("2.存储卡");
		System.out.println("3.返回");
		System.out.println("请选择(1-3):");
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
		System.out.println("开卡返回");
	}
	
	public static void checkingAccount() {
		Scanner s = new Scanner(System.in);
		System.out.print("请输入身份证号:");
		String ssn = s.next();
		System.out.print("请输入姓名:");
		String name = s.next();
		System.out.print("请输入卡号:");
		String accountNum = s.next();
		System.out.print("请输入余额:");
		double balance = s.nextDouble();
		System.out.print("请输入服务费:");
		double serviceCharge = s.nextDouble();
		ca = new CheckingAccount(accountNum,balance,serviceCharge);
		customer = new Customer(ssn,name,ca,sa);
	}
	
	public static void savingAccount() {
		Scanner s = new Scanner(System.in);
		System.out.print("请输入身份证号:");
		String ssn = s.next();
		System.out.print("请输入姓名:");
		String name = s.next();
		System.out.print("请输入卡号:");
		String accountNum = s.next();
		System.out.print("请输入余额:");
		double balance = s.nextDouble();
		System.out.print("请输入年利率:");
		double interestRate = s.nextDouble();
		
		sa = new SavingAccount(accountNum,balance,interestRate);
		customer = new Customer(ssn,name,ca,sa);
	}

	
	public static void save() {
		Scanner s = new Scanner(System.in);
		System.out.print("请输入存款金额");
		double money = s.nextDouble();
		customer.getSavingAccount().setBalance(customer.getSavingAccount().getBalance()+money);
		System.out.println("成功");
	}
	
	public static void withdraw() {
		if(customer.getSavingAccount().getBalance() <= 0) {
			System.out.println("余额不足");
			return;
		}
		Scanner s = new Scanner(System.in);
		System.out.print("请输入取款金额");
		double money = s.nextDouble();
		customer.getSavingAccount().setBalance(customer.getSavingAccount().getBalance()-money);
		System.out.println("成功");
	}
	
	public static void comsume() {
		Scanner s = new Scanner(System.in);
		System.out.print("请输入消费金额");
		double money = s.nextDouble();
		customer.getCheckingAccount().setBalance(customer.getCheckingAccount().getBalance()+money);
		System.out.println("成功");
	}
	
	public static void repay() {
		Scanner s = new Scanner(System.in);
		System.out.print("请输入还款金额");
		double money = s.nextDouble();
		customer.getCheckingAccount().setBalance(customer.getCheckingAccount().getBalance()-money);
		System.out.println("成功");
	}
	
	public static void settle() {
		customer.getCheckingAccount().assessServiceCharge();
		customer.getSavingAccount().payInterest();
		System.out.println("结算成功");
	}
	
	public static void balance() {
		System.out.println("储蓄卡:");
		System.out.println(customer.getSavingAccount().getBalance());
		System.out.println("信用卡:");
		System.out.println(customer.getCheckingAccount().getBalance());
	}
}