/*
 * UML
 * class: Staff
 * 
 * + title: String
 * 
 * + Staff(): void, constructor
 * + getStaff(): void
 * + toString(): String
 */

import java.util.*;

public class Staff extends Employee {

	public static String title;
		
	public static void Employee(String newTitle)
	{
		newTitle = title;
	}
	
	public void getStaff()
	{
		System.out.println(title);
	}
	
	@Override
	 	public String toString() 
	  	{
	    		return "getStaff()";
	  	}
	
}
