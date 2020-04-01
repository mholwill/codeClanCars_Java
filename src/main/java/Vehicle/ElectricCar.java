package Vehicle;

import Behaviours.IEngineStart;
import Components.Tyres;
import Components.Engine;

public class ElectricCar extends Vehicle {

    public ElectricCar(String name, String colour, Double price, Engine engine, Tyres tyres){
        super(name, colour, price, engine, tyres);
    }



}