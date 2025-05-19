/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.estudo.quadradocubo1143;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class QuadradoCubo1143 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        int N = input.nextInt();
        input.nextLine();
        
        if(N>1 & N<1000){
            
            for(int i=1;i<=N;i++){               
                 
                for(int j=1;j<=3;j++){
                    
                   if(j<3){
                    System.out.printf("%d ",(int) Math.pow(i, j));
                   }else{
                       System.out.printf("%d",(int) Math.pow(i, j));
                   }
                    
                }
                System.out.print("\n");
            }
        }
    }
}
