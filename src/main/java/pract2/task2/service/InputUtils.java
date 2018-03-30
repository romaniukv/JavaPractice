package pract2.task2.service;

import java.util.Scanner;

public class InputUtils {

    private static Scanner in = new Scanner(System.in);

    public static int inputInt(String msg) {
        System.out.println(msg);
        int result = in.nextInt();
        in.nextLine();
        return result;
    }

    public static String inputString(String msg) {
        System.out.println(msg);
        return in.nextLine();
    }
}
