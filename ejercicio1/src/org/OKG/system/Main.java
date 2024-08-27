/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.OKG.system;

import java.util.Scanner;
import org.OKG.system.model.Desarrollador;
import org.OKG.system.model.Empleado;
import org.OKG.system.model.Tester;
import org.OKG.system.view.MenuEmpleados;

/**
 *
 * @author mauco
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MenuEmpleados me = new MenuEmpleados();
        me.menu();

    }
}
