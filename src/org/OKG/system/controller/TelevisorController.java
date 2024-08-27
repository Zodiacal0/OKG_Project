package org.OKG.system.controller;

import java.util.Scanner;

import org.OKG.system.model.Televisor;

public class TelevisorController extends DispositivoController {

    private String volumen;

    public TelevisorController(String volumen) {
        this.volumen = volumen;
    }

    Scanner in = new Scanner(System.in);

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

    public void setVolumen(String volumen) {
        this.volumen = volumen;
    }

    
}

