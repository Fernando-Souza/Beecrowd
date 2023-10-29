/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.estudo.banknoteandcoins_1021;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class BanknoteCoins {   
    

    public static void main(String[] args) {
         Locale.setDefault(new Locale("en", "US"));

        Scanner scanner = new Scanner(System.in);
        Decomposicao solucao = new Decomposicao();

        double numero = scanner.nextDouble();

        solucao.decomposicao(numero);
    }
}
