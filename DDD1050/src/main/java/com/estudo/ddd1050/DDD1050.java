/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.estudo.ddd1050;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class DDD1050 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        
        int valor = input.nextInt();
        
        System.out.println(codigoDDD(valor));
    }

    static String codigoDDD(int numero) {

        String cidade;

        switch (numero) {
            case 61:
                cidade = "Brasilia";
                break;
            case 71:
                cidade = "Salvador";
                break;
            case 11:
                cidade = "Sao Paulo";
                break;
                case 21:
                cidade = "Rio de Janeiro";
                break;
                case 32:
                cidade = "Juiz de Fora";
                break;
                case 19:
                cidade = "Campinas";
                break;
                case 27:
                cidade = "Vitoria";
                break;
                case 31:
                cidade = "Belo Horizonte";
                break;
            default:
                cidade = "DDD nao cadastrado";
        }

        return cidade;

    }
}
