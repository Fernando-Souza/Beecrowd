/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.estudo.bemvindo1847;

import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class BemVindo1847 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();

        //temperatura crescendo
        if (B - A > 0 && C - B > 0) {
            
            //figura 3
            if (B - A > C - B) {
                System.out.printf("%s\n", ":(");
            }
            //figura 4
            if (C - B >= B - A) {
                System.out.printf("%s\n", ":)");
            }
        }

        //temperatura decrescendo
        if (B - A < 0 && C - B < 0) {
            
            //figura 5
            if(Math.abs(C-B)<Math.abs(B-A)){
                System.out.printf("%s\n", ":)");
            }
            //figura 6
            if(Math.abs(C-B)>=Math.abs(B-A)){
                System.out.printf("%s\n", ":(");
            }
            
            

        }
        //temperatura esfria e depois esquenta
        //figura 1
        if (B - A < 0 && C - B >= 0) {
            
            System.out.printf("%s\n", ":)");

        }
        //Temperatura esquenta e depois esfria
        //figura 2
        if (B - A > 0 && C - B <= 0) {

            System.out.printf("%s\n", ":(");

        }
        //temperatura inicia constante
        if (B-A==0) {
            //figura 7
            if(C>B){
                System.out.printf("%s\n", ":)");
            }else{
                //figura8
            System.out.printf("%s\n", ":(");
            }
        }
        
        input.close();
        
    }
}
