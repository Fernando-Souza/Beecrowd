/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.estudo.tipostriangulo1045;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class TiposTriangulo1045 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        String[] leitura = input.nextLine().split(" ");
        
        List<String> resultado = getTipoTriangulo(converter(leitura));
        
        resultado.stream().forEach(x -> System.out.printf("%S%n", x));
        
     

    }

    public static double[] converter(String[] input) {

        return Arrays.stream(input).mapToDouble(x -> Double.parseDouble(x)).toArray();
    }

    static List<String> getTipoTriangulo(double[] valores) {

        double[] sortedNumbers = Arrays.stream(valores).boxed().
                sorted(Comparator.reverseOrder()).
                mapToDouble(x -> x.doubleValue()).toArray();

        List<String> resposta = new ArrayList<>();

        if (sortedNumbers[0] >= sortedNumbers[1] + sortedNumbers[2]) {

            resposta.add("NAO FORMA TRIANGULO");
            return resposta;

        }

        if (Math.pow(sortedNumbers[0], 2) == Math.pow(sortedNumbers[1], 2) + Math.pow(sortedNumbers[2], 2)) {

            resposta.add("TRIANGULO RETANGULO");
        }

        if (Math.pow(sortedNumbers[0], 2) > Math.pow(sortedNumbers[1], 2) + Math.pow(sortedNumbers[2], 2)) {

            resposta.add("TRIANGULO OBTUSANGULO");
        }

        if (Math.pow(sortedNumbers[0], 2) < Math.pow(sortedNumbers[1], 2) + Math.pow(sortedNumbers[2], 2)) {

            resposta.add("TRIANGULO ACUTANGULO");
        }

        if (Arrays.stream(sortedNumbers).distinct().count() <= 1) {

            resposta.add("TRIANGULO EQUILATERO");

        }
        if (Arrays.stream(sortedNumbers).distinct().count() == 2) {

            resposta.add("TRIANGULO ISOSCELES");

        }
        
        return  resposta;
    
    }
}
