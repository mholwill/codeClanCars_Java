package Vehicle;

import Components.Tyres;
import Components.Engine;

public class PetrolCar extends Vehicle {

    public PetrolCar(String name, String colour, Double price, Engine engine, Tyres tyres){
        super(name, colour, price, engine, tyres);
    }

}
