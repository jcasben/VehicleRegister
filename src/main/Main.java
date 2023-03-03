/*
 *  --------------------------------------------------------------------------------------------------------------------
 *  Project: VehicleRegister
 *  Author: jcasben
 *  Creation date: 18/02/2023
 *  Last update: 18/02/2023
 *  Description: Development of a vehicle database, where the user will be able to create new registers of vehicles
 *               introducing the type of vehicle, the brand, colour and the date of fabrication. The user will be also
 *               capable of deleting registers and also editing them.
 *               The database will be managed in a .dat file and implementated with ObjectOutputStream and
 *               ObjectInputStream. For the user input, the class Scanner it's going to be used.
 *  --------------------------------------------------------------------------------------------------------------------
 */

package main;

import main.utils.Menu;
import main.vehicles.*;

import java.util.Scanner;

public class Main {

    private final Scanner IN = new Scanner(System.in);
    private Menu menu = new Menu(IN);
    private Vehicle [] vehicles = new Vehicle[50];

    private void start() {
        System.out.println("**************************  VEHICLE REGISTER (V1.0)  **************************");
    }

    public static void main(String[] args) {
        new Main().start();
    }
}
