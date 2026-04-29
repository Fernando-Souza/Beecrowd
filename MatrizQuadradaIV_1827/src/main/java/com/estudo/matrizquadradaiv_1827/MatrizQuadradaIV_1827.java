/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.estudo.matrizquadradaiv_1827;

import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class MatrizQuadradaIV_1827 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       

        while (input.hasNextInt()) {
            
            StringBuilder saida = new StringBuilder();
            int N = input.nextInt();
            int centro = ((N + 1) / 2)-1;
            

            if (N % 2 == 0) {
                break;
            }

            for (int i = 0; i < N; i++) {

                for (int j = 0; j < N; j++) {

                    if (i == centro & j == centro) {
                       saida.append("4");
                        continue;
                    }
                    //controla o 2 na diagonal principal parte de cima
                    if (i == j & i < (int) N / 3 & j < (int) N / 3) {
                        saida.append("2");
                        continue;
                    }
                    //controla o 2 diagonal principal parte de baixo
                    if (i == j & i >= N-(int) N / 3 & j >= N-(int) N / 3) {
                        saida.append("2");
                        continue;
                    }
                    if (i >= (int) N / 3 & i < N - (int) N / 3
                            && j >= (int) N / 3 & j < N - (int) N / 3) {
                        saida.append("1");
                        continue;
                    }
                    if (j == N - 1 - i ) {
                        saida.append("3");

                        continue;

                    } else {
                       saida.append("0");
                    }

                }
                saida.append("\n");

            }
            saida.append("\n");

            System.out.print(saida);
        } 

    }
}
