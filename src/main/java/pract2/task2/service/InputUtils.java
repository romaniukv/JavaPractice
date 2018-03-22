package pract2.task2.service;

import java.util.Scanner;

public class InputUtils {

    private static Scanner in = new Scanner(System.in);

    public static String inputString() {
        return in.nextLine();
    }

    public static int InputInt() {
        int result = in.nextInt();
        in.nextLine();
        return result;
    }
}
