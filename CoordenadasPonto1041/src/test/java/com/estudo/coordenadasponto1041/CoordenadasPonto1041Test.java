/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.estudo.coordenadasponto1041;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;
import static java.util.stream.StreamSupport.doubleStream;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author fernando
 */
public class CoordenadasPonto1041Test {
    
    
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        CoordenadasPonto1041.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testConverter() {
        
         String[] input = {"20.0","10.1","50.0"};
         double[] esperado={20.0,10.1,50.0};       
        
         double[] result = CoordenadasPonto1041.converter(input);
         
       assertThat(result).containsExactly(esperado);
        
    }

    private static Stream<Arguments> coordenadas(){
       
       return Stream.of(
               Arguments.arguments(new double[]{4.5,-2.2}),
        Arguments.arguments(new double[]{0.1,0.1}),
        Arguments.arguments(new double[]{0.0,0.0})
        );
    }
    
    @ParameterizedTest
    @MethodSource("coordenadas")
    public void testIdentificador(double[] coord) {
      
        assertThat(CoordenadasPonto1041.identificador(coord)).isIn("Q4","Q1","Origem");;
    }
    
}