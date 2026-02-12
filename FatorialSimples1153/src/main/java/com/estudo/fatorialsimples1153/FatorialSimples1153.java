/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.estudo.fatorialsimples1153;

import java.util.Locale;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 *
 * @author fernando
 */
public class FatorialSimples1153 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        int N = input.nextInt();
        if(N>0 || N<13){
            System.out.printf("%d\n",fatorial(N));
        }
    }
    
    private static int fatorial(int N){
               
       return IntStream.iterate(N, n ->n-1).takeWhile(p->p>1).reduce(1,(a,b)-> a*b );
      
    }
}
