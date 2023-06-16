package StrategyPattern.without_strategy;

public class PassengerVehicle extends Vehicle{
    public void drive() {
        // use drive method from super class there was no need to override this method here as well
        super.drive();
    }
}
