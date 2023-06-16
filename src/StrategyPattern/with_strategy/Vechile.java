package StrategyPattern.with_strategy;

import StrategyPattern.with_strategy.Strategy.DriveStrategy;


public class Vechile {
    DriveStrategy driveStrategy;

    Vechile(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive() {
        driveStrategy.drive();
    }

}
