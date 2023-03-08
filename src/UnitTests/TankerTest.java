package UnitTests;

import Vessels.Tanker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TankerTest {

    @Test
    void testLoadingCargoWithIncorrectString() {
        Tanker tanker = new Tanker("B1", 200);
        tanker.loadingCargo(100, "11");
        assertEquals(0, tanker.loadFraction());
    }

    @Test
    void testLoadingCargoWithNotEnoughSpace() {
        Tanker tanker = new Tanker("B1", 200);
        tanker.loadingCargo(100, "2");
        tanker.loadingCargo(101, "2");
        assertEquals(0.1, tanker.loadFraction());
    }

    @Test
    void testLoadingCargoWithEnoughSpace() {
        Tanker tanker = new Tanker("B1", 200);
        tanker.loadingCargo(100, "2");
        assertEquals(0.1, tanker.loadFraction());
    }

    @Test
    void testLoadFractionWithNoCargo() {
        Tanker tanker = new Tanker("B1", 200);
        assertEquals(0, tanker.loadFraction());
    }

    @Test
    void testLoadFractionWithFullCompartments() {
        Tanker tanker = new Tanker("B1", 200);
        for (int i = 1; i <= 10; i++) {
            tanker.loadingCargo(20, Integer.toString(i));
        }
        assertEquals(1.0, tanker.loadFraction());
    }
    @Test
    void testLoadCargoWithZeroOrNegativeNumber() {
        Tanker tanker = new Tanker("B1", 200);
        tanker.loadingCargo(-2, "5");
        assertEquals(0.0, tanker.loadFraction());
    }
}