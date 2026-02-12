/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.estudo.fibonaccifacil1151;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 *
 * @author fernando
 */
public class FibonacciFacil1151 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        int N = input.nextInt();

        if (N > 0 || N < 46) {

            int aux = 0;
            for (int n : fibonacci(N)) {

                if (aux == N - 1) {
                    System.out.printf("%d%n", n);
                } else {
                    System.out.printf("%d ", n);
                }

                aux += 1;

            }

        }

    }

    public static List<Integer> fibonacci(int n) {

        List<Integer> numeros = new ArrayList<>();
        numeros.add(0);
        numeros.add(1);

        IntStream.iterate(2, k -> k + 1).takeWhile(x -> x < n).forEach(i -> {
            numeros.add(i, numeros.get(i - 2) + numeros.get(i - 1));

        });

        return numeros;
    }

}
