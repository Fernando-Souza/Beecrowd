/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.estudo.vaitercopa1564;

import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class VaiTerCopa1564 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNextInt()){
            
            int N = input.nextInt();
            
            if(N==0){
                System.out.println("vai ter copa!");
            }else{
                System.out.println("vai ter duas!");
            }
        }

    }
}
