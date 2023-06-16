package StrategyPattern.with_strategy;

import StrategyPattern.with_strategy.Strategy.SportsDriveStrategy;

public class SportsVehicle extends Vechile {

    SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}
