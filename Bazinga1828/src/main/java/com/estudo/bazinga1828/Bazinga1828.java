/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.estudo.bazinga1828;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class Bazinga1828 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        input.nextLine();
        Map<String, List<String>> regras = new HashMap<>();
        
        //Lista o que cada escolha vence, assim para a escolha do Sheldon (key)
        //se a escolha do Raj estiver entre os valores a vitória será do Sheldon
        regras.put("tesoura", Arrays.asList("papel", "lagarto"));
        regras.put("pedra", Arrays.asList("tesoura", "lagarto"));
        regras.put("Spock", Arrays.asList("tesoura", "pedra"));
        regras.put("papel", Arrays.asList("Spock", "pedra"));
        regras.put("lagarto", Arrays.asList("papel", "Spock"));

        for (int i = 0; i < T; i++) {

            String[] caso = input.nextLine().split(" ");

            if (regras.get(caso[0]).contains(caso[1])) {
                System.out.printf("Caso #%d: %s!\n", i+1, "Bazinga");
            } else if (caso[0].equals(caso[1])) {

                System.out.printf("Caso #%d: %s!\n", i+1, "De novo");

            } else {
                System.out.printf("Caso #%d: %s!\n", i+1, "Raj trapaceou");
            }

        }

    }
}
