/*
 * UML
 * class: Person
 * 
 * + name: String
 * + address: String
 * + phoneNumber: String
 * + email: String
 * 
 * + Person(): void, constructor
 * + getPerson(): void
 * + toString(): String
 */
public class Person {

	public static String name;
	public static String address;
	public static String phoneNumber;
	public static String email;
	
	public static void Person(String newName, String newAddress, String newPhoneNumber, String newEmail)
	{
		newName = name;
		newAddress = address;
		newPhoneNumber = phoneNumber;
		newEmail = email;
	}
	
	public static void getPerson()
	{
		System.out.println(name);
		System.out.println(address);
		System.out.println(phoneNumber);
		System.out.println(email);
	}
	
	@Override
	  public String toString() {
	    return "getPerson()";
	  }
}
