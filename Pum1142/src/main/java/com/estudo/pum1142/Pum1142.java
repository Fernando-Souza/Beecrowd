/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.estudo.pum1142;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class Pum1142 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        int N = input.nextInt();
        input.nextLine();        
        List<String> valores = new ArrayList<>();

        for (int i = 1; i <= N * 4; i++) {

            if (i % 4 == 0) {

                valores.add("PUM\n");

            } else {
                valores.add(String.valueOf(i + " "));
            }
            

        }

        valores.stream().forEach(System.out::print);

    }
}
