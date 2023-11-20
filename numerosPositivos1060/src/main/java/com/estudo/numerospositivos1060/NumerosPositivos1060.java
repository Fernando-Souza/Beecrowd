/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.estudo.numerospositivos1060;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class NumerosPositivos1060 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        int aux = 0;
        double[] valores = new double[6];

        do {
            double valor = input.nextBigDecimal().doubleValue();
            valores[aux] = valor;
            aux += 1;

        } while (aux < 6) ;
                
                
        String resposta = contaPositivos(valores);

        System.out.println(resposta);
    }

    public static String contaPositivos(double[] valor) {

        long aux = Arrays.stream(valor).filter(x -> x > 0).count();

        return aux + " valores positivos";
    }
}
