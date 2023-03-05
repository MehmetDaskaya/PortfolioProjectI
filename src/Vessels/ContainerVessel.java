package Vessels;

public class ContainerVessel extends Vessel {
	int numContainers;
	int used = 0;

	public ContainerVessel(String name, int numContainers) {
		super(name);
		this.numContainers = numContainers;
	}

	@Override
	public void loadingCargo(int number, String s) {
		if (!s.equals("TEU")) {
			System.out.println("Incorrect String!");
			return;
		}
		if (number + used > numContainers) {
			System.out.println("Number too big for this container vessel");
		} else {
			used += number;
		}
	}

	@Override
	public double loadFraction() {
		return (double) used / numContainers;
	}
}