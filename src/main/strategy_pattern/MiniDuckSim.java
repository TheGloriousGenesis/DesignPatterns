package main.strategy_pattern;

import main.strategy_pattern.models.Duck;
import main.strategy_pattern.models.MallardDuck;

public class MiniDuckSim {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
    }
}
