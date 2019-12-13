package main.strategy_pattern.MiniDuckSim.models;

import main.strategy_pattern.MiniDuckSim.behaviour.FlyBehaviour;

public class FlyWithWings implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I'am flying with wings");
    }
}
