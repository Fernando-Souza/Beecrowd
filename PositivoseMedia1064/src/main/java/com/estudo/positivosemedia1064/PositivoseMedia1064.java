/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.estudo.positivosemedia1064;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class PositivoseMedia1064 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        int aux = 0;
        double[] valores = new double[6];

        while (aux < 6) {

            valores[aux] = input.nextDouble();
            aux++;
        }

        System.out.printf("%s valores positivos\n%s\n", resultado(valores)[0], resultado(valores)[1]);
    }
    
    public static String[] resultado(double[] valores) {

        Long nPositivos = Arrays.stream(valores).filter(x -> x >= 0).count();
        BigDecimal media = new BigDecimal(Arrays.stream(valores).filter(x -> x >= 0).average().getAsDouble())
                .setScale(1, RoundingMode.HALF_UP);

        return new String[]{nPositivos.toString(), media.toString()};

    }
}
