package UnitTests;

import static org.junit.Assert.assertEquals;

import Vessels.ContainerVessel;
import org.junit.Before;
import org.junit.Test;


public class ContainerVesselTest {
    private ContainerVessel vessel;
    
    @Before
    public void setUp() {
        vessel = new ContainerVessel("V1", 10);
    }
    
    @Test
    public void testLoadingCargo() {
        vessel.loadingCargo(5, "TEU");
        assertEquals(0.5, vessel.loadFraction(), 0.001);
    }
    
    @Test
    public void testLoadingTooManyContainers() {
        vessel.loadingCargo(12, "TEU");
        assertEquals(0, vessel.loadFraction(), 0.001);
    }
    
    @Test
    public void testLoadingIncorrectString() {
        vessel.loadingCargo(5, "not TEU");
        assertEquals(0, vessel.loadFraction(), 0.001);
    }
}
