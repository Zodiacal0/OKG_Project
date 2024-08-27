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
public class Desarrollador extends Empleado implements Trabajo{
    private String lenguajeProg;

    public Desarrollador() {
    }

    public Desarrollador(String lenguajeProg) {
        this.lenguajeProg = lenguajeProg;
    }
    
    public void trabajar(String proyecto){
        System.out.println("Proyecto trabajado " + proyecto);
    }

    @Override
    public void trabajar() {
        System.out.println("");
    }
    
}
