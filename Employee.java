/*
 * UML
 * class: Employee
 * 
 * + office: String
 * + salary: Double
 * + dateHired: String
 * 
 * + Employee(): void, constructor
 * + getEmployee(): void
 * + toString(): String
 */

import java.util.*;

public class Employee extends Person {

	public static String office;
	public static double salary;
	public static String dateHired;
		
	public static void Employee(String newOffice, double newSalary)
	{
		newOffice = office;
		newSalary = salary;
		Date newDateHired = dateHired();
		dateHired = newDateHired.toString();
	}
	
	public void getEmployee()
	{
		System.out.println(office);
		System.out.println(salary);
		System.out.println(dateHired);
	}
	
	@Override
	 	public String toString() 
	  	{
	    		return "getEmployee()";
	  	}
	
	public static Date dateHired()
	{
		Date date = new Date();
		return date;
	}
	
}
