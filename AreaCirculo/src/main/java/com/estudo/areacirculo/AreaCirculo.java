/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.estudo.areacirculo;

import java.util.Locale;
import java.util.Scanner;


public class AreaCirculo {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        
        Scanner input = new Scanner(System.in);
       
        final double pi = 3.14159;
        
        double raio = input.nextDouble();
        
        double area = pi*Math.pow(raio, 2);
        
        System.out.printf("A=%.4f%n",area);
    }
}
