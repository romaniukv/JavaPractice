package pract8.task6;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Runner {

    public void run() {
        System.out.println("**************************************************");
        List<Integer> integers = Stream.iterate(10, n -> n + 10).limit(10).map(n -> n /2).collect(Collectors.toList());
        System.out.println(integers);
        System.out.println("**************************************************");

        PersonUtils personUtils = new PersonUtils();
        System.out.println(personUtils.collectWarMans());
        System.out.println(personUtils.countAverageFemalesAge());
    }
}
