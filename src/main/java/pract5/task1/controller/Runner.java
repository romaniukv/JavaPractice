package pract5.task1.controller;

import pract5.task1.model.CuratorsJournal;
import pract5.task1.model.Record;
import pract5.task1.utils.InputUtils;

import java.util.Scanner;

import static pract5.task1.utils.InputUtils.*;

public class Runner {

    private CuratorsJournal curatorsJournal;

    public Runner(CuratorsJournal curatorsJournal) {
        this.curatorsJournal = curatorsJournal;
    }

    public void run() {
        Scanner in = new Scanner(System.in);
        int key = 0;
        while (key != 3) {
            System.out.println(InputUtils.MENU);
            key = in.nextInt();
            if (key == 1) {
                String firstName = inputString(INPUT_FIRST_NAME, REGEX_NAME);
                String lastName = inputString(INPUT_LAST_NAME, REGEX_NAME);
                String dateOfBirth = inputString(INPUT_DATE_OF_BIRTH, REGEX_DATE_OF_BIRTH);
                String phoneNumber = inputString(INPUT_PRHONE_NUMBER,REGEX_PRHONE_NUMBER);
                String address = inputString(INPUT_ADDRES, REGEX_ADDRES);
                curatorsJournal.addRecord(new Record(firstName, lastName, dateOfBirth, phoneNumber, address));
            }
            else if (key == 2)
                curatorsJournal.showRecords();
        }
        in.close();
    }
}
