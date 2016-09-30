/*
 * UML
 * class: Faculty
 * 
 * + officeHours: String
 * + rank: String
 * 
 * + Faculty(): void, constructor
 * + getFaculty(): void
 * + toString(): String
 */

import java.util.*;

public class Faculty extends Employee {

	public static String officeHours;
	public static String rank;
		
	public static void Faculty(String newOfficeHours, String newRank)
	{
		newOfficeHours = officeHours;
		newRank = rank;
	}
	
	public void getFaculty()
	{
		System.out.println(officeHours);
		System.out.println(rank);
	}
	
	@Override
	 	public String toString() 
	  	{
	    		return "getFaculty()";
	  	}
	
}
