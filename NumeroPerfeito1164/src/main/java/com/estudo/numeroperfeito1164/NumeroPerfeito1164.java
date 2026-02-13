package com.estudo.numeroperfeito1164;

import java.util.Locale;
import java.util.Scanner;
public class NumeroPerfeito1164 {

    public static void main(String[] args) {
          Scanner input = new Scanner(System.in).useLocale(Locale.US);
        StringBuilder output = new StringBuilder();
        int ncasos = input.nextInt();
        for(int i=0;i<ncasos;i++){
            int numero = input.nextInt();
            int somaDiv = perfeito(numero);
            
            if(numero==somaDiv){
                output.append(numero).append(" eh perfeito\n");
            }else{
                 output.append(numero).append(" nao eh perfeito\n");
            }
        }
        System.out.print(output.toString());
 
    }
    
     public static int perfeito(int n){
        int aux =0;
        for(int i=1;i<n;i++){
            
            if(n%i==0){
                aux+=i;
            }
            
        }
        return aux;
    }
}
