/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.estudo.menoreposicao_1180;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class MenorePosicao_1180 {

    public static void main(String[] args) {

        File myObj = new File("/home/fernando/Downloads/teste.txt");

        try (Scanner input = new Scanner(myObj)) {
            int N = input.nextInt();
            input.nextLine();

            int menor = X[0], posicao = 0;
            int[] numeros = new int[N];
            int[] posicoes = new int[N];
            while (input.hasNextLine()) {
                int[] X = Arrays.asList(input.nextLine().split(" ")).stream().mapToInt(x -> Integer.valueOf(x)).toArray();
                
                for (int i = 0; i < 1000; i++) {

                    if (X[i] < menor) {

                        menor = X[i];
                        posicao = i;
                    }
                }

            }
            System.out.printf("Menor valor: %d\nPosicao: %d\n", menor, posicao);
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}
