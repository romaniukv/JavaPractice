package pract5.task1;

import pract5.task1.controller.Runner;
import pract5.task1.model.CuratorsJournal;

public class Test {

    public static void main(String[] args) {
        Runner runner = new Runner(new CuratorsJournal());
        runner.run();
    }
}