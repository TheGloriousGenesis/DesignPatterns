package main.decorator_pattern.Starbuzz.models;

import main.decorator_pattern.Starbuzz.behaviour.Beverage;
import main.decorator_pattern.Starbuzz.behaviour.CondimentDecorator;

public class Whip extends CondimentDecorator {

    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return 0.10 + beverage.cost();
    }
}
