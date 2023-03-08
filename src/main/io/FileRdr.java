package main.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRdr {

    private FileReader fr;
    private BufferedReader bfreader;

    /**
     * Opens the specified file to enable reading from it.
     * @param file
     */
    private void openRdr(String file) {
        try {
           fr = new FileReader(file);
           bfreader = new BufferedReader(fr);
        } catch(IOException ioEx) {
            System.err.println("ERROR: " + ioEx.getMessage());
        }
    }

    /**
     * Closes the opened file to lecture.
     */
    private void closeRdr() {
        try {
            bfreader.close();
            fr.close();
        } catch(IOException ioEx) {
            System.err.println("ERROR: " + ioEx.getMessage());
        } finally {
            try {
                bfreader.close();
                fr.close();
            } catch(IOException ioEx) {
                System.err.println("ERROR: " + ioEx.getMessage());
            }
        }
    }

    public String rdr() {

        return "";
    }
}
