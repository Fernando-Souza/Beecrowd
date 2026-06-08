/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.estudo.respostatheon1858;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 *
 * @author fernando
 */
public class RespostaTheon1858 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();        
        input.nextLine();
        int[]ti = Arrays.asList(input.nextLine().split(" ")).stream().
                mapToInt(x->Integer.valueOf(x)).toArray();
        
        if(N==1){
            System.out.printf("%s\n","1");
            return;
        }
      
     int index = IntStream.range(0,ti.length).reduce((i,j)->ti[i]<=ti[j]?i:j).getAsInt();
       
       System.out.printf("%d\n",index+1);
       
    }
}
