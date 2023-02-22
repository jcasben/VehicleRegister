package main.vehicles;

public class Motorbike extends Vehicle {

    private String brand;
    private String carLicenseNumber;

    public Motorbike(String brand, String colour, String carLicenseNumber) {
        super(2, 2, colour);
        this.brand = brand;
        this.carLicenseNumber = carLicenseNumber;
    }

    public String getCarLicenseNumber() {
        return carLicenseNumber;
    }

    public String getBrand() {
        return brand;
    }
}
