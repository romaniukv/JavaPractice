package pract5.task3;

import pract5.task3.controller.Runner;
import pract5.task3.model.Translator;

public class Main {

    public static void main(String[] args) {
        Runner runner = new Runner(new Translator());
        runner.run();
    }
}
