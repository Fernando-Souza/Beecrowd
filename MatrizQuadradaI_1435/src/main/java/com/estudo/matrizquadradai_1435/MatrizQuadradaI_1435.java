/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.estudo.matrizquadradai_1435;

import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class MatrizQuadradaI_1435 {
    /**
 O valor de cada célula (i, j) é determinado pela sua menor distância até as quatro bordas da matriz. Para uma matriz de ordem
(com índices começando em 1), a lógica para encontrar o valor em cada posição é: 

    Distância do topo: i
    Distância da base: N-i+1
    Distância da esquerda: j
    Distância da direita: N-j+1

O valor da célula será o mínimo entre esses quatro valores. 
Exemplo Prático (
)
Imagine a posição da linha 2, coluna 3 em uma matriz
:

    Distâncias: topo=2, base=4, esquerda=3, direita=3.
    O menor valor é 2, então esse é o número que será impresso naquela posição.
     **/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        StringBuilder saida = new StringBuilder();

        int x;
        while (true) {
            
            if (N == 0) break;

            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= N; j++) {
                    x = i;
                    if (j < x) {
                        x = j;
                    }
                    if (N - i + 1 < x) {
                        x = N - i + 1;
                    }
                    if (N - j + 1 < x) {
                        x = N - j + 1;
                    }

                    saida.append(String.format("%3d", x));
                    if (j < N) {
                        saida.append(" ");
                    } else {
                       saida.append("\n");
                    }
                }
            }
            saida.append("\n");
            N = input.nextInt();

        }
        System.out.print(saida);
    }
}
