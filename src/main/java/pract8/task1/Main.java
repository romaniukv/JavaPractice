package pract8.task1;

import pract8.task1.controller.Runner;
import pract8.task1.model.StringReplacer;
import pract8.task1.view.Viewer;

public class Main {

    public static void main(String[] args) {
        new Runner(new Viewer(), new StringReplacer()).run();
    }
}
