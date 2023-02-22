/*
 *  --------------------------------------------------------------------------------------------------------------------
 *  Project: VehicleRegister
 *  Author: jcasben
 *  Creation date: 18/02/2023
 *  Last update: 18/02/2023
 *  Description: Development of a vehicle database, where the user will be able to create new registers of vehicles
 *               introducing the type of vehicle, the brand, colour and the date of fabrication. The user will be also
 *               capable of deleting registers and also editing them.
 *               The database will be managed in a text file and implementated with BufferedWritter and BufferedReader.
 *               For the user input, the class Scanner it's going to be used.
 *  --------------------------------------------------------------------------------------------------------------------
 */

package main;

import main.vehicles.*;

public class Main {
    private void start() {
        Vehicle [] vehicles = new Vehicle[50];
        vehicles[1] = new Car("white","7851FFF");
        vehicles[2] = new Motorbike("red", "9899PLM");
    }

    public static void main(String[] args) {
        new Main().start();
    }
}
