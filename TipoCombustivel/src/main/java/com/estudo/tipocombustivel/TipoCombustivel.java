/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.estudo.tipocombustivel;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class TipoCombustivel {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in).useLocale(Locale.US);       
        
        int alcool=0;
        int gasolina=0;
        int diesel=0;         
        
        int codigo = input.nextInt();
        
        while (true) {
            
            if (codigo == 4) {
                break;
            }

            if (codigo < 1 || codigo > 4) {
                codigo = input.nextInt();
                input.nextLine();
            }
            if (codigo == 1) {
                alcool+=1;
            }

            if (codigo == 2) {
                gasolina+=1;
            }

            if (codigo == 3) {
                diesel+=1;
            }
           
          if(input.hasNextInt()){
            codigo = input.nextInt();
            input.nextLine();
        }

        }

        System.out.println("MUITO OBRIGADO");
        System.out.printf("Alcool: %d%n", alcool);
        System.out.printf("Gasolina: %d%n", gasolina);
        System.out.printf("Diesel: %d%n", diesel);
       

    }    
}
