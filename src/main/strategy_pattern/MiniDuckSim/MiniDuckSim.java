package main.strategy_pattern.MiniDuckSim;

import main.strategy_pattern.MiniDuckSim.behaviour.FlyRocketPowered;
import main.strategy_pattern.MiniDuckSim.models.Duck;
import main.strategy_pattern.MiniDuckSim.models.DuckCall;
import main.strategy_pattern.MiniDuckSim.models.MallardDuck;
import main.strategy_pattern.MiniDuckSim.models.ModelDuck;

public class MiniDuckSim {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.display();
        model.performFly();
        model.performQuack();
        model.setFlyBehaviour(new FlyRocketPowered());
        model.performFly();

        DuckCall duckCall = new DuckCall();
        duckCall.quack();
    }
}
