package pract5.task2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Generator {

    private List<Integer> list = new ArrayList<>();
    private Set<Integer> set = new HashSet<>();

    public void generate(int numOfNumbers, int a, int b){
        for (int i = 0; i < numOfNumbers; i++) {
            int randomNumber = (int) (Math.random() * (b - a + 1) + a);
            list.add(randomNumber);
            set.add(randomNumber);
        }
    }

    public List<Integer> getList() {
        return list;
    }

    public Set<Integer> getSet() {
        return set;
    }
}
