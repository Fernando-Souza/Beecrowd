/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.estudo.resto2_1075;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class Resto2_1075 {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in).useLocale(Locale.US);
       
       int N = input.nextInt();
       while(N<1 | N>10000){       
           N = input.nextInt();
       }
       
       resto(N).stream().forEach(System.out::println);
    }

    public static List<Integer> resto(int entrada) {
        
        List<Integer>restos = new ArrayList<>();
        
        for(int i=0;i<10000;i++){
            
            if((i%entrada)==2){
                restos.add(i);
            }
        }
        
        return restos;
    }
}
