/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.estudo.seisnumerosimpares1070;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class SeisNumerosImpares1070 {
    
    static Scanner input = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args) {
        
        int numero = input.nextInt();
        
        numerosImpares(numero).stream().forEach(System.out::println);
        
    }

    public static List<Integer> numerosImpares(int numero) {
        
        int aux=0;
        List<Integer> impares = new ArrayList<>();
        
        while(aux<6){
            
            if(numero%2!=0){
                impares.add(numero);
                 aux+=1;
            }
            
           
            numero+=1;
            
        }
        
        return impares;
    }
}
