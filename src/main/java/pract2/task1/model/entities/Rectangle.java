package pract2.task1.model.entities;

public class Rectangle extends Shape {
    private float height;
    private float width;

    public Rectangle(String shapeColor, float height, float width) {
        super(shapeColor);
        this.height = height;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Drawing... " + this.toString());
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    @Override
    public float calcArea() {
        return height * width;
    }


    @Override
    public String toString() {
        return "Rectangle{ " +
                "shapeColor = " + getShapeColor() +
                " height = " + height +
                ", width ="  + width +
                " }";
    }
}
