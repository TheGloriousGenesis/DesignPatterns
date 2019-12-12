package main.strategy_pattern.models;

import main.strategy_pattern.behaviour.FlyBehaviour;

public class FlyNoWay implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I can not fly :(");
    }
}
