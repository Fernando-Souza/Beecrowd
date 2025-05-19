/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.estudo.Grenais1131;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class Grenais1131 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        List<int[]> partidas= new ArrayList<>();
        int repete = 1;
        while (true) {

            if (repete == 1) {

                partidas.add(Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::valueOf).toArray());
                System.out.println("Novo grenal (1-sim 2-nao)");
                repete = input.nextInt();
                input.nextLine();
            }

            if (repete == 2) {
                Map<String, Long> resultados = contaVitoria(partidas);
                System.out.printf("%d grenais%n", partidas.size());
                System.out.printf("Inter:%d%n", resultados.get("Inter"));
                System.out.printf("Gremio:%d%n", resultados.get("Gremio"));
                System.out.printf("Empates:%d%n", resultados.get("empates"));

                if (resultados.get("Inter") > resultados.get("Gremio")) {
                    System.out.println("Inter venceu mais");
                } else if (resultados.get("Inter") < resultados.get("Gremio")) {
                    System.out.println("Gremio venceu mais");
                } else {
                    System.out.println("Não houve vencedor");

                }

                break;
            }

        }

    }

    private static Map<String, Long> contaVitoria(List<int[]> partidas) {

        Map<String, Long> resultado = new HashMap<>();

        Long iVitorias = partidas.stream().filter(x -> x[0] > x[1]).count();
        Long gVitorias = partidas.stream().filter(x -> x[0] < x[1]).count();
        Long empates = partidas.stream().filter(x -> x[0] == x[1]).count();

        resultado.put("Gremio", gVitorias);
        resultado.put("Inter", iVitorias);
        resultado.put("empates", empates);

        return resultado;

    }

}
