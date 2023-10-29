/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.estudo.triangulo1043;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import org.junit.jupiter.params.provider.MethodSource;


public class Triangulo1043Test {
    
    
    @ParameterizedTest
    @MethodSource("ladosTriangulo")
    public void testaExistenciaTriangulo(double[] lados){
        
        boolean result = Triangulo1043.validaTriangulo(lados);
        System.out.println(result);
        assertThat(result).isIn(true,false);
    }
    
    static Stream<Arguments> ladosTriangulo(){
        
        return Stream.of(arguments(new double[]{6.0,4.0,2.0}),
                arguments(new double[]{6.0,4.0,2.1}),
                arguments(new double[]{2.1,4.0,6.0}),
                arguments(new double[]{2.0,6.0,2.1}));
        
    }
    
    
    static Stream<Arguments> calculaTriangulo(){
        
        return Stream.of(arguments(true),
                arguments(false),
                arguments(false),
                arguments(true)
                );
        
    }
    
    
    @ParameterizedTest
    @MethodSource("calculaTriangulo")
    public void testCalculoTriangulo(boolean isTriangulo) {
        
        //String result = Triangulo1043.calculaTriangulo(isTriangulo);
        
       // assertThat(result).isIn("Area = 10.0","Perimetro = 12.1");
    }
    
    @Test
    public void testConverter() {
         String[] input = {"20.0","10.1","50.0"};
         double[] esperado={20.0,10.1,50.0};
         
        
         double[] result = Triangulo1043.converter(input);
         
         
         
       assertThat(result).containsExactly(esperado);
        
    }
    
    @ParameterizedTest
    @MethodSource("ladosTriangulo")
    public void ladosMenoresTest(double[]lados){
        
       List<Double> resposta = Triangulo1043.ladosMenores(lados);
         
       assertThat(resposta).containsAnyOf(4.0,2.0,2.1);
        
        
    }
    
    @ParameterizedTest
    @MethodSource("ladosTriangulo")
    public void ladosMaiorTest(double[]lados){
        
       Double resposta = Triangulo1043.ladoMaior(lados);
         
       assertThat(resposta).isEqualTo(6.0);
        
        
    }
    
}
