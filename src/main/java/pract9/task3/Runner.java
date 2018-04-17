package pract9.task3;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Runner {

    private static int numOfThreads = 5000;
    private int key;

    public void run() {
        key = 0;
        Map<Integer, Integer> concurrentHashMap= new ConcurrentHashMap<>(64, 0.5f);
        System.out.println("Writing in ConcurrentHashMap: " + calculateWritingTime(concurrentHashMap));
        System.out.println("Reading from ConcurrentHashMap: " +calculateReadingTime(concurrentHashMap));

        key = 0;
        Map<Integer, Integer> hashMap = new HashMap<>(64, 0.5f);
        System.out.println("Writing in HashMap: " + calculateWritingTime(hashMap));
        System.out.println("Reading from HashMap: " + calculateReadingTime(hashMap));


    }

    private long calculateWritingTime(Map<Integer, Integer> map) {
        ArrayList<Thread> threads = new ArrayList<>();

        for (int j = 0; j < numOfThreads; j++) {
            Thread write = new Thread(() -> {
                map.put(key, key);
                key++;
            });
            threads.add(write);
        }

        long startTime = System.currentTimeMillis();
        for (Thread thread: threads) {
            thread.start();
        }

        for (Thread thread: threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        long endTime = System.currentTimeMillis();

        return endTime - startTime;
    }

    private long calculateReadingTime(Map<Integer, Integer> map) {
        ArrayList<Thread> threads = new ArrayList<>();

        for (int j = 0; j < numOfThreads; j++) {
            Thread read = new Thread(() -> {
                for (int i: map.keySet())
                    map.get(i);
            });
            threads.add(read);
        }

        long startTime = System.currentTimeMillis();
        for (Thread thread: threads) {
            thread.start();
        }

        for (Thread thread: threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        long endTime = System.currentTimeMillis();

        return endTime - startTime;
    }
}
