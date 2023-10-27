/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.estudo.bhaskara1036;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class Bhaskara1036 {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
       
        Scanner input = new Scanner(System.in);
        
        String[] leitura = input.nextLine().split(" ");
        double[] valores = converter(leitura);
        basckara(valores);
        
    }
    
    public static double[] converter(String[]valores){
        
        double[] aux= new double[valores.length];
        
        for(int i=0;i<valores.length;i++){
            
            aux[i]= Double.parseDouble(valores[i]);
            
        }
        
        return aux;
        
    }
    
    public static void basckara(double[]valores) throws ArithmeticException{
        
        if( valores[0]==0){
            
            System.out.println("Impossivel calcular");
            
            return;
            
        }
        
        double delta = Math.pow(valores[1],2)-(4*valores[0]*valores[2]);
        
        if( delta<0){
            
            System.out.println("Impossivel calcular");
            
            return;
            
        }
        
        
        double r1 = (-valores[1]+ Math.sqrt(delta))/(2*valores[0]);
        double r2 = (-valores[1]- Math.sqrt(delta))/(2*valores[0]);
        
         System.out.printf("R1 = %.5f%n",r1);
         System.out.printf("R2 = %.5f%n",r2);
        
    }
    
}
