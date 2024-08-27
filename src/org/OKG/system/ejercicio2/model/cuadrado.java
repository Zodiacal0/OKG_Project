/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.OKG.system.ejercicio2.model;

/**
 *
 * @author okg
 */
public class cuadrado extends forma{
    
    private double lado;

    public cuadrado() {
    }

    public cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
        
    @Override
    public double calcularArea() {
        return lado*lado;
    }    
}