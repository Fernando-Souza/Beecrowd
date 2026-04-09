/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.estudo.matriz123_1534;

import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class Matriz123_1534 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //String aux = input.nextLine();
        StringBuilder saida = new StringBuilder();

        while (input.hasNextInt()) {

            ////            if (aux.equalsIgnoreCase("EOF")) {
//               break;
//            }

            int N = input.nextInt();

            int[][] matriz = new int[N][N];
            int central = (N - 1) / 2;

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {

                    if (i == j) {

                        if ((N % 2) != 0) {
                            /**
                             * SOMENTRE MATRIZ DE ORDEM IMPAR POSSUI PONTO
                             * CENTRAL NESTE CASO A DIAGONAL SECUNDARIA POSSUI
                             * PRIORIDADE SOBRE A DIAGONAL PRINCIPAL*
                             */
                            if (i == central) {
                                matriz[i][j] = 2;
                            } else {
                                matriz[i][j] = 1;
                            }
                        } else {
                            matriz[i][j] = 1;
                        }

                    } else if (i == N - 1 - j) {
                        matriz[i][j] = 2;
                    } else {
                        matriz[i][j] = 3;
                    }
                }
            }
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    saida.append(matriz[i][j]);

                }

                saida.append("\n");

            }

        }

        System.out.print(saida);

    }
}
