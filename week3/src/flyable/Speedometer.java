package flyable;

public class Speedometer {
	public static int measureSpeed(Flyable obj) {
		System.out.println(obj.getClass().getSimpleName());
		if (obj instanceof Bird) {
			// logic
		} else if (obj instanceof Plane) {
			// other logic
		}
		
		// general logic
		double speed = obj.flyingVelocity(); 
		if (speed < 5) {
			return 1; 
		} else if (speed < 25) {
			return 2;
		} 
		return 3;
	}
} 
