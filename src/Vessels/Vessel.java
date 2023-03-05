package Vessels;

abstract public class Vessel {
	String name;

	Vessel(String name) {
		this.name = name;
	}

	abstract public void loadingCargo(int number, String s);

	abstract public double loadFraction();
}
