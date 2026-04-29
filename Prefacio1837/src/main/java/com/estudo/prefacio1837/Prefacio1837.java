/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.estudo.prefacio1837;

import java.util.Scanner;

public class Prefacio1837 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int q = maiorMultiplo_B_MenorQue_A(a, b);
        int r = a - (b * q);

        System.out.printf("%d %d\n", q, r);
    }

    /**
     * dada a equação a=b*q+r para que r seja positivo é necessário encontrar o
     * valor de q que faz a relação b*q ser maior que "a". A função abaixo
     * encontra este valor
     *
     * @param b
     * @param a
     * @return int
     */
    public static int maiorMultiplo_B_MenorQue_A(Integer dividendo, Integer divisor) {

        int quociente = 0;

        if (dividendo < 0 & divisor > 0) {

            while (true) {

                int maior = divisor * quociente;

                if (maior <= dividendo) {
                    break;
                }
                quociente--;
            }
        }
        if (dividendo > 0 & divisor < 0) {

            while (true) {

                int maior = divisor * quociente;

                if (maior > dividendo) {
                    quociente += 1;
                    break;
                }

                quociente--;

            }
        }

        if (dividendo > 0 & divisor > 0) {
            while (true) {

                int maior = divisor * quociente;

                if (maior > dividendo) {
                    quociente -= 1;
                    break;
                }
                if(maior==dividendo){
                    break;
                }
                quociente++;

            }
        }
         if (dividendo==divisor) {
            while (true) {

                int maior = divisor * quociente;

                if (maior >= dividendo) {
                    
                    break;
                }
                quociente++;

            }
        }

        if (dividendo < 0 & divisor < 0) {
            while (true) {

                int maior = divisor * quociente;

                if (maior <= dividendo) {

                    break;
                }

                quociente++;

            }
        }

        return quociente;

    }

}
