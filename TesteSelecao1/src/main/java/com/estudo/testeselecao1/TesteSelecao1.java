/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.estudo.testeselecao1;

import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class TesteSelecao1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Validador validador =  new Validador();
        
        String leitura = input.nextLine();

        int[] tokens=validador.lerValores(leitura," ");
        
        String resultado=validador.valida(tokens);
        
        System.out.println(resultado);
        

        

    }

    
}
