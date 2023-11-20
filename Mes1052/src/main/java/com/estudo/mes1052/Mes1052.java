/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.estudo.mes1052;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class Mes1052 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        
        int valor = input.nextInt();
        
        System.out.println(calculaMes(valor));

    }

    static String calculaMes(int mes) {
        
        Map<Integer, String> calendario = new HashMap<>();
        calendario.put(1, "January");
        calendario.put(2, "February");
        calendario.put(3, "March");
        calendario.put(4, "April");
        calendario.put(5, "May");
        calendario.put(6, "June");
        calendario.put(7, "July");
        calendario.put(8, "August");
        calendario.put(9, "September");
        calendario.put(10, "October");
        calendario.put(11, "November");
        calendario.put(12, "December");
        
        
        return calendario.get(mes);

    }
}
