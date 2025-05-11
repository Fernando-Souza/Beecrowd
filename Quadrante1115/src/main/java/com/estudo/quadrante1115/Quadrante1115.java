/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.estudo.quadrante1115;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class Quadrante1115 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        boolean aux = true;
        String[] entrada;
        int[] valores = new int[2];
        String quadrante;
        while (aux) {

            entrada = input.nextLine().split(" ");

            for (int i = 0; i < entrada.length; i++) {

                valores[i] = Integer.parseInt(entrada[i]);

            }

            quadrante = getQuadrante(valores);

            if (quadrante.equals("false")) {
                aux = false;
                return;
            } else {

                System.out.println(quadrante);
            }
        }
    }

    public static String getQuadrante(int[] pares) {

        if (pares[0] > 0 & pares[1] > 0) {
            return "primeiro";
        }
        if (pares[0] > 0 & pares[1] < 0) {
            return "quarto";
        }
        if (pares[0] < 0 & pares[1] < 0) {
            return "terceiro";
        }
        if (pares[0] < 0 & pares[1] > 0) {
            return "segundo";
        } else {

            return "false";
        }
    }
}
