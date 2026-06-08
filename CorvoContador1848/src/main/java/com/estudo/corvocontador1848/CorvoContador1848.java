/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.estudo.corvocontador1848;

import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class CorvoContador1848 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int contaGrito = 0;
        StringBuilder saida = new StringBuilder();
        int soma = 0;
        while (contaGrito < 3) {
            String piscada = input.nextLine();
            StringBuilder numero = new StringBuilder();

            if (!piscada.equals("caw caw")) {

                String[] piscadaChar = piscada.split("");
                for (String s : piscadaChar) {
                    if (s.equals("*")) {
                        numero.append(1);
                    }
                    if (s.equals("-")) {
                        numero.append(0);
                    }
                }
                soma += Integer.parseInt(numero.toString(), 2);

            }

            if (piscada.equals("caw caw")) {
                saida.append(soma).append("\n");
                contaGrito += 1;
                soma = 0;
            }

        }

        System.out.print(saida);
    }

}
