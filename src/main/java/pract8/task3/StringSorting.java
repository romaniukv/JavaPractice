package pract8.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringSorting {

    private List<String> strings;

    public StringSorting() {
        fillStrings();
    }

    private void fillStrings() {
        strings = new ArrayList<>();
        strings = Arrays.asList("ball", "girl", "boy", "peter", "anna", "strings", "array");
    }

    public void sort() {
        strings.sort((s1, s2) -> s1.compareTo(s2) * -1);
    }

    @Override
    public String toString() {
        return strings.toString();
    }
}
