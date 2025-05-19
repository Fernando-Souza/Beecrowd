/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.estudo.validacaonota1117;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class ValidacaoNota1117 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        int contador = 0;
        double[] validos =  new double[2];
        while (contador < 2) {
            double nota = input.nextDouble();

            if (nota < 0 | nota > 10) {

                System.out.println("nota invalida");
                
            }else{
                validos[contador]=nota;
                contador++;
            }

        }
        
        double media = Arrays.stream(validos).map(x->x).average().getAsDouble();
        
        System.out.printf("media = " + "%.2f%n", media);

    }
   
}
