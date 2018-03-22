package pract3.task2.model;

import java.util.ArrayList;
import java.util.Collections;

public class PassengerTrain<T extends RailwayCarriage> {

    private ArrayList<T> wagons = new ArrayList<>();

    public void setRailwayCarriage(ArrayList<T> wagons) {
        this.wagons = wagons;
    }

    public void sortByComfortClass() {
        Collections.sort(wagons, (T o1, T o2) -> Integer.compare(o1.getComfortClass(), o2.getComfortClass()));
    }

    public int calculateNumOfPassengers() {
        int result = 0;
        for (T wagon: wagons)
            result += wagon.getNumOfPassengers();
        return result;
    }

    public double calculateWeightOfLuggage() {
        double result = 0;
        for (T wagon: wagons)
            result += wagon.getWeightOfLuggage();
        return result;
    }

    public ArrayList<T> findByNumOfPassengers(int num1, int num2) {
        ArrayList<T> result = new ArrayList<>();
        for (T wagon: wagons)
            if (wagon.getNumOfPassengers() > num1 && wagon.getNumOfPassengers() < num2)
                result.add(wagon);
        return result;
    }

    public void showTrain() {
        for (T wagon: wagons)
            System.out.println(wagon);
    }
}
