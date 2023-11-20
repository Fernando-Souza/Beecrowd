/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.estudo.numerospares1059;

import java.util.stream.IntStream;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;


public class NumerosPares1059Test {

    @Test
    public void numeroParesTest() {

        NumerosPares1059 sut = new NumerosPares1059();

        int[] pares = sut.numeroPares();

        int[] valores = IntStream.rangeClosed(1, 100).filter(inteiros -> inteiros % 2 == 0).toArray();

        assertThat(pares).isEqualTo(valores);
    }

}
