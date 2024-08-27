package org.OKG.system.controller;

// Clase concreta que extiende la clase abstracta
public class TelefonoController extends DispositivoController {

    private int voltaje;

    public TelefonoController(int voltaje) {
        this.voltaje = voltaje;
    }

    @Override
    public int encender() {
        System.out.println("El teléfono está encendido con voltaje: " + voltaje + "V.");
        return voltaje;
    }
    
    public int getVoltaje() {
        return voltaje;
    }

    public void setVoltaje(int voltaje) {
        this.voltaje = voltaje;
    }
}

