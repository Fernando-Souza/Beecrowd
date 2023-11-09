/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.estudo.animal1049;

import java.io.InputStream;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class Animal1049 {
    
    private static InputStream impressora;
    
    

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        String grupo = input.next();

        String tipo = input.next();

        String habito = input.next();

        encontrarAnimal(grupo, tipo, habito);

    }

    public static void encontrarAnimal(String grupo, String tipo, String habito) {

        if ("vertebrado".equals(grupo)) {

            if ("ave".equals(tipo)) {

                if ("carnivoro".equals(habito)) {

                    System.out.println("aguia");

                } else if ("onivoro".equals(habito)) {

                    System.out.println("pomba");

                }

            }

            if ("mamifero".equals(tipo)) {

                if ("herbivoro".equals(habito)) {

                    System.out.println("vaca");

                } else if ("onivoro".equals(habito)) {

                    System.out.println("homem");

                }

            }

        } else {

            if ("inseto".equals(tipo)) {

                if ("hematofago".equals(habito)) {

                    System.out.println("pulga");

                } else {

                    System.out.println("lagarta");

                }

            } else {

                if ("hematofago".equals(habito)) {

                    System.out.println("sanguessuga");
                } else {

                    System.out.println("minhoca");
                }
            }

        }

    }
}
