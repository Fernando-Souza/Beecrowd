/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.estudo.banknoteandcoins_1021;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 *
 * @author fernando
 */
public class Decomposicao {
    
    

    public  double numeroNotas(double valor) {

        Locale.setDefault(new Locale("en", "US"));

        final double[] notas = {100.0, 50.0, 20.0, 10.0, 5.0, 2.0};

        System.out.printf("%S%n", "NOTAS:");

        for (int i = 0; i < notas.length; i++) {

            System.out.printf("%d%s%.2f%n", (int) (valor / notas[i]), " nota(s) de R$ ", (double) notas[i]);
            valor = toDouble(valor % notas[i]);

        }

        return valor;

    }

    public List<Double> numeroMoedas(double valor) {

        Locale.setDefault(new Locale("en", "US"));
        List<Double> result = new ArrayList<>();

        double[] moedas = {1, 0.50, 0.25, 0.10, 0.05, 0.01};

        System.out.printf("%S%n", "MOEDAS:");

        for (int i = 0; i < moedas.length; i++) {

            System.out.printf("%d%s%.2f%n", (int) (valor / moedas[i]), " moeda(s) de R$ ", moedas[i]);
            valor = toDouble(valor % moedas[i]);
            /**
             * Java calcula o modulo de 0.03%0.01 como 0.009999999999999998. 
             * Esse valor é arredondado para 0.01 pelo objeto DecimalFormat
             * Por esse motivo no teste o último valor da lista deve ser 0.01 e não 0.00
             */
            result.add(valor);

        }
        
        return result;

    }

    public  void decomposicao(Double valor) {

        numeroMoedas(numeroNotas(valor));
    }

    private static double toDouble(double x) {
        DecimalFormat format = new DecimalFormat("#0.00");
        format.setRoundingMode(RoundingMode.HALF_EVEN);
        return Double.parseDouble(format.format(x));
    }

   

}
