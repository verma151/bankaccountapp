package bankaccountapp;

public class Savings extends Account {

	//List properties specific to a Saving account
	private int safteydepositeBoxID;
	private int safteyDepositBoxKey;
	
	//Constructor to initialize Setting Setting for the Saving
	public Savings(String name,String SSN,double initDeposit) {
		super(name,SSN,initDeposit);
		accountNumber="1"+accountNumber;
		setSafetyDepositBox();
	}
	
	@Override
	public void setRate() {
		// TODO Auto-generated method stub
		rate=getBaseRate()-0.25;
	}
	
	
	private void setSafetyDepositBox() {
		safteydepositeBoxID=(int) (Math.random()*Math.pow(10,3));
		safteyDepositBoxKey=(int) (Math.random()*Math.pow(10,4));
	}
	//List any methods specific to the saving account
	
	
	public void showInfo() {
		
		System.out.println("AACOUNT TYPE: SAVING");
		super.showInfo();
		System.out.println(
				"Your Saving Account Features"+
				"\n Safety Deposit Box ID:"+safteydepositeBoxID+
				"\n Safety Deposit Box ID:"+safteyDepositBoxKey
				);
	
	}

	
	
}
