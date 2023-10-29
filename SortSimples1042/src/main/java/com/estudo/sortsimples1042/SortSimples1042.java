/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.estudo.sortsimples1042;

import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 *
 * @author fernando
 */
public class SortSimples1042 {

    public static void main(String[] args) {
        
       Scanner input = new Scanner(System.in).useLocale(Locale.US);
       
       String[] leitura = input.nextLine().split(" ");
       int[] numeros = converter(leitura);
       
       sortNumbers(numeros);
        
    }
    
    public static int[] converter(String[] x) {

        int[] valores = new int[x.length];

        for (int i = 0; i < x.length; i++) {

            valores[i] = Integer.parseInt(x[i]);
        }
        return valores;
    }
    
    public static void sortNumbers(int[] numbers){
        
        IntStream crescente = Arrays.asList(numbers).stream().flatMapToInt(i -> IntStream.of(i)).sorted();
       IntStream decrescente = Arrays.asList(numbers).stream().
               flatMapToInt(i -> IntStream.of(i)).boxed().
               sorted(Collections.reverseOrder()).mapToInt(x -> x.intValue()); 
       
       crescente.forEach(x-> System.out.printf("%d%n",x));
       System.out.println();
       
       Arrays.stream(numbers).forEach(x-> System.out.printf("%d%n",x));
    }
}

