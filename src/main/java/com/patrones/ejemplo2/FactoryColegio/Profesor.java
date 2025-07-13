package com.patrones.ejemplo2.FactoryColegio;

public class Profesor implements Colegio {
    @Override
    public void realizarTarea() {
        System.out.println("Enseñando clases y evaluando alumnos");
    }
    @Override
    public String getRol() {
        return "Profesor";
    }
}