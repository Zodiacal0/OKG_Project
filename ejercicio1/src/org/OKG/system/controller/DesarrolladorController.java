/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.OKG.system.controller;

import org.OKG.system.model.Desarrollador;

/**
 *
 * @author mauco
 */
public class DesarrolladorController implements Trabajo{

    @Override
    public void datos() {
        Desarrollador dev = new Desarrollador();
        String datos = dev.toString();
        System.out.println(datos);
    }

    @Override
    public void trabajar() {
        System.out.println("Trabajo como Developer");
    }
    
}
