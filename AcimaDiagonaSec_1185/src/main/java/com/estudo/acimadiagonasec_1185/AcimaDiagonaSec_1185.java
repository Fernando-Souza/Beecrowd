/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.estudo.acimadiagonasec_1185;

import java.util.Scanner;


public class AcimaDiagonaSec_1185 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] matriz = new double[12][12];

        char O = input.next().charAt(0);
        double total = 0;
        double media = 0;
        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = input.nextDouble();
            }
        }

        if (O == 'S') {
            for (int i = 0; i < matriz[0].length; i++) {
                for (int j = 0; j < matriz[0].length; j++) {
                    if (j < matriz[0].length-(i+1)) {
                        total += matriz[i][j];
                    }
                }
            }
            System.out.printf("%.1f\n", total);
        }
        if (O == 'M') {
            int n = (matriz[0].length * (matriz[0].length - 1)) / 2;
            for (int i = 0; i < matriz[0].length; i++) {
                for (int j = 0; j < matriz[0].length-(i+1); j++) {
                    
                        total += matriz[i][j];
                        media = total / n;
                    
                }
            }
            System.out.printf("%.1f\n", media);
        }
    }
}
