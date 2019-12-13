package main.strategy_pattern.MiniDuckSim.models;

import main.strategy_pattern.MiniDuckSim.behaviour.QuackBehaviour;

public class DuckCall implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("I am a duck call");
    }
}
