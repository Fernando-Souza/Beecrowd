package com.estudo.selecaovetor1_1174;

import java.util.Locale;
import java.util.Scanner;
public class SelecaoVetor1_1174 {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in).useLocale(Locale.US);
        StringBuilder output = new StringBuilder();
        double[]valores = new double[100];
        for(int i=0;i<100;i++){
            valores[i]=input.nextDouble();
            if(valores[i]<=10){
                 output.append("A[").append(i).append("] = ").append( String.format("%.1f", valores[i])).append("\n"); 
            }
        }
        
        System.out.print(output.toString());
    }
}
