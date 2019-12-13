package main.strategy_pattern.DesignPuzzle.models;

import main.strategy_pattern.DesignPuzzle.behaviour.WeaponBehaviour;

public class SwordBehaviour implements WeaponBehaviour {
    @Override
    public void useWeapon() {
        System.out.println("Swish");
    }
}
