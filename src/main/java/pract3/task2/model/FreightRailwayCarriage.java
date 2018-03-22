package pract3.task2.model;

import java.util.HashMap;


public class FreightRailwayCarriage extends RailwayCarriage {

    private static HashMap<String, String> g = new HashMap<>();

    public FreightRailwayCarriage(int comfortClass, int numOfPassengers, double weightOfLuggage) {
        super(comfortClass, numOfPassengers, weightOfLuggage);
        g.put("1", "2");
    }

    @Override
    public String toString() {

        return "FreightRailwayCarriege{ " + super.toString();
    }
}
