package main.vehicles;

import java.io.Serializable;

public class Vehicle implements Serializable {

    private String brand;
    private int wheels;
    private int passengers;
    private String colour;
    private String carLicenseNumber;

    public Vehicle(String brand, int wheels, int passengers, String colour, String carLicenseNumber) {
        this.brand = brand;
        this.wheels = wheels;
        this.passengers = passengers;
        this.colour = colour;
        this.carLicenseNumber = carLicenseNumber;
    }

    public String getBrand() {
        return brand;
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

    public String getCarLicenseNumber() {
        return carLicenseNumber;
    }
}
