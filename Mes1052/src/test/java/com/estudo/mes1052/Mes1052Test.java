/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.estudo.mes1052;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 *
 * @author fernando
 */
public class Mes1052Test {
    
    

    @ParameterizedTest
    @CsvSource({"1","2","3","4","5","6","7","8","9","10","11","12"})
    public void testMain(int mes) {
        
        String qualMes=Mes1052.calculaMes(mes);
        assertThat(qualMes).isIn("January","February","March","April","May","June","July",
                "August","September","October","November","December");
        
    }
    
}
