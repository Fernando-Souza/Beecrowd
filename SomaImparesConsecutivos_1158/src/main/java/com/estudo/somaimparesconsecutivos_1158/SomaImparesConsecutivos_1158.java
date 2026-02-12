/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.estudo.somaimparesconsecutivos_1158;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class SomaImparesConsecutivos_1158 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        int N = input.nextInt();
        input.nextLine();
        int X,Y;
        StringBuilder output = new StringBuilder();
        int contador, aux;       
        List<int[]> casos = new ArrayList<>();
        List<Integer> soma = new ArrayList<>();
        for (int i = 0; i < N; i++) { 
            X= input.nextInt();
            Y= input.nextInt();
            casos.add(new int[]{X,Y});
        }
        for (int[] caso : casos) {
            contador = 0;
            aux = 0;
            while (contador < caso[1]) {

                if (caso[0] % 2 != 0) {
                    aux = aux + caso[0];
                    contador++;
                }
                caso[0]++;
            }
            output.append(aux).append("\n");

        }

        System.out.println(output.toString());
    }
}
