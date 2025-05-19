/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.estudo.multiplos131132;

import java.util.Locale;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 *
 * @author fernando
 */
public class Multiplos131132 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        int valor1 = input.nextInt();
        input.nextLine();
        int valor2 = input.nextInt();

        int totalMultiplos = somaMultiplos(valor1, valor2, 13);

        System.out.println(totalMultiplos);
    }

    private static int somaMultiplos(int numero1, int numero2, int multiplode) {

        if (numero1 > numero2) {
            return IntStream.rangeClosed(numero2, numero1).filter(x -> x % multiplode != 0).sum();
        } else {
            return IntStream.rangeClosed(numero1, numero2).filter(x -> x % multiplode != 0).sum();

        }
    }
}
