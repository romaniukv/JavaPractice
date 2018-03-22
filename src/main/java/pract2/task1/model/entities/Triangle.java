package pract2.task1.model.entities;

public class Triangle extends Shape {
    private float a;
    private float b;
    private float c;

    public Triangle(String shapeColor, float a, float b, float c) {
        super(shapeColor);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void draw() {
        System.out.println("Drawing... " + this.toString());
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }

    @Override
    public float calcArea() {
        float p = (a + b + c) / 2;
        return (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }


    @Override
    public String toString() {
        return "Triangle{ " +
                "shapeColor = " + getShapeColor() +
                " a = " + a +
                ", b= " + b +
                ", c= " + c +
                " }";
    }
}
