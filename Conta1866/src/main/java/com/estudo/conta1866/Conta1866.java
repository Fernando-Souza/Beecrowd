/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.estudo.conta1866;

import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class Conta1866 {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       int C = input.nextInt();
       
       
       while(C>0){
           int acumulador = 0;
           int a=1;
           int caso = input.nextInt();
           
           for(int i=0;i<caso;i++){
                
               acumulador+=a;
               a=a*-1;
           }
           System.out.println(acumulador);
           C--;
       }
    }
}
