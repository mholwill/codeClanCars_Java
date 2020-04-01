package Vehicle;

import Behaviours.IEngineStart;
import Components.Tyres;
import Components.Engine;

public class HybridCar extends Vehicle {

    public HybridCar(String name, String colour, Double price, Engine engine, Tyres tyres){
        super(name, colour, price, engine, tyres);
    }



}

