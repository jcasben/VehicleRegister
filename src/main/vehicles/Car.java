package main.vehicles;

public class Car extends Vehicle{

    private String brand;
    private String carLicenseNumber;

    public Car(String brand, String colour, String carLicenseNumber) {
        super(4,5,colour);
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
