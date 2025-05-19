/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.estudo.VariasNotaValidacao1118;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class VariasNotaValidacao1118 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        int novoCalculo = 1;

        while (true) {

            if (novoCalculo == 1) {
                double nota;
                double[] validos = new double[2];
                int contador = 0;
                while (contador < 2) {

                    nota = input.nextDouble();

                    if (nota < 0 || nota > 10) {

                        System.out.println("nota invalida");

                    } else {
                        validos[contador] = nota;
                        contador++;
                    }

                }

                double media = Arrays.stream(validos).map(x -> x).average().getAsDouble();
                System.out.printf("media = " + "%.2f%n", media);
                System.out.println("novo calculo (1-sim 2-nao)");
                novoCalculo = input.nextInt();
                input.nextLine();

            } else if (novoCalculo < 1 || novoCalculo > 2) {
                System.out.println("novo calculo (1-sim 2-nao)");
                novoCalculo = input.nextInt();
            } else if (novoCalculo == 2) {
                break;

            }
        }

    }    

}
