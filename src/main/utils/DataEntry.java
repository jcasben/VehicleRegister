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
        String tmpString;

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

        if(!tmp){
            System.err.println("ERROR: the brand doesn't match with any existent for a " + type + ". Please, try again.");
        }
        return tmp;
    }

    /**
     * Ask the colour for the register of a Vehicle.
     * @return String that contains the verified colour of the Vehicle.
     */
    public String askColour() {
        String colour;
        do {
            System.out.print("Introduce the colour of the vehicle: ");
            colour = IN.nextLine();
        } while (!validateColour(colour));

        return colour;
    }

    /**
     * Validates if the colour introduced by the user matches with the possible colours, which are contained in
     * colours.txt
     * @param colour The value of colour introduced by the user.
     * @return True if the colour introduced by the user matches with one of the list. /
     *         False if the colour doesn't match.
     */
    private boolean validateColour(String colour) {
        boolean tmp = false;
        String tmpString;

        rdr.openRdr("resources/vehicles/colours.txt");
        tmpString = rdr.rdr();
        while (tmpString != null) {
            if(colour.equals(tmpString)){
                tmp = true;
                break;
            }
            tmpString = rdr.rdr();
        }
        rdr.closeRdr();

        if(!tmp){
            System.err.println("ERROR: the colour doesn't match with any existent. Please, try again.");
        }
        return tmp;
    }

    /**
     * Asks the user to introduce a car license number for the register of a Vehicle. This method also validates that
     * it is in a correct format.
     * @return String that contains a valid car license.
     */
    public String askCarLicenseNumber() {
        String carLicenseNumber;
        boolean validate;

        do {
            System.out.print("Introduce the colour of the vehicle: ");
            carLicenseNumber = IN.nextLine();
            validate = carLicenseNumber.matches("[A-Z]{4}[0-9]{3}");
            if(!validate){
                System.err.println("ERROR: the car license number is not in a correct format. Please, try again.");
            }
        } while (!validate);

        return carLicenseNumber;
    }

    /**
     * Asks the user to introduce a number that will represent the extra seats of a Vehicle. It will be validated
     * and bounded in between 0 and 3 (both included).
     * @return int number that will represent the number of extra seats.
     */
    public Integer askExtraPassengers() {
        Integer extraPassengers;
        do{
            System.out.print("Introduce the number of extra seats(0-3): ");
            extraPassengers = IN.nextInt();
            IN.nextLine();
        } while(!validateExtraPassengers(extraPassengers));

        return extraPassengers;
    }

    /**
     * Validates that the Integer passed by parameter is not null, and it is in between 0 and 3.
     * @param extraPassengers Integer number to validate
     * @return True if the number accomplishes the requirements / False if it is not valid.
     */
    private boolean validateExtraPassengers(Integer extraPassengers) {
        boolean validate = false;

        if(extraPassengers != null && (extraPassengers >= 0 && extraPassengers <= 3)) {
            validate = true;
        } else {
            System.err.println("ERROR: extra seats out of bounds. Please, try again.");
        }
        return validate;
    }
}
