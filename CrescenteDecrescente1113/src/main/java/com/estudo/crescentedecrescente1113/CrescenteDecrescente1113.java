/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.estudo.crescentedecrescente1113;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class CrescenteDecrescente1113 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        List<Integer[]> entradas =  new ArrayList<>();

        boolean aux = true;

        while (aux) {
            Integer[] valores = new Integer[2];
            String[] dupla = input.nextLine().split(" ");

            for (int i = 0; i < dupla.length; i++) {

                valores[i] = Integer.valueOf(dupla[i]);
            }

            if (valores[0].equals(valores[1])) {

                break;

            }else{
                
                entradas.add(valores);
                
            }
        }
        
        String[] respostas = getOrdem(entradas);
        
        Arrays.stream(respostas).forEach(System.out::println);
    }

    public static String[] getOrdem(List<Integer[]> entrada) {

        String[] resposta = entrada.stream().map(x -> x[0] > x[1] ? "Decrescente" : "Crescente").toArray(String[]::new);

        return resposta;

    }

}
