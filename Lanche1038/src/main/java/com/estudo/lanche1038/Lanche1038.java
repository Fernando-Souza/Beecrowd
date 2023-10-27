/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.estudo.lanche1038;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class Lanche1038 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        String[] leitura = input.nextLine().split(" ");
        
        int[] valores = converter(leitura);
        
        System.out.printf("Total: R$ %.2f%n", fatura(valores));
        
    }

    public static int[] converter(String[] leitura) {

        int[] aux = new int[leitura.length];

        for (int i = 0; i < leitura.length; i++) {

            aux[i] = Integer.parseInt(leitura[i]);

        }

        return aux;

    }
    
    public static double fatura(int[]valores){
        
        int[]codigo = {1,2,3,4,5};
        double[]valor={4.00,4.50,5.00,2.00,1.50};
        
        Map<Integer,Double> tabela =  new HashMap<>();
        
        for(int i=0;i<codigo.length;i++){
            
             tabela.put(codigo[i],valor[i]);
        }
       
        double total = tabela.get(valores[0])*valores[1];
        
       return total;
        
        
    }
}
