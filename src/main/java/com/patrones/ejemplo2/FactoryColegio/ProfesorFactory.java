package com.patrones.ejemplo2.FactoryColegio;

public class ProfesorFactory extends ColegioFactory {
    @Override
    public Colegio crearMiembroColegio() {
        return new Profesor();
    }
}