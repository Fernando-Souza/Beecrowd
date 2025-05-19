/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.estudo.sequencialogica21145;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class SequenciaLogica21145 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        int[] X = Arrays.stream(input.nextLine().split(" ")).mapToInt(x->Integer.valueOf(x)).toArray();
       
        if ((X[0] > 1 && X[0] < 20) && (X[0] < X[1]) && (X[0] < 100000) && (X[1] < 100000)) {

            for (int i = 1; i <= X[1]; i++) {

               

                if (i % X[0] == 0) {

                    System.out.printf("%d%n", i);

                }else{
                     System.out.printf("%d ", i);
                }

            }
        }
    }
}
