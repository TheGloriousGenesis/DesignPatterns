package main.strategy_pattern.models;

import main.strategy_pattern.behaviour.FlyBehaviour;

public class FlyWithWings implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I'am flying with wings");
    }
}
