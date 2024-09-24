/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.estudo.somaimparesconsecutivos1099;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import static java.util.stream.Collectors.toList;
import java.util.stream.IntStream;

/**
 *
 * @author fernando
 */
public class SomaImparesConsecutivos1099 {

    public static void main(String[] args) {
       Scanner input =  new Scanner(System.in).useLocale(Locale.US);
       List<String[]> casos = new ArrayList<>();
       List<Integer> nImpares = new ArrayList<>();
       int[] aux = new int[2];
       
       
       int ncasos = input.nextInt();
       input.nextLine();
       
       while(ncasos>0){
           
           String[] caso = input.nextLine().split(" ");           
           
           casos.add(caso);
            
            ncasos--;
       }
       
        List<Integer[]> casosInteger = casos.stream().
                map(x -> Arrays.stream(x).map(Integer::parseInt).toArray(Integer[]::new)).collect(toList());
       
        
        casosInteger.stream().map(x->somaImpares(x)).forEach(System.out::println);
      
       
       
    }
    
    public static Integer somaImpares(Integer[] casos){
        
        int impares;
        
        
        if((casos[0]- casos[1])==0){
            
            impares=0;
            
        }
        
        if(casos[0]<casos[1]){
        impares = IntStream.range(casos[0]+1, casos[1]).filter(x->x%2!=0).reduce(0,Integer::sum);
        }else{
        impares = IntStream.range(casos[1]+1, casos[0]).filter(x->x%2!=0).reduce(0,Integer::sum); 
        }
     
        
        return impares;
    }
    
    
}
