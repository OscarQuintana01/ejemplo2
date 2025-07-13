package com.patrones.ejemplo2.FactoryColegio;

public abstract class ColegioFactory {
    public abstract Colegio crearMiembroColegio();

    public void mostrarInformacion() {
        Colegio miembro = crearMiembroColegio();
        System.out.println("Rol: " + miembro.getRol());
        miembro.realizarTarea();
    }
}