package main.vehicles;

public class Car extends Vehicle{

    private String carLicenseNumber;
    private String type;

    public Car(String colour, String carLicenseNumber) {
        super("Car", 4,5,colour);
        this.carLicenseNumber = carLicenseNumber;
    }

    public String getCarLicenseNumber() {
        return carLicenseNumber;
    }
}
