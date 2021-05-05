package bank;

public class Customer {
	private String ssn;
	private String name;
	private CheckingAccount checkingAccount;
	private SavingAccount savingAccount;
	public Customer() {
		super();
	}
	public Customer(String ssn, String name, CheckingAccount checkingAccount, SavingAccount savingAccount) {
		super();
		this.ssn = ssn;
		this.name = name;
		this.checkingAccount = checkingAccount;
		this.savingAccount = savingAccount;
	}
	public CheckingAccount getCheckingAccount() {
		return checkingAccount;
	}
	public void setCheckingAccount(CheckingAccount checkingAccount) {
		this.checkingAccount = checkingAccount;
	}
	public SavingAccount getSavingAccount() {
		return savingAccount;
	}
	public void setSavingAccount(SavingAccount savingAccount) {
		this.savingAccount = savingAccount;
	}
	
	public String toString() {
		String msg;
		msg="ssn="+this.ssn+",name="+this.name+",checkingAccount="+this.checkingAccount+",savingAccount="+this.savingAccount;
		return msg;
	}
}
