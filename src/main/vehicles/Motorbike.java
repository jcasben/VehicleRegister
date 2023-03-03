package main.vehicles;

public class Motorbike extends Vehicle {

    private String carLicenseNumber;

    public Motorbike(String colour, String carLicenseNumber) {
        super("Motorbike", 2, 2, colour);
        this.carLicenseNumber = carLicenseNumber;
    }

    public String getCarLicenseNumber() {
        return carLicenseNumber;
    }
}
