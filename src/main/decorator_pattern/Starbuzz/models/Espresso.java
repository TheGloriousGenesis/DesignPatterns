package main.decorator_pattern.Starbuzz.models;

import main.decorator_pattern.Starbuzz.behaviour.Beverage;

public class Espresso extends Beverage {

    public Espresso() {
        this.description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
