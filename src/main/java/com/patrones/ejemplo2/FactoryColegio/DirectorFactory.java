package com.patrones.ejemplo2.FactoryColegio;

public class DirectorFactory extends ColegioFactory {
    @Override
    public Colegio crearMiembroColegio() {
        return new Director();
    }
}