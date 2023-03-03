package main.utils;

import java.util.Scanner;

public class Menu {

    private Scanner IN;

    public Menu(Scanner in) {
        IN = in;
    }

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

                case "e":       //Exit
                    mMenu = false;
                    break;

                default:
                    System.out.println("Invalid option. Please, try again.");
            }
        }
    }

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
                    break;

                case "2":       //Add Van
                    break;

                case "3":       //Add Motorbike
                    break;

                case "r":
                    break;
            }
        }
    }
}
