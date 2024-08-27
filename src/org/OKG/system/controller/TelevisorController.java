package org.OKG.system.controller;

import org.OKG.system.model.Televisor;

public class TelevisorController extends DispositivoController {

    private String volumen;

    public TelevisorController(String volumen) {
        this.volumen = volumen;
    }

    @Override
    public void encender() {
        System.out.println("El Televisor está encendido con volumen: " + volumen );
    }
    
    @Override
    public void statsTelef(){
        Televisor tv = new Televisor();
        String datos = tv.toString();
        System.out.println(datos);
    }

    public String setVolumen() {
        return volumen;
    }

    public void setVolumen(String volumen) {
        this.volumen = volumen;
    }

    
}

