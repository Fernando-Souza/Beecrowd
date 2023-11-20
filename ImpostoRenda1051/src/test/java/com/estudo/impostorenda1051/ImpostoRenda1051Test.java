/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.estudo.impostorenda1051;

import static org.assertj.core.api.Java6Assertions.assertThat;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 *
 * @author fernando
 */
public class ImpostoRenda1051Test {
    
   
    @ParameterizedTest
    @CsvSource({"3002.00","1701.12","4520.00","2050.00","6700.00"})
    public void testMain(double salario) {
        
        String resposta = ImpostoRenda1051.impostoDevido(salario);
        
        assertThat(resposta).isIn("R$ 80.36","Isento","R$ 355.60","R$ 4.00","R$ 966.00");
        
    }
    
}
