/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.OKG.system.controller;

import org.OKG.system.model.Tester;

/**
 *
 * @author mauco
 */
public class TesterController implements Trabajo{

    @Override
    public void datos() {
       Tester test = new Tester();
       String datos = test.toString();
        System.out.println(datos);
    }

    @Override
    public void trabajar() {
        System.out.println("Soy un Tester");
    }
    
}
