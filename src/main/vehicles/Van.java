package main.vehicles;

public class Van extends Car {

    private int extraPassengers;

    public Van(String brand, String colour, String carLicenseNumber, int extraPassengers) {
        super(brand, colour, carLicenseNumber);
        this.extraPassengers = extraPassengers;
    }

    @Override
    public int getPassengers() {
        return super.getPassengers() + extraPassengers;
    }
}
