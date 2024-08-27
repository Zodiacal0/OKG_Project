/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.OKG.system;
import  java.util.Scanner;
/**
 *
 * @author Okg
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);

        Boolean flag = true; 
        while(flag){
            System.out.println("Elige algun ejercicio");
            System.out.println("Ejercicio 1:");
            System.out.println("Ejercicio 2:");
            System.out.println("Ejercicio 3:");
            System.out.println("Salir: 4");
            int op = in.nextInt();

            switch (op) {
                case 1:
                    //metodo 1
                    break;
            case 2:
                    // metodo 2
                    break;
            case 3:
                    //metodo 3
                break;                    
            case 4:
                flag = false;
                break;
            default:
                System.out.println("Esta opcion no existe");
            break;
            }

        }
        
    }
    
}
