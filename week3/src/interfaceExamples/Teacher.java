package interfaceExamples;

public class Teacher extends Employee implements AcademicPolicy {

	@Override
	public boolean notCheating() {
		return true;
	}

}
