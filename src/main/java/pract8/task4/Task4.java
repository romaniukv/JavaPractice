package pract8.task4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Task4 {

    public static List<Integer> selectIntegers(List<Integer> integers, Predicate<Integer> predicate) {
        List<Integer> selectedIntegers = new ArrayList<>();
        for (Integer integer: integers) {
            if (predicate.test(integer))
                selectedIntegers.add(integer);
        }
        return selectedIntegers;
    }

    public static List<String> selectStrings(List<String> strings, Predicate<String> predicate) {
        List<String> selectedStrings = new ArrayList<>();
        for (String str: strings) {
            if (predicate.test(str))
                selectedStrings.add(str);
        }
        return selectedStrings;
    }
}
