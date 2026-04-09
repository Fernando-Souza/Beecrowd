/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.estudo.matrizquadradaiii;

import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class MatrizQuadradaIII {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringBuilder saida = new StringBuilder();

        while (true) {

            int dim = input.nextInt();
            
             if (dim == 0) {
                break;
            }

            int[][] matriz = new int[dim][dim];

            int auxi = 1;
            int auxj = 1;

            for (int i = 0; i < matriz[0].length; i++) {

                for (int j = 0; j < matriz[0].length; j++) {

                    matriz[i][j] = auxi * auxj;
                    auxj *= 2;

                }
                
                auxi *= 2;
                auxj = 1;
            }

            int nDigito = maiorDigito(matriz);
            
            for (int i = 0; i < matriz[0].length; i++) {

                for (int j = 0; j < matriz[0].length; j++) {
                    if(j<matriz[0].length-1){
                    saida.append(String.format("%" + nDigito + "d", matriz[i][j])).append(" ");
                    }else{
                        
                        saida.append(String.format("%" + nDigito + "d", matriz[i][j]));
                        
                    }
                }
                saida.append("\n");
            }            
        
            System.out.println(saida);
            
            saida.setLength(0);

        }
       

    }

    public static int maiorDigito(int[][] matriz) {

        int maiorDigito = 0;

        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {

                int ndigitos = Integer.toString(matriz[i][j]).length();
                if (ndigitos > maiorDigito) {
                    maiorDigito = ndigitos;
                }

            }
        }

        return maiorDigito;

    }
}
