package bank;

public class BankAccount {
	private String accountNum;
	private double balance;
	public String getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public BankAccount() {
		super();
	}
	public BankAccount(String accountNum, double balance) {
		super();
		this.accountNum = accountNum;
		this.balance = balance;
	}
	
	public String toString() {
		String msg;
		msg="account="+this.accountNum+",balance="+this.balance;
		return msg;
	}
}
