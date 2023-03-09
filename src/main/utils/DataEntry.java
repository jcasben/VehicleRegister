package main.utils;

import java.util.Scanner;
import main.io.FileRdr;

public class DataEntry {

    FileRdr rdr = new FileRdr();
    private final Scanner IN = new Scanner(System.in);

    /**
     * Asks the user to introduce a brand for the register of a type of Vehicle.
     * @param type Type of vehicle.
     * @return String that contains the verified brand introduced by the user.
     */
    public String askBrand(String type) {
        String brand;
        do {
            System.out.print("Introduce the brand of the vehicle: ");
            brand = IN.nextLine();
        } while (!validateBrand(brand.toLowerCase(), type));

        return brand;
    }

    /**
     * Validates if the brand introduced by the user is in the text file that contains all the brands of that type of
     * Vehicle.
     * @param brand Brand introduced by the user.
     * @param type Type of Vehicle.
     * @return True if the brand introduced by the user matches with one in the text file /
     *         False if the brand doesn't match.
     */
    private boolean validateBrand(String brand, String type) {
        boolean tmp = false;
        String tmpString = "";

        rdr.openRdr("resources/vehicles/brands/" + type + "Brands.txt");
        tmpString = rdr.rdr();

        while (tmpString != null) {
            if(brand.equals(tmpString)){
                tmp = true;
                break;
            }
            tmpString = rdr.rdr();
        }
        rdr.closeRdr();

        return tmp;
    }

    public String askColour() {
        String colour;
        do {
            System.out.print("Introduce the brand of the vehicle: ");
            colour = IN.nextLine();
        } while (!true);

        return colour;
    }

    private boolean validateColour(String colour) {
        boolean tmp = false;
        String tmpString = "";

        rdr.openRdr("resources/vehicles/colours.txt");
        tmpString = rdr.rdr();


        return tmp;
    }
}
