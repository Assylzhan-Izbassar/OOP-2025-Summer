package interfaceExamples;

public class Student extends Human implements AcademicPolicy {

	@Override
	public boolean notCheating() {
		return true;
	}
}
