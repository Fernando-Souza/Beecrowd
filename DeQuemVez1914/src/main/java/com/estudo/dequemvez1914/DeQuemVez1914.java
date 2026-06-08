/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.estudo.dequemvez1914;

import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class DeQuemVez1914 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int qt = input.nextInt();
        input.nextLine();
        
        while (qt > 0) {

            String jogador1 = input.next();
            String escolha1 = input.next();
            String jogador2 = input.next();
            String escolha2 = input.next();
            
            
            long n1 = input.nextLong();
            long n2 = input.nextLong();
            long somaEscolhas = n1 + n2;

            if (somaEscolhas % 2 == 0) {
                if (escolha1.equals("PAR")) {

                    System.out.println(jogador1);
                } else {

                    System.out.println(jogador2);
                }
            } else {

                if (escolha1.equals("IMPAR")) {

                    System.out.println(jogador1);
                } else {

                    System.out.println(jogador2);
                }
            }
            qt--;
        }

        input.close();
    }

}
