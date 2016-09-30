import java.util.*;
/*
 * UML
 * Class: Transaction
 * 
 * -date: java.util.Date
 * -type: char
 * -amount: double
 * -balance: double
 * -description: String
 * 
 * +Transaction(type: char, amount: double, balance: double, description: String)
 */

public class Transaction {
	private static Date date = new Date();
	private static char type;
	private static double amount;
	private static double balance;
	private static String description;
	private static ArrayList viewTransactions[];
	
	public Transaction()
	{
		
	}
	public Transaction(char newType, double newAmount, double newBalance, String newDescription)
	{
		newType = type;
		newAmount = amount;
		newBalance = balance;
		newDescription = description;
		Date newDate = date;
	}
	
	public static void addTransaction(char newType, double newAmount, double newBalance, String newDescription)
	{
		newType = type;
		newAmount = amount;
		newBalance = balance;
		newDescription = description;
		Date newDate = date;
		
	}
	
	
	
	public static void getTransaction()
	{
		System.out.print(type + " ");
		System.out.print(amount + " ");
		System.out.print(balance + " ");
		System.out.print(description + " ");
		System.out.print(date + "\n");
	}
	
	
}
