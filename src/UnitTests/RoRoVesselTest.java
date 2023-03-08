package UnitTests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Vessels.RoRoVessel;

public class RoRoVesselTest {
    RoRoVessel vessel;
    
    @Before
    public void setUp() {
        vessel = new RoRoVessel("R1", 100);
    }
    
    @Test
    public void testLoadingCargoForCar() {
        vessel.loadingCargo(2, "car");
        assertEquals(0.16, vessel.loadFraction(), 0.01);
    }
    
    @Test
    public void testLoadingCargoForTruck() {
        vessel.loadingCargo(1, "truck");
        assertEquals(0.3, vessel.loadFraction(), 0.01);
    }
    
    @Test
    public void testLoadingCargoForIncorrectString() {
        vessel.loadingCargo(2, "plane");
        assertEquals(0.0, vessel.loadFraction(), 0.01);
    }
    
    @Test
    public void testLoadingCargoForExceedingCapacity() {
        vessel.loadingCargo(15, "car");
        assertEquals(0.0, vessel.loadFraction(), 0.01);
    }
}
