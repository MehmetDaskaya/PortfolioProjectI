package Vessels;

public class Tanker extends Vessel {
	double capacity;
	final int compartments = 10;
	int[] used = new int[10];

	public Tanker(String name, double capacity) {
		super(name);
		this.capacity = capacity;
	}

	@Override
	public void loadingCargo(int number, String s) {
		if (Integer.parseInt(s) > 10) {
			System.out.println("Incorrect String!");
			return;
		}
		if (number <= 0) {
			System.out.println("Invalid number");
			return;
		}
		if (used[Integer.parseInt(s) - 1] + number > capacity) {
			System.out.println("Tanker does not have enough space");
		} else {
			used[Integer.parseInt(s) - 1] += number;
		}
	}

	@Override
	public double loadFraction() {
		int counter = 0;
		for (int a : used) {
			if (a != 0) {
				counter++;
			}
		}
		return (double) counter / compartments;
	}
}
