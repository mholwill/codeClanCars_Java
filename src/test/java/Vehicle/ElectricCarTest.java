package Vehicle;


import Components.Tyres;
import Components.Engine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ElectricCarTest {

    ElectricCar electricCar;

    @Before
    public void SetUp() {
        Engine engine = new Engine("electric");
        Tyres tyres = new Tyres("Malcs G4");
        electricCar = new ElectricCar("Tesla 200", "Yellow", 62.000, engine, tyres);
    }

    @Test
    public void getName() {
        assertEquals("Tesla 200", electricCar.getName());
    }


    @Test
    public void getColour() {
        assertEquals("Yellow", electricCar.getColour());
    }

    @Test
    public void getPrice() {
        assertEquals(62.000, electricCar.getPrice(), 0.001);
    }

    @Test
    public void getEngine() {
        assertEquals("electric", electricCar.getEngineType());
    }

    @Test
    public void getTyres() {
        assertEquals("Malcs G4", electricCar.getTyresType());
    }

    @Test
    public void testCanStartEngine() {
        assertEquals("Vroooom", electricCar.canStart());

    }

}
