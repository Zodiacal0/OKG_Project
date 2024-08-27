package org.OKG.system.model;

public class Telefono extends Dispositivo {
    
    private String marca = "SamSung";
    private String modelo = "S24 Ultra";
    private int año = 2024;
    private String bateria = "5000mH";

    public Telefono() {
    }

    public Telefono(String marca, String modelo, int año) {
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

    public String getBateria() {
        return bateria;
    }

    public void setBateria(String bateria) {
        this.bateria = bateria;
    }

    @Override
    public String toString(){
        return "Bateria: " + getBateria() + "\n" + "Marca: " + getMarca() + "\n" + "Modelo: " + getModelo() + "\n" + "Año: " + getAño();
    }
    

}
