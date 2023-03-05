import Vessels.ContainerVessel;
import Vessels.RoRoVessel;
import Vessels.Tanker;
import Vessels.Vessel;

public class Main {
	public static void main(String[] args) {
		Vessel containerV1 = new ContainerVessel("A1", 20);
		Vessel tankerT1 = new Tanker("B1", 200);
		Vessel roroR1 = new RoRoVessel("C1", 60);

		containerV1.loadingCargo(15, "TEU");
		containerV1.loadingCargo(15, "TEU");

		tankerT1.loadingCargo(100, "2");
		tankerT1.loadingCargo(1000, "2");

		roroR1.loadingCargo(2, "truck");
		roroR1.loadingCargo(200, "car");


		System.out.println(containerV1.loadFraction());
		System.out.println(tankerT1.loadFraction());
		System.out.println(roroR1.loadFraction());

	}
}