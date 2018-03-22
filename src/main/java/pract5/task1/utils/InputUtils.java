package pract5.task1.utils;

import java.util.Scanner;

public class InputUtils {

    public static final String INPUT_FIRST_NAME = "Input student's first name:";
    public static final String INPUT_LAST_NAME = "Input student's last name:";
    public static final String INPUT_DATE_OF_BIRTH = "Input student's date of birth:";
    public static final String INPUT_PRHONE_NUMBER = "Input student's phone number:";
    public static final String INPUT_ADDRES = "Input student's address:";

    private static Scanner in = new Scanner(System.in);

    public static String inputString(String msg, String regex) {
        System.out.println(msg);
        String result = in.nextLine();

        return result;
    }
}
