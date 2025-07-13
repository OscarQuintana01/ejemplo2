package com.patrones.ejemplo2.FactoryColegio;

public class Director implements Colegio {
    @Override
    public void realizarTarea() {
        System.out.println("Administrando el colegio y tomando decisiones");
    }
    @Override
    public String getRol() {
        return "Director";
    }
}
