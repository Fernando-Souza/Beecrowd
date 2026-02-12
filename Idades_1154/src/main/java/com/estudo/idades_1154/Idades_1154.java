/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.estudo.idades_1154;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class Idades_1154 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        int idade = input.nextInt();
        List<Integer> idades = new ArrayList<>();

        while (idade >= 0) {
            idades.add(idade);
            idade = input.nextInt();
             }
        
        double media = idades.stream().mapToDouble(x->x).average().getAsDouble();
        System.out.printf("%.2f\n", media);
           
    }
}
