/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.OKG.system.view;

import java.util.Scanner;
import org.OKG.system.controller.DesarrolladorController;
import org.OKG.system.controller.EmpleadoController;
import org.OKG.system.controller.TesterController;

/**
 *
 * @author mauco
 */
public class MenuEmpleados {

    public void menu() {
        EmpleadoController ec = new EmpleadoController();
        DesarrolladorController dc = new DesarrolladorController();
        TesterController tc = new TesterController();
        Scanner in = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Elige alguna opción:");
            System.out.println("1. mostrar un empleado:");
            System.out.println("2. mostrar un Desarrollador");
            System.out.println("3. mostrar un Tester");
            System.out.println("4. Salir");

            int op = in.nextInt();

            switch (op) {
                case 1:
                    System.out.println("El Empleado es: ");
                    ec.datos();
                    ec.trabajar();
                    break;

                case 2:
                    System.out.println("El Desarrollador es: ");
                    dc.datos();
                    dc.trabajar();
                    break;

                case 3:
                    System.out.println("El Tester es: ");
                    tc.datos();
                    tc.trabajar();
                    break;
                default:
                    System.out.println("Esta opción no existe.");
                    break;
            }
        }
        in.close();
    }
}
