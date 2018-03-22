package pract3.task2.model;

public abstract class RailwayCarriage {

    private int comfortClass;
    private int numOfPassengers;
    private double weightOfLuggage;

    public RailwayCarriage(int comfortClass, int numOfPassengers, double weightOfLuggage) {
        this.comfortClass = comfortClass;
        this.numOfPassengers = numOfPassengers;
        this.weightOfLuggage = weightOfLuggage;
    }

    public int getComfortClass() {
        return comfortClass;
    }

    public void setComfortClass(int comfortClass) {
        this.comfortClass = comfortClass;
    }

    public int getNumOfPassengers() {
        return numOfPassengers;
    }

    public void setNumOfPassengers(int numOfPassengers) {
        this.numOfPassengers = numOfPassengers;
    }

    public double getWeightOfLuggage() {
        return weightOfLuggage;
    }

    public void setWeightOfLuggage(double weightOfLuggage) {
        this.weightOfLuggage = weightOfLuggage;
    }

    @Override
    public String toString() {
        return " comfortClass = " + comfortClass +
                ", numOfPassengers = " + numOfPassengers +
                ", weightOfLuggage = " + weightOfLuggage +
                '}';
    }
}
