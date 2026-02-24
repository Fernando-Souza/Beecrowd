/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.estudo.abaixodiagonalsec_1186;

import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class AbaixoDiagonalSec_1186 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] matriz = new double[12][12];

        char O = input.next().charAt(0);
        double total = 0;
        double media;
        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = input.nextDouble();
            }
        }
        
        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if ((j + i) > (matriz[i].length - 1)) {
                    total += matriz[i][j];
                }
            }
        }
        if (O == 'S') {
            System.out.printf("%.1f\n", total);
        }
        if (O == 'M') {
            int n = (matriz[0].length * (matriz[0].length - 1)) / 2;

            media = total / n;
            System.out.printf("%.1f\n", media);

        }
    }

}


