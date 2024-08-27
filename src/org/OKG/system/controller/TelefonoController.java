package org.OKG.system.controller;

import org.OKG.system.model.Telefono;

public class TelefonoController extends DispositivoController {

    private int voltaje;

    public TelefonoController(int voltaje) {
        this.voltaje = voltaje;
    }

    @Override
    public void encender() {
        System.out.println("El teléfono está encendido con voltaje: " + voltaje + "V.");
    }
    
    @Override
    public void statsTelef(){
        Telefono telef = new Telefono();
        String datos = telef.toString();
        System.out.println(datos);
    }

    public int getVoltaje() {
        return voltaje;
    }

    public void setVoltaje(int voltaje) {
        this.voltaje = voltaje;
    }

    
}

