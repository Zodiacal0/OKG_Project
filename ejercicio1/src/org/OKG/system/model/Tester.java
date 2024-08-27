/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.OKG.system.model;

import org.OKG.system.controller.Trabajo;

/**
 *
 * @author mauco
 */
public class Tester extends Empleado implements Trabajo{
    private String tipoPruebas;
    
    public Tester(){
    
    }

    public Tester(String tipoPruebas) {
        this.tipoPruebas = tipoPruebas;
    }
    
    public void trabajar(String herramienta, String proyecto){
        System.out.println("Las herramientas son " + herramienta + " y el proyecto es " + proyecto);
    }
    
    @Override
    public void trabajar() {
        System.out.println("Yo trabajo como Tester");
    }
}
