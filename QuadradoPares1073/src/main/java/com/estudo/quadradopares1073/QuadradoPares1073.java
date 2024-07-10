/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.estudo.quadradopares1073;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class QuadradoPares1073 {
    
    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        
        int entrada = input.nextInt();
        
        System.out.printf("%s", quadradoPares(entrada));
    }

    public static String quadradoPares(int valor) {
        
       int[] aux = new int[valor];
       StringBuilder  resultado =  new StringBuilder();
        
        for(int i=1;i<=valor;i++){
            
            if(i%2==0){
                aux[i-1]=i;
                resultado.append(i+"^"+2 +" = "+i*i+"\n");
               
            }
            
        }
        
        return resultado.toString();
    }
}
