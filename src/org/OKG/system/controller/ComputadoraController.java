package org.OKG.system.controller;

import java.util.Scanner;

import org.OKG.system.model.Computadora;
import org.OKG.system.model.Televisor;

public class ComputadoraController extends DispositivoController {

    private String volumen;

    public ComputadoraController(String volumen) {
        this.volumen = volumen;
    }

    Scanner in = new Scanner(System.in);

    @Override
    public void encender() {
        System.out.println("El Televisor está encendido con volumen: " + volumen );
    }
    
    @Override
    public void statsTelef(){
        Computadora pc = new Computadora();
        String datos = pc.toString();
        System.out.println(datos);
    }

    public String setVolumen() {
        return volumen;
    }
    
    @Override
    public void pass(){
        System.out.println("Ingrese la contraseña");
        int password = in.nextInt();
        if (password == 321) {
            System.out.println("Contraseña correcta");
        }else{
            System.out.println("Contraseña incorrecta");
        }
    }

    public void setVolumen(String volumen) {
        this.volumen = volumen;
    }

    
}

