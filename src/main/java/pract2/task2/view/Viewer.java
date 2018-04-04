package pract2.task2.view;

import pract2.task2.model.entities.Patient;
import pract2.task2.service.InputUtils;
import pract7.task2.ResourceManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Viewer {

    public static String INPUT_DIAGNOSIS;
    public static String INPUT_START_INT;
    public static String INPUT_END_INT;
    public static String INPUT_ERROR;
    public static String INPUT_FILE_NAME;
    public static String FILE_NOT_FOUND ;
    public static String MENU;

    private static ResourceManager resourceManager = ResourceManager.getInstance();

    static {
        updateLocale();
    }

    private static void updateLocale() {
        INPUT_DIAGNOSIS = resourceManager.getString("input_diagnosis");
        INPUT_START_INT = resourceManager.getString("input_start_int");
        INPUT_END_INT = resourceManager.getString("input_end_int");
        INPUT_ERROR = resourceManager.getString("input_error");
        INPUT_FILE_NAME = resourceManager.getString("input_file_name");
        FILE_NOT_FOUND = resourceManager.getString("file_not_found");
        MENU = resourceManager.getString("menu");
    }



    public static void showPatientList(List<Patient> patientList) {
        System.out.println("Список пациентов:");
        if(patientList.isEmpty())
            System.out.println("Список пуст.");
        else {
            for (Patient patient : patientList) {
                System.out.println(patient);
            }
        }
    }

    public static void changeInterface() {
        System.out.println("1. Українська\n2. Русский");
        int key;
        outer: while(true) {
            key = InputUtils.inputInt("");
            switch (key) {
                case 1:
                    ResourceManager.getInstance().changeResource(Locale.getDefault());
                    updateLocale();
                    break outer;
                case 2:
                    ResourceManager.getInstance().changeResource(new Locale("UA", "uk"));
                    updateLocale();
                    break outer;
                default:
                    System.out.println(Viewer.INPUT_ERROR);
            }
        }
    }
}
