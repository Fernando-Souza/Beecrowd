/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.estudo.parimpar1074;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class ParImpar1074 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        int N = input.nextInt();
        int[] valores = new int[N];
        
        for(int i=0;i<N;i++){
            
            valores[i]=input.nextInt();
            
        }
        
        for(int z =0;z<valores.length;z++){
            
            System.out.printf("%S\n", getParImpar(valores[z]));
        }
       
    }

    public static String getParImpar(int x) {
        
        String resultado="";
        
        
        if(x%2==0 & x>0){
            resultado = "EVEN POSITIVE";
        }
        
        if(x%2==0 & x<0){
            resultado = "EVEN NEGATIVE";
        }
         if(x%2!=0 & x>0){
            resultado = "ODD POSITIVE";
        }
         if(x%2!=0 & x<0){
            resultado = "ODD NEGATIVE";
        }
         
         if(x==0){
            resultado = "NULL";
        }
        return resultado;
    }
}
