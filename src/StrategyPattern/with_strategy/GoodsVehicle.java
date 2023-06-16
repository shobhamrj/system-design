package StrategyPattern.with_strategy;


import StrategyPattern.with_strategy.Strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vechile {

    public GoodsVehicle() {
        super(new NormalDriveStrategy());
    }
}
