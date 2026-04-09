/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.estudo.matrizquadradaii_1478;

import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class MatrizQuadradaII_1478 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        StringBuilder saida = new StringBuilder();
        

        while (true) {
            int[][] matriz = new int[N][N];

            if (N == 0) {
                break;
            }

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {

                    if (j > i) {

                        matriz[i][j] = j - i + 1;
                    }
                    if (j < i) {

                        matriz[i][j] = i - j + 1;
                    }
                    if (i == j) {

                        matriz[i][j] = 1;
                    }

                }
            }

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {

                    saida.append(String.format("%3d", matriz[i][j]));
                    if (j < N-1) {
                        saida.append(" ");
                    } 
                   
                }
                 saida.append("\n");

            }
            saida.append("\n");

            N = input.nextInt();

        }        
            
        System.out.print(saida);
    }
}
