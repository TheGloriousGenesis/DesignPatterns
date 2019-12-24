package main.decorator_pattern.Starbuzz.behaviour;

public abstract class Beverage {

    public final static int TALL = -1;
    public final static int GRANDE = 0;
    public final static int VENTI = 1;

    protected int size = 0;

    protected String description = "Unknown Beverage";

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
