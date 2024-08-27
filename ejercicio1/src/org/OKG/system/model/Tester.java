/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.OKG.system.model;

/**
 *
 * @author mauco
 */
public class Tester extends Empleado{
    private String tipoPruebas = "Pruebas de Interfaz";
    
    public Tester(){
    
    }

    public Tester(String tipoPruebas) {
        this.tipoPruebas = tipoPruebas;
    }

    @Override
    public String toString() {
        return "tipo Pruebas:" + tipoPruebas + "\n "+ super.toString();
    }
    
    
}
