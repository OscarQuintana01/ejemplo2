package com.patrones.ejemplo2.FactoryColegio;

public class Conserje implements Colegio {
    @Override
    public void realizarTarea() {
        System.out.println("Manteniendo limpio y en orden el colegio");
    }
    @Override
    public String getRol() {
        return "Conserje";
    }
}