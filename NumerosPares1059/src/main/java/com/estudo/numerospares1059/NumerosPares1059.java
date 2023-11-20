/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.estudo.numerospares1059;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 *
 * @author fernando
 */
public class NumerosPares1059 {

    public static void main(String[] args) {
       
        Arrays.stream(numeroPares()).forEach(System.out::println);
    }

     public static int[] numeroPares() {
        
        return IntStream.rangeClosed(1, 100).filter(inteiros-> inteiros%2==0).toArray();
    }
}
