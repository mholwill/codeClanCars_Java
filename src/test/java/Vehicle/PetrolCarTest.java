package Vehicle;


import Components.Tyres;
import Components.Engine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PetrolCarTest {

    PetrolCar petrolCar;
    
    @Before
    public void SetUp(){
        Engine engine = new Engine("petrol");
        Tyres tyres = new Tyres("Smiths G4");
        petrolCar = new PetrolCar("SLK280", "Blue", 45.000, engine, tyres);
    }

    @Test
    public void getName() {
        assertEquals("SLK280", petrolCar.getName());
    }


    @Test
    public void getColour() {
        assertEquals("Blue", petrolCar.getColour());
    }

    @Test
    public void getPrice(){
        assertEquals(45.000, petrolCar.getPrice(), 0.001);
    }

    @Test
    public void getEngine(){
        assertEquals("petrol", petrolCar.getEngineType());
    }

    @Test
    public void getTyres(){
        assertEquals("Smiths G4", petrolCar.getTyresType());
    }
    
    @Test
    public void testCanStartEngine(){
        assertEquals("Vroooom", petrolCar.canStart());

    }
    
    








}
