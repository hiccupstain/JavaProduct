package bank;

public class SavingAccount extends BankAccount{
	private double interestRate;

	public SavingAccount(String accountNum, double balance, double interestRate) {
		super(accountNum, balance);
		this.interestRate = interestRate;
	}

	public SavingAccount() {
		super();
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public String toString() {
		String msg;
		msg=super.toString()+",interestRate="+this.interestRate;
		return msg;
	}
	
	public void payInterest() {
		super.setBalance(getBalance()*(1+interestRate));
	}
}
