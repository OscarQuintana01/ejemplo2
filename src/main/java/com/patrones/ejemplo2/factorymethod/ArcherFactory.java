package com.patrones.ejemplo2.factorymethod;

public class ArcherFactory extends EnemyFactory{
    public Enemy createEnemy(){
        return new Archer();
    }
}
