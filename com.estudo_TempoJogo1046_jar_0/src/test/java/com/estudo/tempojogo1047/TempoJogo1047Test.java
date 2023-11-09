/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.estudo.tempojogo1047;

import java.time.LocalTime;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 *
 * @author fernando
 */
public class TempoJogo1047Test {
    
    public TempoJogo1047Test() {
    }
    
    @ParameterizedTest
    @CsvSource({"7,8,9,10",
    "7,7,7,7","7,10,8,9","7,7,7,17"})
    public void deveCalcularDuracaoJogo(int hinicio,int minIni,int hFim,int minFim){
        
        LocalTime inicio  = LocalTime.of(hinicio, minIni);
        LocalTime fim = LocalTime.of(hFim,minFim);
        String resposta = TempoJogo1047.calculaTempo(inicio,fim);
        
        assertThat(resposta).as("Tempo de jogo.").isIn("O JOGO DUROU 2 HORA(S) E 2 MINUTO(S)",
                "O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)","O JOGO DUROU 0 HORA(S) E 59 MINUTO(S)","O JOGO DUROU 0 HORA(S) E 10 MINUTO(S)"
               );
        
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        TempoJogo1047.main(args);
        fail("The test case is a prototype.");
    }
    
}
