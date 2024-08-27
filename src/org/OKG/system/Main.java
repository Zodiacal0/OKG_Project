package org.OKG.system;

import java.util.Scanner;

import org.OKG.system.controller.ComputadoraController;
import org.OKG.system.controller.TelefonoController;
import org.OKG.system.controller.TelevisorController;

public class Main {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        boolean flag = true; 
        
        while (flag) {
            System.out.println("Elige alguna opción:");
            System.out.println("Ejercicio 1:");
            System.out.println("Ejercicio 2:");
            System.out.println("Ejercicio 3:");
            System.out.println("Salir: 4");
            
            int op = in.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Ejercicio 1 seleccionado.");
                    break;

                case 2:
                    System.out.println("Ejercicio 2 seleccionado.");
                    break;

                case 3:
                    System.out.println("Elija qué desea ver:");
                    System.out.println("Teléfono: 1");
                    System.out.println("Televisor: 2");
                    System.out.println("Computadora: 3");
                    int op2 = in.nextInt();
                    System.out.println("\n");
                    switch (op2) {
                        case 1:
                            TelefonoController telef = new TelefonoController(4);
                            telef.encender();
                            telef.pass();
                            System.out.println("Detalles del Telefono:");
                            telef.statsTelef();

                            System.out.println("\n");
                            break;
                        case 2:
                            TelevisorController tv = new TelevisorController("14");
                            tv.encender();
                            System.out.println("Detalles del Televisor:");
                            tv.statsTelef();
                            System.out.println("\n");
                            break;
                        default:
                        case 3:
                            ComputadoraController pc = new ComputadoraController("12");
                            pc.pass();
                            System.out.println("Detalles del Televisor:");
                            pc.statsTelef();
                            System.out.println("\n");
                            break;
                    }
                    break;                    

                case 4:
                    flag = false;
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Esta opción no existe.");
                    break;
            }
        }
        
        in.close();
    }
}
