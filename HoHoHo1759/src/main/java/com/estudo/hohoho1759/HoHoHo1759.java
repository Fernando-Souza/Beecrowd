/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.estudo.hohoho1759;

import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class HoHoHo1759 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int N = input.nextInt();
        
        for(int i=0;i<N;i++){
            if(i<N-1){
            System.out.printf("%s ","Ho");
            }else{
                System.out.printf("%s\n","Ho!"); 
            }
        }
    }
}
