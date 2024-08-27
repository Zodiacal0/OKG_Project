/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.OKG.system.model;


/**
 *
 * @author mauco
 */
public class Desarrollador extends Empleado{
    private String lenguajeProg = "Java";

    public Desarrollador() {
    }

    public Desarrollador(String lenguajeProg) {
        this.lenguajeProg = lenguajeProg;
    }

    @Override
    public String toString() {
        return "lenguaje de programacion" + lenguajeProg+ "\n " + super.toString();
    }
    
   
}
