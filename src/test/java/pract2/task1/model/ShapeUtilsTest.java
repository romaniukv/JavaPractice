package pract2.task1.model;



import org.junit.Before;
import org.junit.Test;
import pract2.task1.model.entities.Circle;
import pract2.task1.model.entities.Rectangle;
import pract2.task1.model.entities.Shape;
import pract2.task1.model.entities.Triangle;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


public class ShapeUtilsTest {

    private ShapeUtils shapeUtils;

    @Before
    public void setUp() throws Exception {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Triangle("Blue", 5, 4, 3);
        shapes[1] = new Rectangle("Red", 35, 22.2f);
        shapes[2] = new Rectangle("Yellow", 45, 1.1f);
        shapes[3] = new Circle("Green", 10);
        shapeUtils = new ShapeUtils(shapes);

    }

    @Test
    public void calculateTotalAreaByType() {
        float result = shapeUtils.calculateTotalAreaByType("Rectangle");
        assertEquals(826.5, result, 0.01);
    }

    @Test
    public void calculateTotalArea() {
        float result = shapeUtils.calculateTotalArea();
        assertEquals(1146.65, result, 0.01);
    }

}