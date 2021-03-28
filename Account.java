package bankaccountapp;

public abstract class Account implements InterestRate {

	//List properties specific to a checking account
	private String name;
	private String SSN;
	private double balance;
	
	private static int index=10000;
	protected String accountNumber;
	protected double rate;
	
	//Constructor to initialize checking account properties
	public Account(String name,String SSN,double initDeposit) {
		this.name=name;
		this.SSN=SSN;
		balance=initDeposit;
		//Set account number
		index++;
		this.accountNumber=setAccountNumber();
		setRate();
	
	}
	
	public abstract void setRate();
	
	private String setAccountNumber() {
		String lastTwoSSN=SSN.substring(SSN.length()-2,SSN.length());
		int uniqueID=index;
		int randomnumber=(int) (Math.random()*Math.pow(10,3));
		return lastTwoSSN+uniqueID+randomnumber;
	}
	
	
	public void compound() {
		double accruediInterest=balance*(rate/100);
		balance=balance+accruediInterest;
		System.out.println("Accrued Interest: $"+accruediInterest);
		printBalance();
	}
	
	
	//List common methods -transactions
	public void deposit(double amount) {
		balance=balance+amount;
		System.out.println("Depositing $"+amount);
		printBalance();
	}
	
	public void withdraw(double amount) {
		balance=balance-amount;
		System.out.println("Withdrawing $"+amount);
		printBalance();
	} 
	public void transfer(String toWhere,double amount) {
		balance=balance-amount;
		System.out.println("Transfering $"+amount+"to"+toWhere);
		printBalance();
	}
	
	public void printBalance() {
		System.out.println("Your balance is now: $"+balance);
	}
	
	
	public void showInfo() {
		System.out.println(
				"NAME: "+name+
				"\nACCOUNT NUMBER: "+accountNumber+
				"\nBALANCE: "+balance+
				"\nRATE: " +rate+"%"
				);
	}
	
	
}
