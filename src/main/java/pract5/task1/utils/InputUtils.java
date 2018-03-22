package pract5.task1.utils;

import java.util.Scanner;

public class InputUtils {

    public static final String MENU = "1. Add note.\n" +
                                      "2. Show curator's journal.\n" +
                                      "3. Quit.";
    public static final String INPUT_FIRST_NAME = "Input student's first name:";
    public static final String INPUT_LAST_NAME = "Input student's last name:";
    public static final String INPUT_DATE_OF_BIRTH = "Input student's date of birth (dd.mm.yyyy) :";
    public static final String INPUT_PRHONE_NUMBER = "Input student's phone number (+38-XXX-XXX-XX-XX) :";
    public static final String INPUT_ADDRES = "Input student's address(Street, house number, apartment number):";
    public static final String INPUT_ERROR = "Input error! Try again.";

    public static final String REGEX_NAME = "^[A-Z]{1}[a-z]+$";
    public static final String REGEX_DATE_OF_BIRTH = "^[0-3]{1}[0-9]?\\.[0-1]{1}[0-9]?\\.[1-2]{1}[0-9]{3}$";
    public static final String REGEX_PRHONE_NUMBER = "^[+]?38-([0-9]){3}-[0-9]{3}-[0-9]{2}-[0-9]{2}$";
    public static final String REGEX_ADDRES = "^[A-Z]{1}[a-z]+,\\s[1-9]{1}[0-9]*,\\s[1-9]{1}[0-9]*$";

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
