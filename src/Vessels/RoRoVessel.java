package Vessels;

public class RoRoVessel extends Vessel {

	int laneMeters;
	int used;

	public RoRoVessel(String name, int laneMeters) {
		super(name);
		this.laneMeters = laneMeters;
	}

	@Override
	public void loadingCargo(int number, String s) {
		int length
				= 0;
		if (number <= 0) {
			System.out.println("Invalid number");
			return;
		}
		if (s.equals("car")) {
			length = 8;
		} else if (s.equals("truck")) {
			length = 30;
		} else {
			System.out.println("Incorrect String!");
		}
		length *= number;
		if (length + used > laneMeters) {
			System.out.println("No capacity!");
		} else {
			used += length;
		}
	}

	@Override
	public double loadFraction() {
		return (double) used / laneMeters;
	}
}
