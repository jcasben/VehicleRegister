package main.io;

import java.io.*;

/**
 * This class is used to do the output of Objects to a text file, where they will be managed. With it, you can write
 * any type of object.
 */
public class FileOutput {

    private FileOutputStream fos;
    private ObjectOutputStream writer;

    /**
     * This method opens the specified file to enable writing on it. It is constructed with a FileOutputStream and a
     * ObjectOutputStream.
     * @param file represents the name of the specified file.
     */
    private void openWriter(String file) {
        try {
            fos = new FileOutputStream(file,true);
            writer = new ObjectOutputStream(fos);
        } catch(FileNotFoundException fnfEx) {
            System.err.println("ERROR: file not found");
        } catch(IOException ioEx) {
            System.err.println("ERROR: " + ioEx.getMessage());
        }
    }

    /**
     * This method closes the writing on the file specified on openWriter(). It has to be used after writing all that
     * the user wants to write.
     */
    private void closeWriter() {
        try {
            writer.close();
            fos.close();
        } catch(IOException ioException) {
            System.err.println("ERROR: " + ioException.getMessage());
        } finally {
          try{
              fos.close();
          } catch(IOException ioException) {
              System.err.println("ERROR: " + ioException.getMessage());
          }
        }
    }

    /**
     * This method can write in a text file an object of any type. This object must implement the interface Serializable.
     * @param obj
     */
    private void wrtObj(Object obj) {
        try{
            writer.writeObject(obj);
        } catch(IOException ioException) {
           System.err.println("ERROR: " + ioException.getMessage());
        }
    }
}
