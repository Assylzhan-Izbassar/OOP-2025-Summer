package flyable;

public class SpeedometerTest {

	public static void main(String[] args) {
		
		Plane airbus = new Plane();
		Bird crown = new Bird();
		
		System.out.println(Speedometer.measureSpeed(crown));
		System.out.println(Speedometer.measureSpeed(airbus));
		
		System.out.println(((Flyable) airbus).VELOCITY_MEASURE);

	}

}
