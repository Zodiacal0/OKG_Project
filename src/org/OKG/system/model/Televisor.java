package org.OKG.system.model;

public class Televisor extends Dispositivo {
    
    private String marca = "LG";
    private String modelo = "LG TV+";
    private int año = 2024;
    private String tamaño = "80 pulgadas";

    public Televisor() {
    }

    public Televisor(String marca, String modelo, int año) {
        super(marca, modelo, año);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }
    
    

    
    

    @Override
    public String toString(){
        return "Tamaño: " + getTamaño() + "\n" + "Marca: " + getMarca() + "\n" + "Modelo: " + getModelo() + "\n" + "Año: " + getAño();
    }

}
