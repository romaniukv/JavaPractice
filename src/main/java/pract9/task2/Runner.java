package pract9.task2;

public class Runner {

    private final MyCounter myCounter = new MyCounter();

    public void run() {
        Thread counter = new Thread(() -> {

            for (int i = 0; i < 1_000_000; i++) {
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (myCounter) {
                    myCounter.increment();
                    myCounter.notify();
                }
            }
        });
        Thread printer = new Thread(() -> {
            for (int i = 0; i < 1_000_000; i++) {
                synchronized (myCounter) {
                    try {
                        myCounter.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    myCounter.print();
                }
            }
        });
        printer.start();
        counter.start();



    }
}
