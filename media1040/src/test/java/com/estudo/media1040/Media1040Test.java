/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.estudo.media1040;


import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


public class Media1040Test {
        
    @Test
    public void testConverter() {
         String[] input = {"20.0","10.1","50.0"};
         double[] esperado={20.0,10.1,50.0};
         
         Media1040 sut = new Media1040();
        
         double[] result = sut.converter(input);
         
       assertThat(result).containsExactly(esperado);
        
    }

    
    @Test
    public void testMediaPonderada() {
        System.out.println("mediaPonderada");
        double[] valores ={2.0,4.0,7.5,8.0} ;
        int[] pesos = {2,3,4,1};
        Media1040 instance = new Media1040();
        double expResult = 5.4;
        double result = instance.mediaPonderada(valores, pesos).doubleValue();
        assertEquals(expResult, result, 0);
        
    }
    
    

    @ParameterizedTest
    @ValueSource(doubles = {5.4,6.5,9.1,3.6})
    public void avalidadorTest( double nota){
       
        Media1040 instance = new Media1040();        
        assertThat(instance.avaliador(nota,false)).isIn("Aluno em exame.","Aluno em exame.","Aluno aprovado.","Aluno reprovado.");
               
        
    }
        
}
