/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.estudo.sequenciacrescente1146;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class SequenciaCrescente1146 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        int x = input.nextInt();
        
        StringBuilder saida = new StringBuilder();
        

        while (true) {

            if (x == 0) {
                break;
            }

            for (int i = 1; i <= x; i++) {
                if (i == x) {
                    
                    saida.append(i).append("\n");                    
                }else{ 
                
                    saida.append(i).append(" ");
                }
                
            }

            System.out.print(saida);
            saida.setLength(0);
            x = input.nextInt();
           

        }
    }
}
