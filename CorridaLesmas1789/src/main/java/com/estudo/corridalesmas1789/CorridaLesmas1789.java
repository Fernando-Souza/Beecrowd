/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.estudo.corridalesmas1789;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class CorridaLesmas1789 {
//Esta apresentando erro de compilação no beercrowd

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (input.hasNext()) {

            List<Integer> Vi = new ArrayList<>();

            int L = input.nextInt();

            for (int i = 0; i < L; i++) {

                Vi.add(input.nextInt());
            }
            Collections.sort(Vi);
            int maior = Vi.get(Vi.size() - 1);

            if (maior < 10) {
                System.out.println("1");
            } else if (maior >= 10 && maior < 20) {

                System.out.println("2");
            } else {
                System.out.println("3");
            }

        }
        input.close();
    }
}
