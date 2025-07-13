package com.patrones.ejemplo2.factorymethod;

public class TestFacoryMethod {
    public static void main(String[] args) {
        Enemy warrior = new WarriorFactory().createEnemy();
        Enemy archer = new ArcherFactory().createEnemy();
        Enemy magician = new MagicianFactory().createEnemy();

        warrior.attack();
        archer.attack();
        magician.attack();
    }
}
