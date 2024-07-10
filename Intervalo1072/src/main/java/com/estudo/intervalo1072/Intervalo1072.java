/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.estudo.intervalo1072;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class Intervalo1072 {

    static Scanner input = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args) {

        int N = input.nextInt();
        int[] x = new int[N];
        
        for(int i=0;i<N;i++){
            
            x[i]=input.nextInt();
            
        }
        
        int[] resultado = intervalo(x);
        
        System.out.printf("%d in\n%d out\n",resultado[0],resultado[1]);

    }

    public static int[] intervalo( int[] entrada) {

        int[] intervalo = new int[]{10, 20};
        int[] resultado = new int[2];
        int in = 0;
        int out = 0;

        for (int i = 0; i < entrada.length; i++) {

            if (entrada[i] >= intervalo[0] & entrada[i] <= intervalo[1]) {

                in += 1;
            } else {

                out += 1;

            }
        }

        resultado[0] = in;
        resultado[1] = out;

        return resultado;

    }

}
