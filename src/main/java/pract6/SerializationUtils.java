package pract6;

import pract2.task2.model.entities.Patient;
import pract2.task2.view.Viewer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerializationUtils {

    public static void saveListToFile(String fileName, List<Patient> patients) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            outputStream.writeObject(patients);
            outputStream.flush();
        } catch (FileNotFoundException e) {
            System.out.println(Viewer.FILE_NOT_FOUND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public  static List<Patient> readListFromFile(String fileName, List<Patient> patients) {
        List<Patient> result = new ArrayList<>();
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName))) {
            result = (List<Patient>) inputStream.readObject();
        } catch (FileNotFoundException e) {
            System.out.println(Viewer.FILE_NOT_FOUND);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return result;
    }
}
