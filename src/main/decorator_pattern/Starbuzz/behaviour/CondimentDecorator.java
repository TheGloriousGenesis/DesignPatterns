package main.decorator_pattern.Starbuzz.behaviour;

public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();

    public int getSize() {
        return size;
    };
}
