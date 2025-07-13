package com.patrones.ejemplo2.factorymethod;

public class MagicianFactory extends EnemyFactory{
    public Enemy createEnemy(){
        return new Magician();
    }
}
