package com.patrones.ejemplo2.FactoryColegio;

public class Alumno implements Colegio {
    @Override
    public void realizarTarea() {
        System.out.println("Estudiando y aprendiendo en clases");
    }
    @Override
    public String getRol() {
        return "Alumno";
    }
}