package com.patrones.ejemplo2.Factory;

public class EnemyFactory {
    public Enemy createEnemy(String type) {
        if (type.equalsIgnoreCase("Warrior"))
            return new Warrior();
        else if (type.equalsIgnoreCase("magician"))
            return new Magician();
        else if (type.equalsIgnoreCase("Archer"))
            return new Archer();
        else
            throw new IllegalArgumentException(
                    "Tipo de enemigo no válido: "
                            + type);
    }
}
