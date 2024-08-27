package org.OKG.system.model;

public class Computadora extends Dispositivo {

    private String marca = "Asus";
    private String modelo = "TUF F15";
    private int año = 2024;
    private String bateria = "15000mH";
    private String sistemaOperativo = "Linux";

    public Computadora() {
    }

    public Computadora(String marca, String modelo, int año) {
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

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }
    
    
    @Override
    public String toString(){
        return "Sistema Operativo: " + getSistemaOperativo() + "\n" + "Marca: " + getMarca() + "\n" + "Modelo: " + getModelo() + "\n" + "Año: " + getAño()+ "\n" + "Bateria: " + getBateria();
    }
    
}
