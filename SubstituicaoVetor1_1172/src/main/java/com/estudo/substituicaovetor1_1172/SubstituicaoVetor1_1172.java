
package com.estudo.substituicaovetor1_1172;

import java.util.Locale;
import java.util.Scanner;
public class SubstituicaoVetor1_1172 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        int[]valores = new int[10];
        for(int i=0;i<10;i++){
            valores[i]= input.nextInt();
        }
         StringBuilder output = new StringBuilder();
         for(int i=0;i<valores.length;i++){
             if(valores[i]<=0){
                 valores[i]=1;
             }
             
             output.append("X[").append(i).append("] = ").append(valores[i]).append("\n");
         }
         
         
             System.out.print(output.toString());
    }
}
