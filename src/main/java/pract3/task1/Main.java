package pract3.task1;

import pract3.task1.controller.Runner;
import pract3.task1.model.entities.Store;

public class Main {

    public static void main(String[] args) {
        Runner runner = new Runner(new Store());
        runner.run();
    }
}
