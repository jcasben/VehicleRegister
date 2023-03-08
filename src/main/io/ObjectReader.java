package main.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectReader {

    private FileInputStream fis;
    private ObjectInputStream reader;

    public void openReader() {
        try{
            fis = new FileInputStream("resources/register.dat");
            reader = new ObjectInputStream(fis);
        } catch(IOException ioEx) {
            System.err.println("ERROR: " + ioEx.getMessage());
        }
    }

    public void closeReader() {
        try{
            reader.close();
            fis.close();
        } catch (IOException ioEx) {
            System.err.println("ERROR: " + ioEx.getMessage());
        } finally {
            try{
                reader.close();
                fis.close();
            } catch (IOException ioEx) {
                System.err.println("ERROR: " + ioEx.getMessage());
            }
        }
    }

    public void rdObj() {
        Object obj;
        try {
            obj = reader.readObject();
            while (obj != null) {
                System.out.println(obj);
                obj = reader.readObject();
            }
        } catch (ClassNotFoundException | IOException cnfEx) {
            System.err.println("ERROR: " + cnfEx.getMessage());
        }
    }
}
