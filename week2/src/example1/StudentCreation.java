package example1;
import static java.lang.Math.*;

public class StudentCreation {

	public static void main(String[] args) {
		Student s1 = new Student("Izbassar Assylzhan");
		Student s2 = new Student("Izbassar Assylzhan", 1);
		
//		System.out.println(s1.getId());
//		System.out.println(s2.getId());
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(Student.numOfStudents);
		
		double x = sqrt(2);
		System.out.print(x);
	}

}
