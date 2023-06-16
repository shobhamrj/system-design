package StrategyPattern.without_strategy;

public class Vehicle {

    public void drive() {
        System.out.println("Vehicle Class --> drive method");
    }
}

// suppose OffRoadVehicle's  and SportsVehicle's wants same drive() method logic, but here in this
// case there will be code duplication since we'll have to implement, therefore in this case,
// we use strategy design pattern to tackle this issue.
