package pract6;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import pract2.task2.model.entities.Patient;
import pract2.task2.view.Viewer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerializationUtils {

    private static final Logger logger = LogManager.getLogger(SerializationUtils.class);

    public static void saveListToFile(String fileName, List<Patient> patients) {
        logger.debug("Current file name - " + fileName);
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            logger.info("Saving patients list to file: " + fileName);
            outputStream.writeObject(patients);
            outputStream.flush();
            logger.info("Saved patients list to file: " + fileName);
        } catch (FileNotFoundException e) {
            logger.error("Error " + e.getMessage());
            System.out.println(Viewer.FILE_NOT_FOUND);
        } catch (IOException e) {
            logger.error("Error " + e.getMessage());
            e.printStackTrace();
        }
    }

    public  static List<Patient> readListFromFile(String fileName, List<Patient> patients) {
        List<Patient> result = new ArrayList<>();
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName))) {
            logger.info("Restoring patients list from file: " + fileName);
            result = (List<Patient>) inputStream.readObject();
            logger.info("Restored patients list from file: " + fileName);
        } catch (FileNotFoundException e) {
            logger.error("Error " + e.getMessage());
            System.out.println(Viewer.FILE_NOT_FOUND);
        } catch (IOException | ClassNotFoundException e) {
            logger.error("Error " + e.getMessage());
            e.printStackTrace();
        }
        return result;
    }
}
