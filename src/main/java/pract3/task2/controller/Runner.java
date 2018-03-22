package pract3.task2.controller;

import pract3.task2.model.FreightRailwayCarriage;
import pract3.task2.model.PassengerTrain;

import java.util.ArrayList;

public class Runner {


    public void run() {
        PassengerTrain<FreightRailwayCarriage> train = new PassengerTrain<>();
        train.setRailwayCarriage(fillTrain());
        train.showTrain();
        train.sortByComfortClass();
        train.showTrain();
        System.out.println("Total number of passengers " + train.calculateNumOfPassengers());
        System.out.println("Total weight of luggage" + train.calculateWeightOfLuggage());

    }

    private ArrayList<FreightRailwayCarriage> fillTrain() {
        ArrayList<FreightRailwayCarriage> wagons = new ArrayList<>();
        for(int i = 0; i < 3; i++)
            wagons.add(new FreightRailwayCarriage((int)(Math.random() * 5 + 1),
                    (int)(Math.random() * 60 + 20), Math.random() * 500));
        return wagons;
    }
}
