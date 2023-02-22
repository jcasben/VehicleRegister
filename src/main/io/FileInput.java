package main.io;

import main.vehicles.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileInput {

    private FileWriter fw = null;
    BufferedWriter writer = null;

    private void openWriter() {
        try {
            fw = new FileWriter("register.txt");
            writer = new BufferedWriter(fw);
        } catch(IOException ioException) {
            System.err.println("ERROR: " + ioException.getMessage());
        }
    }

    private void closeWriter() {
        try {
            writer.close();
            fw.close();
        } catch(IOException ioException) {
            System.err.println("ERROR: " + ioException.getMessage());
        } finally {
          try{
              writer.close();
              fw.close();
          } catch(IOException ioException) {
              System.err.println("ERROR: " + ioException.getMessage());
          }
        }
    }

    private void wrt(String phrase) {
        try{
            writer.write(phrase);
        } catch(IOException ioException) {
           System.err.println("ERROR: " + ioException.getMessage());
        }
    }

    public void saveVehicle(String type, Vehicle vehicle) {
        openWriter();
        wrt(type + "");
        closeWriter();
    }
}
