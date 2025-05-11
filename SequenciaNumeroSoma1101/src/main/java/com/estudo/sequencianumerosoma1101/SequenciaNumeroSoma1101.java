/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.estudo.sequencianumerosoma1101;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import static java.util.stream.Collectors.toList;
import java.util.stream.IntStream;

/**
 *
 * @author fernando
 */
public class SequenciaNumeroSoma1101 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        List<Integer> sequencia;
        List<Integer[]> pares = new ArrayList<>();
        Integer soma;
        boolean aux = true;

        while (aux) {

            String[] entrada = input.nextLine().split(" ");
            Integer[] par = new Integer[2];
            
            for (int i = 0; i < par.length; i++) {

                par[i] = Integer.valueOf(entrada[i]);
            }

            if (par[0] <= 0 | par[1] <= 0) {

                break;

            } else {

                pares.add(par);

            }

        }

        for (Integer[] p : pares) {

            sequencia = getSequencia(p);
            soma = somaSequencia(sequencia);

            sequencia.stream().forEach(x -> System.out.printf("%d ", x));
            System.out.println("Sum=" + soma);

        }

    }

    public static List<Integer> getSequencia(Integer[] pares) {

        List<Integer> sequencia = new ArrayList<>();

        if (pares[0] == 0 | pares[1] == 0) {

            return null;
        }

        if (pares[0] > pares[1]) {

            sequencia = IntStream.iterate(pares[1], x -> x + 1).takeWhile(x -> x <= pares[0]).boxed().collect(toList());

        } else {

            sequencia = IntStream.iterate(pares[0], x -> x + 1).takeWhile(x -> x <= pares[1]).boxed().collect(toList());

        }

        return sequencia;
    }

    public static Integer somaSequencia(List<Integer> sequencia) {

        if (sequencia == null) {
            return null;
        }

        return sequencia.stream().reduce(Integer::sum).get();
    }
}
