package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		List<Account> accounts=new LinkedList<Account>();
		
		
		
		/*Checking chkacc1=new Checking("Tom Wilson","315648259",1500);
		
		Savings savacc1= new Savings("Rich Love","662442658",2500);
		//Read a CSV File then create new account based on that data*/ 
		
		String file="C:\\Users\\pc\\Desktop\\NewBankAccounts.csv";
		
		/*savacc1.showInfo();
		System.out.println("***********************");
		chkacc1.showInfo();
		
		*/
		List<String[]> newAccountHolder=utilities.CSV.read(file);
		for(String[] accountHolder: newAccountHolder) {
			
			String name=accountHolder[0];
			String SSN=accountHolder[1];
			String accountType=accountHolder[2];
			double initDeposit=Double.parseDouble(accountHolder[3]);
			//System.out.println(name+" "+SSN+" "+accountType+" $"+initDeposit);
			
			if(accountType.equals("Savings")) {
				
				accounts.add(new Savings(name,SSN,initDeposit));
			}
			else if(accountType.equals("Checking")) {
				
				accounts.add(new Checking(name,SSN,initDeposit));
			}
			else
			{
				System.out.println("ERROR READING ACCOUNT TYPE");
			}
			
		}
		
		for(Account acc:accounts) {
			System.out.println("\n*****************");
			acc.showInfo();
		}
		
		
	}

}
