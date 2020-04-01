package Vehicle;

import Components.Engine;
import Components.Tyres;

public abstract class Vehicle {

    private String name;
    private String colour;
    private Double price;
    protected Engine engine;
    protected Tyres tyres;


    public Vehicle(String name, String colour, Double price, Engine engine, Tyres tyres){
        this.name = name;
        this.colour = colour;
        this.price = price;
        this.engine = engine;
        this.tyres = tyres;
    }

    public String getName() {
        return name;
    }

    public String getColour() {
        return colour;
    }

    public Double getPrice() {
        return price;
    }

    public Engine getEngine() {
        return engine;
    }

    public String canStart(){
        return engine.start();
    }

    public Tyres getTyres() {
        return tyres;
    }

    public String getEngineType() {
        return getEngine().getEngineType();
    }

    public String getTyresType(){
        return getTyres().getTyreType();
    }


}
