/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.estudo.inteiroconsecutivos1149;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class InteiroConsecutivos1149 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        int[] valores = Arrays.stream(input.nextLine().split(" ")).mapToInt(x -> Integer.valueOf(x)).toArray();
        List<Integer> validos = new ArrayList<>();
        int saida = 0;

        for (int j = 0; j < valores.length; j++) {

            if (valores[j] > 0) {
                validos.add(valores[j]);
            } 
            
        }

        for (int i = 0; i <= validos.get(1) - 1; i++) {

            saida += validos.get(0) + i;
        }

        System.out.println(saida);

    }
}
