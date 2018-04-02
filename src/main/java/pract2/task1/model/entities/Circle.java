package pract2.task1.model.entities;

public class Circle extends Shape {
    private float radius;

    public Circle(String shapeColor, float radius) {
        super(shapeColor);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing... " + this.toString());
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    public float calcArea() {
        return (float) (Math.PI * radius * radius);
    }

    @Override
    public String toString() {
        return "Circle{ " +
                " shapeColor = " + getShapeColor() +
                ", radius = " + radius +
                "}";
    }
}
