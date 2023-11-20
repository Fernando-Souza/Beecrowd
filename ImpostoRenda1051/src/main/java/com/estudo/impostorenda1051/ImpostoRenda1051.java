/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.estudo.impostorenda1051;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class ImpostoRenda1051 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        
        double salario = input.nextDouble();
        
        System.out.println(impostoDevido(salario));
    }

    static String impostoDevido(double salario) {

        final double insento = 2000.00;
        double baseCalculo = salario - insento;
        String resposta;
        double aux = 0.0;

        if (salario <= insento) {

            resposta = "Isento";
            return resposta;

        }
        if ((baseCalculo - (3000.00 - 2000.00)) <= 0) {

            aux += baseCalculo * 0.08;            
            return "R$ " + BigDecimal.valueOf(aux).setScale(2, RoundingMode.HALF_UP).toString();

        }

        if ((baseCalculo - (3000.00 - 2000.00)) > 0) {

            aux += 1000.00 * 0.08;
            baseCalculo = baseCalculo - (3000.00 - 2000.00);

        }
        if ((baseCalculo - (4500.00 - 3000.00)) <= 0) {

            aux += baseCalculo * 0.18;
            return "R$ " + BigDecimal.valueOf(aux).setScale(2, RoundingMode.HALF_UP).toString();

        }

        if ((baseCalculo - (4500.00 - 3000.00)) > 0) {

            aux += (4500.00 - 3000.00) * 0.18;
            baseCalculo = baseCalculo - (4500.00 - 3000.00);

        }
        

        
            aux += baseCalculo * 0.28;

        
        

        return "R$ " + BigDecimal.valueOf(aux).setScale(2, RoundingMode.HALF_UP).toString();
    }

}
