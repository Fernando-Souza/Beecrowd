/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.estudo.preenchervetoriv_1179;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class PreencherVetorIV_1179 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        StringBuilder outputpar = new StringBuilder();
        StringBuilder outputimpar = new StringBuilder();
        StringBuilder output = new StringBuilder();

        int auxpar = 0;
        int auximpar = 0;
        for (int i = 0; i < 15; i++) {
            int valor = input.nextInt();
            if (valor % 2 == 0) {

                outputpar.append("par[").append(auxpar).append("] = ").append(valor).append("\n");
                auxpar += 1;
                if (auxpar == 5) {
                    output.append(outputpar);
                    outputpar.setLength(0);
                    auxpar = 0;
                }

            }

            if (valor % 2 != 0) {

                outputimpar.append("impar[").append(auximpar).append("] = ").append(valor).append("\n");
                auximpar += 1;
                if (auximpar == 5) {
                    output.append(outputimpar);
                    outputimpar.setLength(0);
                    auximpar = 0;
                }

            }
        }
        output.append(outputimpar);
        output.append(outputpar);
        System.out.print(output);
    }

}
