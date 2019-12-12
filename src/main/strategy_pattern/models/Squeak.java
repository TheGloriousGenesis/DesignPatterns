package main.strategy_pattern.models;

import main.strategy_pattern.behaviour.QuackBehaviour;

public class Squeak implements QuackBehaviour {

    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
