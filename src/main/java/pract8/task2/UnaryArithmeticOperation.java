package pract8.task2;

public class UnaryArithmeticOperation {

    private double value;

    public UnaryArithmeticOperation() {

    }

    public UnaryArithmeticOperation(double value) {
        this.value = value;
    }

    public void increment() {
        value++;
    }

    public void decrement() {
        value++;
    }

    public void changeSing() {
        value *= -1;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Value = " + value;
    }
}
