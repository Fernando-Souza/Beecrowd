/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.estudo.experiencias1094;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toList;

/**
 *
 * @author fernando
 */
public class Experiencias1094 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        List<String> valores = new ArrayList<>();

        int ncasos = input.nextInt();
        input.nextLine();

        for (int i = 0; i < ncasos; ++i) {

            valores.add(input.nextLine());
        }

        Map<String, List<Integer>> grupos = agrupaCobaias(valores);
        Map<String, Integer> totais = getTotais(grupos);

        printResult(totais);
    }

    public static Map<String, List<Integer>> agrupaCobaias(List<String> casos) {

        return casos.stream().map(s -> s.split(" ")).collect(groupingBy(s -> s[1], mapping(s -> Integer.parseInt(s[0]), toList())));

    }

    public static Map<String, Integer> getTotais(Map<String, List<Integer>> dados) {

        int totalCobaias = 0;
        int totalCoelho = 0;
        int totalRatos = 0;
        int totalSapos = 0;

        Map<String, Integer> result = new HashMap<>();

        for (Entry<String, List<Integer>> cobaias : dados.entrySet()) {

            if (cobaias.getKey().equals("C")) {

                totalCoelho = cobaias.getValue().stream().reduce(Integer::sum).get();
            }
            if (cobaias.getKey().equals("R")) {

                totalRatos = cobaias.getValue().stream().reduce(Integer::sum).get();
            }
            if (cobaias.getKey().equals("S")) {

                totalSapos = cobaias.getValue().stream().reduce(Integer::sum).get();
            }

        }

        totalCobaias = totalCoelho + totalRatos + totalSapos;

        result.put("cobaias", totalCobaias);
        result.put("coelhos", totalCoelho);
        result.put("ratos", totalRatos);
        result.put("sapos", totalSapos);

        return result;

    }
    
    public static void printResult(Map<String,Integer>totais){
         
        double coelhospct = totais.get("coelhos") /(double) totais.get("cobaias") * 100;
        double ratospct = totais.get("ratos") / (double) totais.get("cobaias") * 100;
        double sapospct = totais.get("sapos") /(double) totais.get("cobaias") * 100;
        
         System.out.printf("Total: %d cobaias\n"
                + "Total de coelhos: %d\n"
                + "Total de ratos: %d\n"
                + "Total de sapos: %d\n"
                + "Percentual de coelhos: %.2f %%\n"
                + "Percentual de ratos: %.2f %%\n"
                + "Percentual de sapos: %.2f %%\n", totais.get("cobaias"), totais.get("coelhos"), totais.get("ratos"),
                totais.get("sapos"),coelhospct ,ratospct, sapospct);
        
    }

}
