/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.estudo.numerospositivos1060;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;


public class NumerosPositivos1060Test {

    @Test
    public void contaPositivosTest() {

        double[] input = new double[]{7, -5, 6, -3.4, 4.6, 12};

        String resposta = NumerosPositivos1060.contaPositivos(input);

        assertThat(resposta).isEqualTo("4 valores positivos");

    }

}
