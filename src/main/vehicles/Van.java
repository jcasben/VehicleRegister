package main.vehicles;

public class Van extends Car {

    private int extraPassengers;

    public Van(String colour, String carLicenseNumber, int extraPassengers) {
        super(colour, carLicenseNumber);
        this.extraPassengers = extraPassengers;
    }

    @Override
    public int getPassengers() {
        return super.getPassengers() + extraPassengers;
    }
}
