package pract2.task1.controller;

import pract2.task1.model.ShapeUtils;
import pract2.task1.service.InputUtils;
import pract2.task1.view.Viewer;


public class Controller {
    private ShapeUtils shapeUtils;
    private Viewer viewer;

    public Controller(ShapeUtils shapeUtils, Viewer viewer) {
        this.shapeUtils = shapeUtils;
        this.viewer = viewer;
    }

    public void run() {
        int key = 0;
        while (key != 6) {
            System.out.println(Viewer.MENU);
            key = InputUtils.inputInt();
            switch (key) {
                case 1:
                    viewer.showShapeArray(shapeUtils.getShapes());
                    break;
                case 2:
                    System.out.println(Viewer.TOTAL_AREA_RESULT);
                    System.out.println(shapeUtils.calculateTotalArea());
                    break;
                case 3:
                    System.out.println(Viewer.INPUT_SHAPE_TYPE);
                    String shapeType = InputUtils.inputString();
                    System.out.println(Viewer.TOTAL_AREA_BY_TYPE_RESULT);
                    System.out.println(shapeUtils.calculateTotalAreaByType(shapeType));
                    break;
                case 4:
                    System.out.println(Viewer.SORTED_BY_AREA);
                    shapeUtils.sortByAreas();
                    viewer.showShapeArray(shapeUtils.getShapes());
                    break;
                case 5:
                    System.out.println(Viewer.SORTED_BY_COLOR);
                    shapeUtils.sortByColors();
                    viewer.showShapeArray(shapeUtils.getShapes());
                    break;
                case 6: break;
                default:
                    System.out.println(Viewer.ERROR_INPUT);
            }
        }
    }
}
