/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.estudo.media1040;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class Media1040 {

    private static Scanner input = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        int[] pesos = {2, 3, 4, 1};

        String[] leitura = input.nextLine().split(" ");
        double[] valores = converter(leitura);
        double media = mediaPonderada(valores, pesos).doubleValue();
        System.out.printf("Media: %.1f%n", media);
        String resultado = avaliador(media,true);
        System.out.printf("%s%n", resultado);
        recuperacao(media, resultado);

    }

    public static void recuperacao(double mediaAnterior, String resultado) {

        Locale.setDefault(Locale.US);

        if (resultado.equals("Aluno em exame.")) {

            double notaExame = input.nextDouble();

            System.out.printf("Nota do exame: %.1f%n", notaExame);
            double novaMedia = (mediaAnterior + notaExame) / 2;
            System.out.printf("%s%n", avaliador(novaMedia,false));
            System.out.printf("Media final: %.1f%n", novaMedia);
        }

    }

    public static double[] converter(String[] x) {

        double[] valores = new double[x.length];

        for (int i = 0; i < x.length; i++) {

            valores[i] = Double.parseDouble(x[i]);
        }
        return valores;
    }

    public static BigDecimal mediaPonderada(double[] valores, int[] pesos) {

        double numerador = 0;
        double denominador = 0;

        for (int i = 0; i < valores.length; i++) {

            numerador += valores[i] * pesos[i];
            denominador += pesos[i];
        }

        return new BigDecimal(numerador / denominador).setScale(1, RoundingMode.HALF_DOWN);

    }

    public static String avaliador(double nota, boolean isExame) {

        String resultado = "";

        if (isExame) {

            if (nota >= 7.0) {
                resultado = "Aluno aprovado.";
            } else if (nota >= 5 & nota <= 6.9) {
                resultado = "Aluno em exame.";
            } else if (nota < 5) {
                resultado = "Aluno reprovado.";
            }
        } else{

            if (nota >= 5) {
                resultado = "Aluno aprovado.";
            } else if (nota < 5) {
                resultado = "Aluno reprovado.";
            }

        }

        return resultado;
    }
}
