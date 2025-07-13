package com.patrones.ejemplo2.factorymethod;

public class WarriorFactory extends EnemyFactory{
    public Enemy createEnemy(){
        return new Warrior();
    }
}
