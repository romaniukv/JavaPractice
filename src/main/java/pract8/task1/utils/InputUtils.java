package pract8.task1.utils;

import java.util.Scanner;

public class InputUtils {

    private static Scanner in = new Scanner(System.in);

    public static int inputInt() {
        int result = in.nextInt();
        in.nextLine();
        return result;
    }

    public static String inputString() {
        return in.nextLine();
    }
}
