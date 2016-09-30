/*
 * UML
 * class: Student
 * 
 * + freshmanClass: String, constant
 * + sophmoreClass: String, constant
 * + juniorClass: String, constant
 * + seniorClass: String, constant
 * + studentClass: String
 * 
 * + Student(): void, constructor
 * + getClas$(): void
 * + toString(): String
 */
public class Student extends Person {

	public static String freshmanClass = "Freshman";
	public static String sophmoreClass = "Sophmore";
	public static String juniorClass = "Junior";
	public static String seniorClass = "Senior";
	public static String studentClass;

	
	public static void Student(String whichClass)
	{
		studentClass = whichClass; 
		if (studentClass == "Freshman")
		{
		studentClass = freshmanClass;
		}
		else if (studentClass == "Sophmore")
		{
		studentClass = sophmoreClass;
		}
		else if (studentClass == "Junior")
		{
		studentClass = juniorClass;
		}
		else if (studentClass == "Senior")
		{
		studentClass = seniorClass;
		}
		else 
		{
			studentClass = "No class stated.";
		}
	}
	
	public void getClas$()
	{
		System.out.println(studentClass);
	}
	
	@Override
	 	public String toString() 
	  	{
	    		return "getClass()";
	  	}
}
