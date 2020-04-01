package People;

import Vehicle.Vehicle;

import java.util.ArrayList;

public class Customer {

    private String name;
    private double money;
    private ArrayList<Vehicle> garage;

    public Customer(String name, double money){
        this.name = name;
        this.money = money;
        this.garage = new ArrayList<Vehicle>();
    }

    public void addCarToGarage(Vehicle vehicle){
        this.garage.add(vehicle);
    }


    public String getName() {
        return name;
    }

    public Double getMoney() {
        return money;
    }

    public void canBuyVehicle(Vehicle vehicle){
        if(this.money >= vehicle.getPrice()){
            addCarToGarage(vehicle);
        }
    }
}
