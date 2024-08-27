/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.OKG.system.ejercicio2.controller;

import java.util.Scanner;
import org.OKG.system.ejercicio2.model.cuadrado;

/**
 *
 * @author informatica
 */
public class cuadradoController {
    Scanner scanner = new Scanner(System.in);
        public void datosCuadrado(){
       
        System.out.println(" ");
        System.out.print("Introduce el lado del cuadrado: ");
        double lado = scanner.nextDouble();
        cuadrado areacua = new cuadrado(lado);
 

        double area = areacua.calcularArea();
        System.out.println(" ");
        System.out.println("El área del círculo es: " + area);    
        System.out.println(" ");
        }
}
