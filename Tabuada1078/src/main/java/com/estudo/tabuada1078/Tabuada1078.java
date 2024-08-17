/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.estudo.tabuada1078;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class Tabuada1078 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        Integer entrada = input.nextInt();
        
        System.out.printf("%s",tabuada(entrada));
            

    }

    public static String tabuada(Integer entrada) {

        StringBuilder texto = new StringBuilder();        
        Integer aux;
        Integer resultadoaux;

        if (entrada > 2 & entrada < 1000) {

            for (int i = 0; i < 10; i++) {

                aux = i + 1;
                resultadoaux = aux * entrada;

                texto.append(aux.toString()).append(" x ").append(entrada.toString()).append(" = ").append(resultadoaux.toString()).append("\n");
            }

        }
        
        return texto.toString();
    }
}
