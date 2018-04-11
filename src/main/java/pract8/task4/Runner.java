package pract8.task4;

import pract8.task3.IntegerSorting;
import pract8.task3.StringSorting;
import pract8.task5.Task5;

import java.util.List;

public class Runner {

    public void run() {
        List<Integer> integers = new IntegerSorting(10).getIntegers();
        System.out.println("Integers: " + integers);
        List<Integer> selectedIntegers = Task4.selectIntegers(integers, i -> i % 2 == 0);
        System.out.println("Selected integers: " + selectedIntegers);

        List<String> strings = new StringSorting().getStrings();
        System.out.println("Strings: " + strings);
        List<String> selectedStrings = Task4.selectStrings(strings, s -> s.charAt(0) == 'a');
        System.out.println("Selected strings: " + selectedStrings);
    }
}
