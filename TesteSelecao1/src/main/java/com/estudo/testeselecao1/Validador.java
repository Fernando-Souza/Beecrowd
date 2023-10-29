/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.estudo.testeselecao1;

import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class Validador {
    
       
    public int[] lerValores(String leitura, String regex) {       

        String[] tokens=leitura.split(regex);
        int[] numbers= new int[tokens.length];
        
        for(int i=0;i<tokens.length;i++){
            
            numbers[i]=Integer.parseInt(tokens[i]);
        }
        
        return numbers;

    }
    
    public String valida(int[] valores){
        
        if(valores[1]> valores[2] & valores[3]>valores[0] &
                (valores[2]+valores[3])>(valores[0]+valores[1])&
                valores[2]>0 & valores[3]>0 & valores[0]%2==0){
            
            return "Valores aceitos";
            
        }
        
        return "Valores não Aceitos";
        
    }
    
}
