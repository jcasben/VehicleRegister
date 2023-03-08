package main.utils;

import java.util.Scanner;
import main.utils.Register;
import main.utils.DataEntry;

/**
 * This class is used to show the Menus of the application and to call the actions which are related to each option.
 * To use it, an object of this class has to be created and then, use the wanted method on it.
 */
public class Menu {

    private Register register = new Register();
    private DataEntry entry = new DataEntry();
    private Scanner IN;

    public Menu(Scanner in) {
        IN = in;
    }

    /**
     * Shows the Main menu of the application. It will ask the user to choose an option. If the user chooses the option
     * "exit" or "e", the execution of the application will end.
     */
    public void mainMenu() {
        boolean mMenu = true;
        String opt;
        System.out.println("1 - View all registers \n" +
                           "2 - Add new register \n" +
                           "3 - Modify register \n" +
                           "4 - Delete register \n" +
                           "e - Exit");
        System.out.print("\n\nChose what you want to do: ");
        opt = IN.nextLine().toLowerCase();

        while (mMenu) {
            switch (opt) {
                case "1":       //View registers
                    break;

                case "2":       //Add new register
                    addRegisterMenu();
                    break;

                case "3":       //Modify register
                    break;

                case "4":       //Delete register
                    break;

                case "e":       //Exit program
                    mMenu = false;
                    break;

                default:
                    System.err.println("Invalid option. Please, try again.");
            }
        }
    }

    /**
     * Shows the menu where you can choose which type of vehicle the user wants to add to the register.
     * It will wait to the user to choose the option. If he chooses the option "return" or "r", it will show the main
     * menu again. It doesn't receive any parameters.
     */
    private void addRegisterMenu() {
        boolean arMenu = true;
        String opt;
        System.out.println("1 - Add Car \n" +
                           "2 - Add Van \n" +
                           "3 - Add Motorbike \n" +
                           "r - Return");
        opt = IN.nextLine().toLowerCase();

        while(arMenu) {
            switch (opt) {
                case "1":       //Add Car
                    register.addCar(entry.askBrand("car"), "","");
                    break;

                case "2":       //Add Van
                    break;

                case "3":       //Add Motorbike
                    break;

                case "r":       //Return to the main menu
                    arMenu = false;
                    break;

                default:
                    System.err.println("Invalid option. Please, try again.");            }
        }
    }
}
