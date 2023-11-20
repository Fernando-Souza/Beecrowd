/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.estudo.ddd1050;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 *
 * @author fernando
 */
public class DDD1050Test {
    
    
    @ParameterizedTest
    @CsvSource({"61","71","11","21"})
    public void testMain(int numero) {
        
        String resposta = DDD1050.codigoDDD(numero);
        
        assertThat(resposta).isIn("Brasilia","Salvador","Sao Paulo","Rio de Janeiro");
        
    }
    
}
