/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.OKG.system.ejercicio2.controller;

import java.util.Scanner;
import org.OKG.system.ejercicio2.model.triangulo;

/**
 *
 * @author informatica
 */
public class trianguloController {
    Scanner scanner = new Scanner(System.in);
        public void datosCuadrado(){
       triangulo areatri = new triangulo();
       
       
        System.out.print("Introduce la altrua del traingulo: ");
        double altura = scanner.nextDouble();
        System.out.print("Introduce la base del traingulo: ");
        double base = scanner.nextDouble();
        
 

        double area = areatri.calcularArea();
        System.out.println("El área del círculo es: " + area);    
        }
}
