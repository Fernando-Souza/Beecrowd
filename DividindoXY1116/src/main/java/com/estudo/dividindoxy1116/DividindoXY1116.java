/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.estudo.dividindoxy1116;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class DividindoXY1116 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        int n = input.nextInt();
        input.nextLine();
        int[] entrada;        

        for (int i = 0; i < n; i++) {

            entrada = Arrays.stream(input.nextLine().split(" ")).mapToInt(x -> Integer.valueOf(x)).toArray();

            if (entrada[1] == 0) {

                System.out.println("divisao impossivel");

            } else {

                double resultado = ((double) entrada[0]) / entrada[1];

                System.out.printf("%.1f%n", resultado);
            }

        }

    }

}
