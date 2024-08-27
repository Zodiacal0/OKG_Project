package org.OKG.system.ejercicio2.model;
import java.util.Scanner;

public class circulo extends forma {
    double pi = Math.PI;
    double radio;
    
    Scanner leer = new Scanner (System.in);
    @Override
    void calcularArea() {
        System.out.println("Ingresa el valor del radio del circulo: ");
        radio= leer.nextDouble();
        System.out.println("El area es:" + pi*radio);
    }
    
}
