/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.estudo.paresimparespositivosnegativos1066;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class ParesImparesPositivosNegativos1066 {

    static Scanner input = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args) {
       
        int[]valores =  new int[5];
        
        for(int i=0; i<5;i++){
             valores[i]= input.nextInt();
        }
        
        System.out.println(separaNumeros(valores));
    }

    public static String separaNumeros(int[] numeros) {

        Long nPares = Arrays.stream(numeros).filter(x -> x % 2 == 0).count();
        Long nImpares = Arrays.stream(numeros).filter(x -> x % 2 != 0).count();
        Long nPositivos = Arrays.stream(numeros).filter(x -> x > 0).count();
        Long nNegativos = Arrays.stream(numeros).filter(x -> x < 0).count();
        
        return nPares + " valor(es) par(es)\n"+nImpares+" valor(es) impar(es)\n"
                + nPositivos + " valor(es) positivo(s)\n"+ nNegativos +" valor(es) negativo(s)";

    }

}
