package org.OKG.system.model;


public class Empleado{

    private String nombre = "Diego";
    private int edad = 18;
    private double salario = 3800.99;

    public Empleado(){

    }

    public Empleado (String nombre, int edad, double salario){
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;

    }
    
    public void trabajar(int horas){
        System.out.println("horas trabajadas " + horas);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "nombre: " + nombre + "\n " +
                "edad: "  + edad +   "\n" + "salario: " + salario;
                }
    
}
