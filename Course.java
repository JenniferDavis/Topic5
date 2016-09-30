import java.util.*;

/*
 * UML
 * Class: Course
 * 
 * - courseName: String
 * - students: String []
 * - numberOfStudents: int
 * 
 * + course(): constructor
 * + addStudent(): void
 * + getStudents(): void
 * + getNumberOfStudents(): int
 * + getCourseName(): String
 * + dropStudent(): String
 * 
 */
public class Course {

		private String courseName;
		private ArrayList students = new ArrayList(100);
		private int numberOfStudents;
		
		public Course(String courseName) 
		{
			this.courseName = courseName;
		}
		
		public void addStudent(String student) 
		{
			students.add(student);
			numberOfStudents++;
		}
		
		public void getStudents() {
			String studentList = students.toString();
			System.out.println(studentList);

		}
		
		public int getNumberOfStudents() {
		return numberOfStudents;
		}
		
		public String getCourseName() {
		return courseName;
		}
		
		public void dropStudent(String student) {
			students.remove(student);
			numberOfStudents--;
		}
}
