package StrategyPattern.with_strategy;

import StrategyPattern.with_strategy.Strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vechile{

    OffRoadVehicle() {
        super(new SportsDriveStrategy());
    }

    @Override
    public void drive() {
        // some code
        System.out.println("OffRoadVehicle class ---> drive() method");
    }
}
