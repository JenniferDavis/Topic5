/* UML---
	 * class:  			SavingsAccount
	 * 
	 * data fields:		- id: int
	 * 					- balance: double
	 * 					- annualInterestRate: double
	 * 					- dateCreated: string
	 * 
	 * constructors:	Account()
	 * 					CreateAccount()
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
public class SavingsAccount extends Account{
	
	
	public SavingsAccount()
	{
		overdraftLimit();
	}
	
	public static void overdraftLimit()
	{
		double newBalance = getBalance();
		double newWithdraw = Account.getCurrentWithdrawAmount();
		if (newWithdraw > newBalance)
		{
			System.out.println("You do not have enough funds to withdraw.");
		}
		else
		{
			System.out.println("You have enough funds to withdraw.");
		}
	}
}

