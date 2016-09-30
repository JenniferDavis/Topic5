import java.util.*; 

public class NewAccount {

	/* UML---
	 * class:  			Account
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
	
									
	private static int id;							// id for the account with default at 0			
	protected static double balance;				// balance for the account with default at 0
	private static double annualInterestRate;	// stores current interest rate with default at 0
	private static String dateCreated;					// stores when account was created
	private double monthlyInterestRate;
	private static double currentWithdrawAmount;
	private static String name;
	

	public NewAccount() {					// constructor for default account
	}
	
	public NewAccount(String newName, int newId, double newBalance)
	{
		newName = name;
		newId = id;
		newBalance = balance;
	}
	
	
	
	public static void createAccount(int newId, double newBalance) {		// constructor for creating an account with id and initial balance
		id = newId;
		balance = newBalance;
		dateCreated = dateCreated();
	}
	
	private static String dateCreated(){
		Date date = new Date();
		String dateCreated = date.toString();			
		return dateCreated;
	}
	
	public String getDateCreated() {
		String getDateCreated = dateCreated;
		return getDateCreated;
	}
	
	// set annualInterestRate and calculate and return monthlyInterestRate
	public double getMonthlyInterestRate() {			// returns monthly interest rate
		monthlyInterestRate = ( (annualInterestRate / 100) / 12);
		return monthlyInterestRate;
	}
	
	
	public double getMonthlyInterest() {				// returns monthly interest
		monthlyInterestRate = getMonthlyInterestRate();
		double monthlyInterest = balance * monthlyInterestRate;
		return monthlyInterest;
	}
	
	
	public double withdraw(double withdraw) {						// withdraws amount from account
		Transaction transaction = new Transaction();
		currentWithdrawAmount = withdraw;
		balance = balance - withdraw;
		transaction.addTransaction('w', withdraw, balance, "Withdrawel Transaction");
		return balance;
	}
	
	public static double getCurrentWithdrawAmount()
	{
		return currentWithdrawAmount;
	}
	
	public double deposit(double deposit) {						// withdraws amount from account
		Transaction transaction = new Transaction();
		balance = balance + deposit;
		transaction.addTransaction('d', deposit, balance, "Deposit Transaction");
		//Transaction.viewTransactions.add('d', deposit, balance, "Deposit Transaction");
		return balance;
	}
	
	
	public int getId(){
		return id;
	}
	
	public void setId(int newId){
		id = newId;
	}
	
	public void setName(String newName){
		name = newName;
	}
	
	public static String getName(){
		return name;
	}
	
	public static double getBalance() {
		return balance;
	}
	
	public void setBalance(double x){
		balance = x;
	}
	
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public void setAnnualInterestRate(double newAnnualInterestRate){
		annualInterestRate = newAnnualInterestRate;
	}		
			
}
