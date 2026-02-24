/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.estudo.preenchervetoriii_1178;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class PreencherVetorIII_1178 {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in).useLocale(Locale.US);       
        double[] N = new double[100];
        N[0]=input.nextDouble();
        StringBuilder output = new StringBuilder();
        int j = 0;
        output.append("N[").append(0).append("] = ").append(String.format("%.4f",N[0])).append("\n");
        for (int i = 1; i < N.length; i++) {
            N[i]=N[i-1]/2;
            output.append("N[").append(i).append("] = ").
                    append(String.format("%.4f",N[i])).append("\n");
            

        }
        System.out.print(output);
    }
}
