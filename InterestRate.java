package bankaccountapp;

public interface InterestRate {

	//Write a method that return the base rate
	default double getBaseRate() {
		return 2.5;
	}
}
