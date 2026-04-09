/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.estudo.construindocasas;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class ConstruindoCasas {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        

        while (true) {
            int A = Integer.parseInt(input.next());
            if (A == 0)  return;
            
            int B = Integer.parseInt(input.next());
            if (B == 0 ) return;
            
            int C = Integer.parseInt(input.next());
            if (C == 0)  return;    
            
            double area = (A*B)/(C/100.00);
            BigDecimal lado = new BigDecimal(Math.sqrt(area));
            lado = lado.setScale(0, RoundingMode.DOWN);
            
            System.out.println(lado);

        }

    }
}
