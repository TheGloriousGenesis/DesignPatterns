package main.strategy_pattern.MiniDuckSim.models;

import main.strategy_pattern.MiniDuckSim.behaviour.QuackBehaviour;

public class MuteQuack implements QuackBehaviour {

    @Override
    public void quack() {
        System.out.println("...");
    }
}
