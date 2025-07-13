package com.patrones.ejemplo2.FactoryColegio;

public class AlumnoFactory extends ColegioFactory {
    @Override
    public Colegio crearMiembroColegio() {
        return new Alumno();
    }
}
