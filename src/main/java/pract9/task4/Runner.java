package pract9.task4;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class Runner {

    private static int[] array;

    public void run() {
        ForkJoinPool forkJoinPool = new ForkJoinPool(8);
        System.out.println(forkJoinPool.invoke(new CalculateArrSum(array)));
    }

    static class CalculateArrSum extends RecursiveTask<Long> {

        private int[] arr;

        public CalculateArrSum(int[] arr) {
            this.arr = arr;
        }

        @Override
        protected Long compute() {
            if (arr.length >= 20) {
                int[] firstHalf = Arrays.copyOfRange(arr, 0, arr.length / 2);
                CalculateArrSum calculateFirstHalf = new CalculateArrSum(firstHalf);
                calculateFirstHalf.fork();

                int[] secondHalf = Arrays.copyOfRange(arr, arr.length / 2, arr.length);
                CalculateArrSum calculateSecondHalf = new CalculateArrSum(secondHalf);
                long secondHalfResult = calculateSecondHalf.compute();

                return calculateFirstHalf.join() + secondHalfResult;
            }
            else {
                long sum = 0;
                for (int i: arr) {
                    sum += i;
                }
                return sum;
            }
        }
    }

    static {
        array = new int[1_000_000];
        for (int i = 0; i < 1_000_000; i++) {
            array[i] = (int) (Math.random() * 100);
            //array[i]  = 1;
        }
    }
}
