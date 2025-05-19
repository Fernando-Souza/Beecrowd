/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.estudo.sequencialogica1144;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class SequenciaLogica1144 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        int N = input.nextInt();
        input.nextLine();

        if (N > 1 & N < 1000) {

            for (int i = 1; i <= N; i++) {
                
                
                int a = (int) Math.pow(i, 2);
                int b = (int) Math.pow(i, 3);

                System.out.printf("%d %d %d%n",i,a,b);
                System.out.printf("%d %d %d%n",i,a+1,b+1);

                
                
            }
        }
    }
}
