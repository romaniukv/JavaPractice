package pract1;

import java.util.ArrayList;


public class Task2 {

    public ArrayList<Integer> find(int n){
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            if(isPerfect(i))
                result.add(i);
        }
        return result;
    }

    private boolean isPerfect(int n) {
        int sum = 0;
        for(int i = 1; i < n; i++) {
            if (n % i == 0)
                sum += i;
        }
        return n == sum;
    }
}
