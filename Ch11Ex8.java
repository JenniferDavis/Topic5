
public class Ch11Ex8 {
	public static void main(String[] args) {
		Transaction transaction = new Transaction();
		NewAccount account = new NewAccount();
		account.setAnnualInterestRate(1.5);
		account.setBalance(1000.00);
		account.setId(1122);
		account.setName("George");
		
		account.deposit(30.00);
		account.deposit(40.00);
		account.deposit(50.00);
		account.withdraw(5.00);
		account.withdraw(4.00);
		account.withdraw(2.00);
		
		System.out.println(account.getName());
		System.out.println(account.getAnnualInterestRate());
		System.out.println(account.getBalance());
		transaction.getTransaction();
		
		
		
	}
}
