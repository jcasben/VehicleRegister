package main.vehicles;

public class Car extends Vehicle{

    private String carLicenseNumber;

    public Car(String colour, String carLicenseNumber) {
        super(4,5,colour);
        this.carLicenseNumber = carLicenseNumber;
    }

    public String getCarLicenseNumber() {
        return carLicenseNumber;
    }
}
