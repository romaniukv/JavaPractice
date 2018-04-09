package pract8.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {

    public static List<Integer> selectIntegers(List<Integer> integers, IntegerChecker integerChecker) {
        List<Integer> selectedIntegers = new ArrayList<>();
        for (Integer integer: integers) {
            if (integerChecker.check(integer))
                selectedIntegers.add(integer);
        }
        return selectedIntegers;
    }

    public static List<String> selectStrings(List<String> strings, StringChecker stringChecker) {
        List<String> selectedStrings = new ArrayList<>();
        for (String str: strings) {
            if (stringChecker.check(str))
                selectedStrings.add(str);
        }
        return selectedStrings;
    }
}
