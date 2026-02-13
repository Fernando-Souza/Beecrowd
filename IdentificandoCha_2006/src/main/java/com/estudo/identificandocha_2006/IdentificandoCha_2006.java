
package com.estudo.identificandocha_2006;

import java.util.Scanner;
import java.util.Locale;
import java.util.Arrays;
public class IdentificandoCha_2006 {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in).useLocale(Locale.US);
       int t = input.nextInt();
       input.nextLine();
       int contador=0;
       int[] avaliadores= Arrays.stream(input.nextLine().split(" ")).mapToInt(x->Integer.parseInt(x)).toArray();
      for(int i=0;i<5;i++){
          if(avaliadores[i]==t) {
              contador++;
          }
      }
      System.out.println(contador);
    }
}
