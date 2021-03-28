package bankaccountapp;

public class Checking extends Account{

	//List properties specific to checking account
	private int debitcardnumber;
	private int debitcardpin;
	//Constructor to initialize checking account properties 
	public Checking(String name,String SSN,double initDeposit ) {
		super(name,SSN,initDeposit);
		accountNumber="2"+accountNumber;
		//setDebitCard();
		
	}
	
	public void setRate() {
		rate=getBaseRate()*0.15;
	}
	//List any methods specific to the checking account
	/*
	private void setDebitCard() {
		debitcardnumber=(int)(Math.random()*Math.pow(10,12));
		debitcardpin=(int)(Math.random()*Math.pow(10,4));
		System.out.println("CARD: "+this.debitcardnumber);
		System.out.println("PIN: "+this.debitcardpin);
		
		
		
	}
	*/
	
	
	public void showInfo() {
		super.showInfo();
		System.out.println("YOUR CHECKING ACCOUNT FEATURE"+
							"\n Debit Card Number: "+debitcardnumber+
							"\n Debit Card PIN"+debitcardpin
				);
	}
}
