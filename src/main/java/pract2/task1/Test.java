package pract2.task1;

import pract2.task1.controller.Controller;
import pract2.task1.model.ShapeUtils;
import pract2.task1.view.Viewer;

public class Test {
    public static void main(String[] args) {
        new Controller(new ShapeUtils(), new Viewer()).run();
    }
}
