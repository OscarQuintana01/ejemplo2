package com.patrones.ejemplo2.FactoryColegio;

public class ConserjeFactory extends ColegioFactory {
    @Override
    public Colegio crearMiembroColegio() {
        return new Conserje();
    }
}