/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.estudo.preenchervetorii_1177;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class PreencherVetorII_1177 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        int T = input.nextInt();
        int[] N = new int[1000];
        StringBuilder output = new StringBuilder();
        int j = 0;
        for (int i = 0; i < N.length; i++) {
            output.append("N[").append(i).append("] = ").append(j).append("\n");
            if (j < T-1) {
                j++;
            } else {
                j=0;
                continue;
            }

        }
        System.out.print(output);
    }

}
