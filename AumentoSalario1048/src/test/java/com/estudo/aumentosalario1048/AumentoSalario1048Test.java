/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.estudo.aumentosalario1048;

import java.math.BigDecimal;
import java.math.RoundingMode;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 *
 * @author fernando
 */
public class AumentoSalario1048Test {
    
    
    @ParameterizedTest
    @CsvSource({"400.0,15","800.01,10","2000.00,7"})    
    public void calcularNovoSalarioTeste(double salario,int reajuste) {
        
        String[] resposta = AumentoSalario1048.novoSalario(salario);
        
        //String[] resposta = new String[]{"Olá Mundo"};       
        assertThat(resposta).isEqualTo(new String[]{"Novo salario: " + BigDecimal.valueOf(salario*(1 + reajuste / 100.0)).setScale(2, RoundingMode.HALF_UP).toString(),
            "Reajuste ganho: " + BigDecimal.valueOf(salario*(reajuste / 100.0)).setScale(2, RoundingMode.HALF_UP).toString(),
            "Em percentual: " + reajuste + " %"});
       
    }
    
}
