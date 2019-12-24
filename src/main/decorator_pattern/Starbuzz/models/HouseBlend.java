package main.decorator_pattern.Starbuzz.models;

import main.decorator_pattern.Starbuzz.behaviour.Beverage;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        this.description = "HouseBlend";
    }

    @Override
    public double cost() {
        return .89;
    }
}
