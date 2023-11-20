/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.estudo.testeselecao1;

import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 *
 * @author fernando
 */
public class ValidadorTest {

    Validador validador= new Validador();;

    
    @Test
    public void testLerValores() {
       
        String regex = " ";
        String leitura = "5 6 7 8";
        int[] experado = {5, 6, 7, 8};

        int[] result = validador.lerValores(leitura, regex);

        assertArrayEquals(experado, result);

    }

    
    @Test
    public void testValida() {
        
        String regex = " ";
        String leitura = "5 6 7 8";     

        int[] tokens = validador.lerValores(leitura, regex);
        String result=validador.valida(tokens);
        assertThat(result).isIn("Valores Aceitos","Valores não Aceitos");
    }

    

}
