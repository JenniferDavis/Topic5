/* UML---
	 * class:  			CheckingAccount
	 * 
	 * data fields:		- id: int
	 * 					- balance: double
	 * 					- annualInterestRate: double
	 * 					- dateCreated: string
	 * 
	 * constructors:		Checking	Account()			
	 * 
	 * methods:						
	 * 					id()
	 * 					balance
	 * 					annualInterestRate
	 * 								// accessor method
	 * 					dateCreated
	 * 								// rest of methods
	 * 					getMonthlyInterestRate()
	 * 					getMonthlyInterest()
	 * 					withdraw()
	 * 					deposit()
	 * 								
	 */

public class CheckingAccount extends Account {

	
	
	public CheckingAccount()
	{
		overdraftLimit();
	}
	
	public static void overdraftLimit()
	{
		double newBalance = getBalance();
		if (newBalance < 0)
		{
			System.out.println("Your account is overdrawn");
		}
		else
		{
			System.out.println("Your account is in good standing.");
		}
	}
}
