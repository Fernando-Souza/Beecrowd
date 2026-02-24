/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.estudo.fibonaccivetor_1176;

import java.util.Scanner;
import java.util.Locale;

public class FibonacciVetor_1176 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        StringBuilder output = new StringBuilder();
        int t = input.nextInt();

        for (int i = 0; i < t; i++) {
            int caso = input.nextInt();
            long sequencia = fibonacci(caso);
            output.append("Fib(").append(caso).append(") = ").append(sequencia).append("\n");

        }

        System.out.print(output.toString());
    }

    public static long fibonacci(int n) {

        long anterior = 0, atual = 1, proximo;
        for (int i = 0; i < n; i++) {
            proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }
        
        return anterior;
    }
}
