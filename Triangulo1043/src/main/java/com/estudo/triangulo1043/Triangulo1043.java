/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.estudo.triangulo1043;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import static java.util.stream.Collectors.toList;

/**
 *
 * @author fernando
 */
public class Triangulo1043 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        String[] leitura = input.nextLine().split(" ");
        double[] numeros = converter(leitura);
        
        printResult(validaTriangulo(numeros),numeros);

    }

    public static void printResult(boolean isTriangulo, double[] lados) {

        double perimetro = 0;
        double area = 0;

        if (isTriangulo) {

            perimetro = Arrays.stream(lados).sum();
            System.out.printf("Perimetro = %.1f%n", perimetro);
            return;
        }

        area = ((lados[0] + lados[1]) * lados[2]) / 2;

        System.out.printf("Area = %.1f%n", area);
    }

    public static boolean validaTriangulo(double[] lados) {

        List<Double> ladosMenores = ladosMenores(lados);

        double ladoMaior = ladoMaior(lados);

        double soma = ladosMenores.stream().mapToDouble(x -> x).sum();

        if (soma > ladoMaior) {

            return true;
        }

        return false;
    }

    public static List<Double> ladosMenores(double[] lados) {

        List<Double> menores = Arrays.stream(lados).boxed().sorted().limit(2).collect(toList());

        return menores;
    }

    public static Double ladoMaior(double[] lados) {

        Double maior = Arrays.stream(lados).max().getAsDouble();

        return maior;
    }

    public static double[] converter(String[] x) {

        double[] valores = new double[x.length];

        for (int i = 0; i < x.length; i++) {

            valores[i] = Double.parseDouble(x[i]);
        }
        return valores;
    }
}
