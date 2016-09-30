/*
 * UML
 * class: Ch11Ex2
 * 
 * Implements Person, Student, Employee, Faculty, and Staff classes
 */

public class Ch11Ex2 {

	public static void main(String[] args) {

		// create a person, student, employee, faculty, and staff and invoke thier toString methods()

		Person person = new Person();
		person.name = "Jennifer";
		person.address = "South Carolina";
		person.phoneNumber = "123-4567";
		person.email = "jen@abc.com";
		
		Student student = new Student();
		student.studentClass = "Junior";
		
		Employee employee = new Employee();
		employee.office = "Administrator";
		employee.salary = 20000;
		employee.dateHired();
		
		Faculty faculty = new Faculty();
		faculty.officeHours = "9-5";
		faculty.rank = "First";
		
		Staff staff = new Staff();
		staff.title = "Janitor";
		
		person.getPerson();
		student.getClas$();
		employee.getEmployee();
		faculty.getFaculty();
		staff.getStaff();
		
		
		
		
		
	}

}
