package bank;

public class CheckingAccount extends BankAccount{
	

	private double serviceCharge;

	public CheckingAccount() {
		super();
	}

	public CheckingAccount(String accountNum, double balance, double serviceCharge) {
		super(accountNum, balance);
		this.serviceCharge = serviceCharge;
	}

	public double getServiceCharge() {
		return serviceCharge;
	}

	public void setServiceCharge(double serviceCharge) {
		this.serviceCharge = serviceCharge;
	}
	
	public String toString() {
		String msg;
		msg=super.toString()+",serviceCharge="+this.serviceCharge;
		return msg;
	}
	
	public void assessServiceCharge() {
		super.setBalance(getBalance()-this.serviceCharge);
	}
}
