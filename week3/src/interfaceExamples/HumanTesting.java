package interfaceExamples;

import java.util.Vector;

public class HumanTesting {

	public static void main(String[] args) {
		SocialBehavior s1 = new Student();
		AcademicPolicy s2 = new Student();
		AcademicPolicy s3 = new Teacher();
		SocialBehavior e1 = new Employee();
//		AcademicPolicy e2 = new Employee();
		Vector<SocialBehavior> social = new Vector<SocialBehavior>();
		
		social.add(s1);
		if (s3 instanceof Teacher) {
			social.add((Teacher) s3);
		}
		if (s2 instanceof Student) {
			social.add((Student) s2);		
		}
		social.add(e1);
	}

}
