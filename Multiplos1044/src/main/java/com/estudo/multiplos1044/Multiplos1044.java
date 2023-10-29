/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.estudo.multiplos1044;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import static java.util.stream.Collectors.toList;

/**
 *
 * @author fernando
 */
public class Multiplos1044 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] leitura = input.nextLine().split(" ");
        List<Integer> valores = Arrays.stream(leitura).map(Integer::parseInt).collect(toList());
        
        if(isMultiplo(valores)){
            
            System.out.printf("%s%n", "Sao Multiplos");
            return;
        }
        
        System.out.printf("%s%n", "Nao sao Multiplos");
        
    }
    
    public static boolean isMultiplo(List<Integer> valores){
        
        if(valores.get(0)% valores.get(1)==0 ||valores.get(1)% valores.get(0)==0  ){
            
            return true;
        }
        
        return false;
    }
}
