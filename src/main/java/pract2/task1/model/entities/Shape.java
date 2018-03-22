package pract2.task1.model.entities;

public abstract class Shape implements Drawable {

    private String shapeColor;

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public abstract float calcArea();

    public String getShapeColor() {
        return shapeColor;
    }

    public void setShapeColor(String shapeColor) {
        this.shapeColor = shapeColor;
    }



    @Override
    public String toString() {
        return "Shape { shapeColor = " + shapeColor + " }";
    }


}
