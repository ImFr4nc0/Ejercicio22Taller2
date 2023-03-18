/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.taller2;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class App {

    public static void main(String[] args) {
        double v,h;
        String n;
        Scanner ent=new Scanner(System.in);
        System.out.print("Ingrese el nombre: ");
        n=ent.nextLine();
        System.out.print("Ingrese el valor por hora: ");
        v=ent.nextDouble();
        System.out.print("Ingrese el numero de horas: ");
        h=ent.nextDouble();
        System.out.print(n+" ");
        if((h*v)>450000){
           System.out.print(h*v); 
        }
    }
}
