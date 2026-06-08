/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.estudo.tomadas1930;

import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class Tomadas1930 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        if (input.hasNext()) {

            int t1 = input.nextInt();
            int t2 = input.nextInt();
            int t3 = input.nextInt();
            int t4 = input.nextInt();

            if ((t1 >= 2 && t1 <= 6) && (t2 >= 2 && t2 <= 6)
                    && (t3 >= 2 && t3 <= 6) && (t4 >= 2 && t4 <= 6)) {

                int total = (t1 - 1) + (t2 - 1) + (t3 - 1) + t4;
                 System.out.println (total);
            }

        }
        
       

    }

    
}
