package main.strategy_pattern.MiniDuckSim.models;

import main.strategy_pattern.MiniDuckSim.behaviour.FlyBehaviour;
import main.strategy_pattern.MiniDuckSim.behaviour.QuackBehaviour;

public abstract class Duck {

    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public abstract void display();

    public void performFly() {
        flyBehaviour.fly();
    }

    public void performQuack() {
        quackBehaviour.quack();
    }

    public void setFlyBehaviour(final FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(final QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
}