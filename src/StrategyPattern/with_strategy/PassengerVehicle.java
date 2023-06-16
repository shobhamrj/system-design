package StrategyPattern.with_strategy;

import StrategyPattern.with_strategy.Strategy.NormalDriveStrategy;

public class PassengerVehicle extends Vechile{

    PassengerVehicle() {
        super(new NormalDriveStrategy());
    }
}
