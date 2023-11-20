/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.estudo.tempojogo1046;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author fernando
 */
public class TempoJogo1046Test {
    
   
    
    @Test
    public void deveCalcularDuracaoJogo(){
        
        int inicio  = 0;
        int fim = 0;
        String resposta = TempoJogo1046.calculaTempo(inicio,fim);
        
        assertThat(resposta).as("Tempo de jogo.").isEqualTo("O JOGO DUROU 24 HORA(S)");
        
    }   
    
}
