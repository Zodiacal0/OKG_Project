/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.OKG.system.controller;
import org.OKG.system.model.Empleado;

/**
 *
 * @author mauco
 */

public class EmpleadoController implements Trabajo{

    @Override
    public void datos() {
       Empleado ep = new Empleado();
       String datos = ep.toString();
        System.out.println(datos);
    }

    @Override
    public void trabajar() {
        System.out.println("Soy un empleado ");
    }
    
    

}

