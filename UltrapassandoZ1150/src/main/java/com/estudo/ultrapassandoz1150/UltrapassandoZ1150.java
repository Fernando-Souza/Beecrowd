/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.estudo.ultrapassandoz1150;

import java.util.Locale;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 *
 * @author fernando
 */
public class UltrapassandoZ1150 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        int x = input.nextInt();
        input.nextLine();
        int z = input.nextInt();
        input.nextLine();

        int aux = 0;
        int contador = 0;
        outer:
        while (true) {

            if (z > x) {
                
                              
                for (int i = x; i <= z; i++) {
                    aux = aux + i;
                    contador += 1;

                    if (aux > z) {
                        System.out.println(contador);
                        break outer;
                    }
                }

            } else {
                z = input.nextInt();
            }
        }

    }

}
