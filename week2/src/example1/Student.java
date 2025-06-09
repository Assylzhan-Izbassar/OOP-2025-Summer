package example1;

public class Student {
	public int id = 0;
	private String fullName;
	public int yearOfStudy = 1;
	public static int numOfStudents = 0;
	
//	public Student(String newFullName) {
//		id = Student.numOfStudents;
//		Student.numOfStudents++;
//		
//		fullName = newFullName;
//	}
	
	{
		this.id = Student.numOfStudents;
		Student.numOfStudents++;
	}
	
	public Student(String fullName) {
		this.fullName = fullName;
	}
	
	public Student(
			String fullName,
			int yearOfStudy) {
//		fullName = newFullName;
		this(fullName);
		this.yearOfStudy = yearOfStudy;
	}
	
	public int getId() {
		return this.id;
	}
}
