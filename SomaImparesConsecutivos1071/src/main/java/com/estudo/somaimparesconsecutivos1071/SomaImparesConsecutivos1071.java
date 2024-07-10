/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.estudo.somaimparesconsecutivos1071;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class SomaImparesConsecutivos1071 {
    
    static Scanner input =  new Scanner(System.in).useLocale(Locale.US);
    

    public static void main(String[] args) {
        
        int x = input.nextInt();
        int y = input.nextInt();
        
        System.out.println(somaImpares(x,y));
        
    }

    public static int somaImpares(int x, int y) {

        List<Integer> impares = new ArrayList<>();
        int aux = 0;
        if (Math.min(x, y) == x) {
            x += 1;
            while (x < y) {
                if (x % 2 != 0) {
                    impares.add(x);
                }
                x += 1;
            }
        }else{
            
            y += 1;
            
            while (y < x) {
                if (y % 2 != 0) {
                    impares.add(y);
                }
                y += 1;
            }
            
        }
        
        return impares.stream().mapToInt(z->z).sum();
    }
}
