/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.OKG.system.ejercicio2.model;

/**
 *
 * @author informatica
 */
public class triangulo extends forma{
    private double altura;
    private double base;
    private double mitad = 0.5;

    public triangulo() {
    }

    public triangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double calcularArea() {
        return base*altura*mitad;
    }
    
    
}
