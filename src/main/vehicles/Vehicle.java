package main.vehicles;

public class Vehicle {

    private int wheels;
    private int passengers;
    private String colour;

    public Vehicle(String type, int wheels, int passengers, String colour) {
        this.wheels = wheels;
        this.passengers = passengers;
        this.colour = colour;
    }

    public int getWheels() {
        return wheels;
    }

    public int getPassengers() {
        return passengers;
    }

    public String getColour() {
        return colour;
    }
}
