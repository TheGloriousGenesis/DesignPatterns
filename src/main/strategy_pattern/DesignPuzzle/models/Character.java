package main.strategy_pattern.DesignPuzzle.models;

import main.strategy_pattern.DesignPuzzle.behaviour.WeaponBehaviour;

public abstract class Character {
    WeaponBehaviour weaponBehaviour;

    public abstract void fight();
}
