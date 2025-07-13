package com.patrones.ejemplo2;

import com.patrones.ejemplo2.Factory.Enemy;
import com.patrones.ejemplo2.Factory.EnemyFactory;
import org.springframework.boot.SpringApplication;

public class TestFactory {
    public static void main(String[] args) {
        EnemyFactory enemyFactory = new EnemyFactory();

        Enemy Warrior = enemyFactory.createEnemy("warrior");
        Warrior.attack();

        Enemy Archer = enemyFactory.createEnemy("Archer");
        Archer.attack();

        Enemy Magician = enemyFactory.createEnemy("Magician");
        Magician.attack();
    }
}
