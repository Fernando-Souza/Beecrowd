package com.estudo.numeroprimo1165;

import java.util.Locale;
import java.util.Scanner;
public class NumeroPrimo1165 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        StringBuilder output = new StringBuilder();
        int ncasos = input.nextInt();
        for(int i=0;i<ncasos;i++){
            int numero = input.nextInt();
            boolean primo = isPrimo(numero);
            
            if(primo){
                output.append(numero).append(" eh primo\n");
            }else{
                 output.append(numero).append(" nao eh primo\n");
            }
        }
        System.out.print(output.toString());
 
    }
    
    public static boolean isPrimo(int n){
        int aux =0;
        for(int i=1;i<=n;i++){
            
            if(n%i==0){
                aux+=i;
            }
            
        }
       if(aux==(n+1)){
           return true;
       }else{
           return false;
       }
    }
}
