package org.OKG.system.ejercicio2.model;

public class circulo extends forma{
    private double pi = Math.PI;
    private double radio;
    
    public circulo() {
    }
    public circulo(double radio) {
        this.radio = radio;
    }

    public double getPi() {
        return pi;
    }

    public double getRadio() {
        return radio;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return pi*radio*radio; //To change body of generated methods, choose Tools | Templates.
    }
}
