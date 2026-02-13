
package com.estudo.preencimentovetori_1173;

import java.util.Locale;
import java.util.Scanner;
public class PreencimentoVetorI_1173 {

    public static void main(String[] args) {
          Scanner input = new Scanner(System.in).useLocale(Locale.US);
        StringBuilder output = new StringBuilder();
        int valor = input.nextInt();
        int[]valores = new int[10];
        for(int i=0;i<10;i++){
            valores[i]=valor;
            output.append("N[").append(i).append("] = ").append(valores[i]).append("\n");
            valor*=2;
        }
             
        System.out.print(output.toString());
    }
}
