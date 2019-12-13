package main.strategy_pattern.MiniDuckSim.models;

public class ModelDuck extends Duck {

    public ModelDuck() {
        this.flyBehaviour = new FlyNoWay();
        this.quackBehaviour = new Quack();
    }
    @Override
    public void display() {
        System.out.println("I am a Model Duck");
    }

}
