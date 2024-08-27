/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.OKG.system.ejercicio2.controller;

import java.util.Scanner;
import org.OKG.system.ejercicio2.model.circulo;

/**
 *
 * @author informatica
 */
public class circuloController {
     Scanner scanner = new Scanner(System.in);
        public void datosCirculo(){
       
        System.out.print("Introduce el radio del círculo: ");
        double radio = scanner.nextDouble();
        circulo circulo = new circulo(radio);


        double area = circulo.calcularArea();
        System.out.println("El área del círculo es: " + area);    
        }
}
