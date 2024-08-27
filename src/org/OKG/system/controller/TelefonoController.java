package org.OKG.system.controller;

import java.util.Scanner;

import org.OKG.system.model.Telefono;

public class TelefonoController extends DispositivoController {

    private int voltaje;

    public TelefonoController(int voltaje) {
        this.voltaje = voltaje;
    }

    Scanner in = new Scanner(System.in);

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

    
    @Override
    public void pass(){
        System.out.println("Ingrese la contraseña");
        int password = in.nextInt();
        if (password == 123) {
            System.out.println("Contraseña correcta");
        }else{
            System.out.println("Contraseña incorrecta");
        }
    }

    public int getVoltaje() {
        return voltaje;
    }

    public void setVoltaje(int voltaje) {
        this.voltaje = voltaje;
    }

    
}

