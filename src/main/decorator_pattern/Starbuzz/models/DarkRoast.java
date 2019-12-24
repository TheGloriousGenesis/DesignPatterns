package main.decorator_pattern.Starbuzz.models;

import main.decorator_pattern.Starbuzz.behaviour.Beverage;

public class DarkRoast extends Beverage {

    public DarkRoast(){
        this.description = "DarkRoast";
    }

    @Override
    public double cost() {
        return .99;
    }
}
