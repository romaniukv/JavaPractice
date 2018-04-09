package pract8.task3;

import java.util.ArrayList;
import java.util.List;

public class IntegerSorting {

    private List<Integer> integers;

    public IntegerSorting(int n) {
        fillRandom(n);
    }

    public void sort() {
        integers.sort((i1, i2) -> Integer.compare(i1, i2) * -1);
    }

    private void fillRandom(int n) {
        integers = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            integers.add((int) (Math.random() * 100));
        }
    }

    public List<Integer> getIntegers() {
        return integers;
    }

    @Override
    public String toString() {
        return integers.toString();
    }
}
