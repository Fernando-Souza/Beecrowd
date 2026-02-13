
package com.estudo.trocavetori_1175;

import java.util.Locale;
import java.util.Scanner;
public class TrocaVetorI_1175 {

    public static void main(String[] args) {
           Scanner input = new Scanner(System.in).useLocale(Locale.US);
        StringBuilder output = new StringBuilder();
        
        int[]valores = new int[20];
        for(int i=0;i<20;i++){
            valores[i]=input.nextInt();
        }
        for (int i = valores.length - 1; i >= 0; i--) {
    output.append("N[").append(Math.abs(i-19)).append("] = ").append(valores[i]).append("\n"); 
}
        
        System.out.print(output.toString());
    }
}
