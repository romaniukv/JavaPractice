package pract5.task1.utils;

import java.util.Scanner;

public class InputUtils {

    public static final String INPUT_FIRST_NAME = "Input student's first name:";
    public static final String INPUT_LAST_NAME = "Input student's last name:";
    public static final String INPUT_DATE_OF_BIRTH = "Input student's date of birth:";
    public static final String INPUT_PRHONE_NUMBER = "Input student's phone number:";
    public static final String INPUT_ADDRES = "Input student's address:";
    public static final String INPUT_ERROR = "Input error! Try again.";

    public static final String REGEX_NAME = "^[A-Z]{1}[a-z]+$";
    public static final String REGEX_DATE_OF_BIRTH = "";
    public static final String REGEX_PRHONE_NUMBER = "";
    public static final String REGEX_ADDRES = "";

    private static Scanner in = new Scanner(System.in);

    public static String inputString(String msg, String regex) {
        System.out.println(msg);
        while (true) {
            String str = in.nextLine();
            if (str.matches(regex))
                return str;
            else
                System.out.println(INPUT_ERROR);
        }
    }
}
