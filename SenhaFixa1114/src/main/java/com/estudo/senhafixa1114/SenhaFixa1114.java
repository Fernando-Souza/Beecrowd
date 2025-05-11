/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.estudo.senhafixa1114;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class SenhaFixa1114 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        boolean aux = true;
        List<String> resultados = new ArrayList<>();
        
        while(aux){
            
        int entrada = input.nextInt();
        input.nextLine();        
                
        if(entrada==2002){
            resultados.add(validaSenha(entrada));
            resultados.stream().forEach(System.out::println);
            break;
        }
        
        resultados.add(validaSenha(entrada));
        
        }
        
        
    }

    public static String validaSenha(int senha) {
        
        if(senha==2002){
            
            return "Acesso Permitido";
            
        }else{       
        return "Senha Invalida";
        }
    }

    
}
