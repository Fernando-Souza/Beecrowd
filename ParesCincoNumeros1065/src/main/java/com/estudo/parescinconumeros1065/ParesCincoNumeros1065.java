/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.estudo.parescinconumeros1065;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class ParesCincoNumeros1065 {

    static Scanner input = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args) {
        
        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            
            numeros[i]= input.nextInt();            

        }
        
        Long nPares = Arrays.stream(numeros).filter(x->x%2==0).count();
        
        System.out.printf("%d valores pares",nPares);

    }
}
