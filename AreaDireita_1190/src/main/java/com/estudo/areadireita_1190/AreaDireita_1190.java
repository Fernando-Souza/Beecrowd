/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.estudo.areadireita_1190;

import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class AreaDireita_1190 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] matriz = new double[12][12];

        char O = input.next().charAt(0);
        double total = 0;
        double media;
        int contador=0;
        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = input.nextDouble();
            }
        }
        
        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
               
                if ((i+j)>(matriz[i].length - 1) & j>i ) {
                    total += matriz[i][j];
                    contador++;
                }
            }
        }
        if (O == 'S') {
            System.out.printf("%.1f\n", total);
        }
        if (O == 'M') {            

            media = total / contador;
            System.out.printf("%.1f\n", media);

        }
    }
}
