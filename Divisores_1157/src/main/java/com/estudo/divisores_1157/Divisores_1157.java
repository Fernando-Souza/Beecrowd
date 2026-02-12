/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.estudo.divisores_1157;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class Divisores_1157 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        int entrada = input.nextInt();
        int divisor = 1;
        List<Integer> divisores = new ArrayList<>();

        while (divisor <= entrada) {
            if (entrada % divisor == 0) {
                divisores.add(divisor);
            }

            divisor++;
        }
divisores.stream().forEach(System.out::println);
    }
}
