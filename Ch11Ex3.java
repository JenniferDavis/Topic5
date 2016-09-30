
public class Ch11Ex3 {

	public static void main(String[] args) {
		Account account = new Account();
		
		CheckingAccount checkingAccount = new CheckingAccount();
		
		SavingsAccount savingsAccount = new SavingsAccount();
		
		account.setId(1);
		account.setBalance(100.00);
		
		account.getId();
		account.getBalance();
		
		checkingAccount.overdraftLimit();
		savingsAccount.overdraftLimit();
		

	}

}
