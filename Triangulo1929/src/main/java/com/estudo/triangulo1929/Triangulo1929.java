/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.estudo.triangulo1929;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class Triangulo1929 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int valor1 = input.nextInt();
        int valor2 = input.nextInt();
        int valor3 = input.nextInt();
        int valor4 = input.nextInt();

        if ((valor1 >= 1 && valor1 <= 100) && (valor2 >= 1 && valor2 <= 100) && (valor3 >= 1 && valor3 <= 100)
                && (valor4 >= 1 && valor4 <= 100)) {

            Map<String, List<Integer>> possibilidades = new HashMap<>();
            possibilidades.put("1,2,3", List.of(valor1, valor2, valor3));
            possibilidades.put("1,2,4", List.of(valor1, valor2, valor4));
            possibilidades.put("1,3,4", List.of(valor1, valor3, valor4));
            possibilidades.put("2,3,4", List.of(valor2, valor3, valor4));

            for (String s : possibilidades.keySet()) {

                List<Integer> valores = possibilidades.get(s);

                int somaMenores = valores.stream().sorted().limit(2).reduce(0, (a, b) -> a + b);
                int Maior = valores.stream().max(Integer::compareTo).get();

                if (somaMenores > Maior) {
                    System.out.println("S");
                    return;
                }

            }

            System.out.println("N");
        } else {
            throw new IllegalArgumentException("O valor deve estar entre 1 e 100!");
        }

    }

}
