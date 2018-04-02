package pract2.task1.model;

import pract2.task1.model.entities.Circle;
import pract2.task1.model.entities.Rectangle;
import pract2.task1.model.entities.Shape;
import pract2.task1.model.entities.Triangle;

import java.util.Arrays;
import java.util.Comparator;

public class ShapeUtils {

    private Shape[] shapes;

    public ShapeUtils() {
        shapes = createShapeArray();
    }

    public ShapeUtils(Shape[] shapes) {
        this.shapes = shapes;
    }

    public float calculateTotalArea() {
        float totalArea = 0;
        for(Shape shape: shapes)
            totalArea += shape.calcArea();
        return totalArea;
    }

    public float calculateTotalAreaByType(String shapeType) {
        float totalArea = 0;
        for(Shape shape: shapes) {
            if (("package " + shape.getClass().getName()).compareTo(shape.getClass().getPackage() + "." + shapeType) == 0)
                totalArea += shape.calcArea();
        }
        return totalArea;
    }

    public void sortByAreas() {
        Arrays.sort(shapes, (Shape shape1, Shape shape2) -> Float.compare(shape1.calcArea(), shape2.calcArea()));
    }

    public void sortByColors() {
        Arrays.sort(shapes, Comparator.comparing(Shape::getShapeColor));
    }

    public Shape[] getShapes() {
        return shapes;
    }

    private Shape[] createShapeArray() {
        Shape[] result = new Shape[10];
        result[0] = new Rectangle("Green", 5, 4);
        result[1] = new Circle("Black", 10);
        result[2] = new Triangle("Orange", 5.2f, 4.3f, 5);
        result[3] = new Rectangle("White", 2, 10);
        result[4] = new Circle("Red", 7.8f);
        result[5] = new Triangle("Blue", 5, 4, 3);
        result[6] = new Rectangle("Red", 35, 22.2f);
        result[7] = new Triangle("Purple", 10, 11, 12);
        result[8] = new Rectangle("Yellow", 45, 1.1f);
        result[9] = new Circle("Green", 10);
        return result;
    }
}


