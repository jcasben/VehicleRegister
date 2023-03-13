package main.utils;

import main.vehicles.*;
import main.io.ObjectWriter;

public class Register {

    private final Vehicle [] REGISTERED = new Vehicle[10];
    private int inRegister = 0;
    private final ObjectWriter writer = new ObjectWriter();

    public void addCar(String brand, String colour, String carLicenseNumber) {
        REGISTERED[inRegister] = new Car(brand, colour, carLicenseNumber);
        writer.wrtObj(REGISTERED[inRegister]);
        inRegister++;
    }

    public void addMotorbike(String brand, String colour, String carLicenseNumber) {
        REGISTERED[inRegister] = new Motorbike(brand, colour, carLicenseNumber);
        writer.wrtObj(REGISTERED[inRegister]);
        inRegister++;
    }

    public void addVan(String brand, String colour, String carLicenseNumber, int passengers) {
        REGISTERED[inRegister] = new Van(brand, colour, carLicenseNumber, passengers);
        writer.wrtObj(REGISTERED[inRegister]);
        inRegister++;
    }
}
