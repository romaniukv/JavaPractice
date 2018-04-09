package pract8.task3;

public class Runner {

    public void run() {
        IntegerSorting integerSorting = new IntegerSorting(15);
        System.out.println("Before sorting: " + integerSorting);
        integerSorting.sort();
        System.out.println("After sorting: " + integerSorting);

        StringSorting stringSorting = new StringSorting();
        System.out.println("Before sorting: " + stringSorting);
        stringSorting.sort();
        System.out.println("After sorting: " + stringSorting);
    }
}
