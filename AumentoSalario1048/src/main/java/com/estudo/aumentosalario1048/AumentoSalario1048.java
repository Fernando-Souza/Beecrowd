/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.estudo.aumentosalario1048;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class AumentoSalario1048 {

    public static void main(String[] args) {
        
        Scanner input =  new Scanner(System.in).useLocale(Locale.US);
        
        double salario =  input.nextDouble();
        
        String[] novo = novoSalario(salario);
        
        Arrays.stream(novo).forEach(System.out::println);

    }

    static String[] novoSalario(double salario) { 
        
        int reajuste= 0;
        
        if(salario>=0 & salario<=400.0){
            
            reajuste = 15;
            
        }else if(salario>=400.01 & salario<=800.0){
            
            reajuste = 12;
            
        }else if(salario>=800.01 & salario<=1200.0){
            
            reajuste = 10;
            
        }else if(salario>=1200.01 & salario<=2000.0){
            
            reajuste = 7;
            
        }else if(salario>2000.0){
            
            reajuste = 4;
            
        }

        return new String[]{"Novo salario: " + BigDecimal.valueOf(salario*(1 + reajuste / 100.00)).setScale(2,RoundingMode.HALF_UP).toString(),
            "Reajuste ganho: " + BigDecimal.valueOf(salario*(reajuste / 100.0)).setScale(2, RoundingMode.HALF_UP).toString(),
            "Em percentual: " + reajuste + " %"};
    }

}
