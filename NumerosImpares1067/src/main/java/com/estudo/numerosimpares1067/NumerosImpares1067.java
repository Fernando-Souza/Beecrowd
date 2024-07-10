/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.estudo.numerosimpares1067;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class NumerosImpares1067 {

    static Scanner input =  new Scanner(System.in).useLocale(Locale.US);
    
    public static void main(String[] args) {
      
        int entrada = input.nextInt();
        
        if(entrada < 1 & entrada >1000){
            System.out.println("Digite um valor entre 1  e 1000");
            entrada = input.nextInt();
            
        }
        
         listImpar(entrada).stream().forEach(System.out::println);
    }

    public static List<Integer> listImpar(int valor) {
        
        int aux =1;
        List<Integer> impar = new ArrayList<>();
        while(aux <=valor){
          
            if((aux%2)!=0){
                
                impar.add(aux);
            }
            
            aux+=1;
            
        }
        
        return impar;
    }
}
