/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.estudo.intervalo1037;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class Intervalo1037 {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);

        double valor = input.nextDouble();
        encontraIntervalo(valor);

    }

    public static void encontraIntervalo(double numero) {

        if (numero >= 0 && numero <= 25) {

            System.out.printf("Intervalo [%.0f,%.0f]%n", 0.0, 25.0);

        } else if (numero > 25 && numero <= 50) {

            System.out.printf("Intervalo (%.0f,%.0f]%n", 25.0, 50.0);

        }else if (numero > 50 && numero <= 75) {

            System.out.printf("Intervalo (%.0f,%.0f]%n", 50.0, 75.0);

        } else if (numero > 75 && numero <= 100) {

            System.out.printf("Intervalo (%.0f,%.0f]%n", 75.0, 100.0);

        }else{
            System.out.println("Fora de intervalo");
        }

    }
}
