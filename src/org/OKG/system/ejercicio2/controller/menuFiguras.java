package org.OKG.system.ejercicio2.controller;

import java.util.Scanner;

public class menuFiguras {
    private Scanner leer = new Scanner(System.in);
    
    public void mostrarMenu() {
        
        boolean bandera = true;
        while (bandera) {
            System.out.println("Elige alguna área que quieras resolver:");
            System.out.println("Circulo 1:");
            System.out.println("Cuadrado 2:");
            System.out.println("Triangulo 3:");
            System.out.println("Salir: 4");
            int op = leer.nextInt();

            switch (op) {
                case 1:
                    // Llamar al método para calcular el área del círculo
                     circuloController circuloController = new circuloController();
                    circuloController.datosCirculo();
                    break;
                case 2:
                    cuadradoController cuadCont = new cuadradoController();
                    cuadCont.datosCuadrado();
                    break;
                case 3:
                    trianguloController triCont = new trianguloController();
                    triCont.datosTri();
                    break;
                case 4:
                    bandera = false; 
                    break;
                default:
                    System.out.println("Esta opción no existe");
                    break;
            }
        }
    }
}