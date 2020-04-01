package Vehicle;


import Components.Tyres;
import Components.Engine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class HybridCarTest {

    HybridCar hybridCar;

    @Before
    public void SetUp() {
        Engine engine = new Engine("hybrid");
        Tyres tyres = new Tyres("Malcs G4");
        hybridCar = new HybridCar("Toyota 1", "green", 22.000, engine, tyres);
    }

    @Test
    public void getName() {
        assertEquals("Toyota 1", hybridCar.getName());
    }


    @Test
    public void getColour() {
        assertEquals("green", hybridCar.getColour());
    }

    @Test
    public void getPrice() {
        assertEquals(22.000, hybridCar.getPrice(), 0.001);
    }

    @Test
    public void getEngine() {
        assertEquals("hybrid", hybridCar.getEngineType());
    }

    @Test
    public void getTyres() {
        assertEquals("Malcs G4", hybridCar.getTyresType());
    }

    @Test
    public void testCanStartEngine() {
        assertEquals("Vroooom", hybridCar.canStart());

    }

}