package pract2.task2.controller;

import pract2.task2.model.PatientUtils;
import pract2.task2.service.InputUtils;
import pract2.task2.view.Viewer;

import java.util.Scanner;

public class Runner {

    public void run() {
        int key = 0;
        Scanner in = new Scanner(System.in);
        PatientUtils patientUtils = new PatientUtils();
        patientUtils.generatePatientList();
        while (key != 6) {
            System.out.println(Viewer.MENU);
            key = in.nextInt();
            in.nextLine();
            switch (key) {
                case 1:
                    System.out.println(Viewer.INPUT_DIAGNOSIS);
                    String diagnosis = InputUtils.inputString();
                    Viewer.showPatientList(patientUtils.searchByDiagnosis(diagnosis));
                    break;
                case 2:
                    System.out.println(Viewer.INPUT_START_INT);
                    int num1 = InputUtils.InputInt();
                    System.out.println(Viewer.INPUT_END_INT);
                    int num2 = InputUtils.InputInt();
                    Viewer.showPatientList(patientUtils.searchByMedicalCardNumber(num1, num2));
                    break;
                case 3:
                    patientUtils.sortPatients();
                    break;
                case 4:
                    Viewer.showPatientList(patientUtils.getPatients());
                    break;
                case 5:
                    patientUtils.generatePatientList();
                    break;
                case 6:
                    break;
                default:
                    System.out.println(Viewer.INPUT_ERROR);
            }
        }
    }

}
