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
     * @param file name of the file to be read.
     */
    public void openRdr(String file) {
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
    public void closeRdr() {
        try {
            bfreader.close();
            fr.close();
        } catch(IOException ioEx) {
            System.err.println("ERROR: " + ioEx.getMessage());
        } finally {
            try {
                fr.close();
            } catch(IOException ioEx) {
                System.err.println("ERROR: " + ioEx.getMessage());
            }
        }
    }

    /**
     * Uses the method readLine() to read from a text file
     * @return A String that represents a line of the text file
     */
    public String rdr() {
        String tmp = "";
        try {
            tmp = bfreader.readLine();
        } catch (IOException ioEx) {
            System.err.println("ERROR: " + ioEx.getMessage());
        }
        return tmp;
    }
}
