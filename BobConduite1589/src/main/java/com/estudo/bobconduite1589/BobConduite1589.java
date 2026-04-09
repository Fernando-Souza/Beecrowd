/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.estudo.bobconduite1589;

import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class BobConduite1589 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nTeste = input.nextInt();

        for (int i = 0; i < nTeste; i++) {
            
            int R1 = input.nextInt();
            int R2 = input.nextInt();
            
            System.out.println(R1+R2);            
           

        }
    }
}
