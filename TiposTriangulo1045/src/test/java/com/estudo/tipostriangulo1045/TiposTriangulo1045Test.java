package com.estudo.tipostriangulo1045;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class TiposTriangulo1045Test {

    @ParameterizedTest
    @MethodSource("valueProvider")
    public void converterTeste(String[] valor) {

        String[] input = new String[]{"7.0", "5.0", "6.0"};
        double[] resposta = TiposTriangulo1045.converter(valor);

        assertThat(resposta).isIn(Arrays.asList(new double[]{7.0, 5.0, 6.0},new double[]{7.01,5,6.10},new double[]{0.1,51.0,6.001}));

    }
    
    @ParameterizedTest
    @MethodSource("doubleValueProvider")
    public void determinaTipoTrianguloTeste(double[]valores){
        
        List<String> tipoTriangulo = TiposTriangulo1045.getTipoTriangulo(valores);
        
        System.out.println(tipoTriangulo.toString());
        System.out.println(valores[0]);
        System.out.println(valores[1]);
        System.out.println(valores[2]);
        
        List<String[]> esperado = Arrays.asList(new String[]{"TRIANGULO ACUTANGULO", "TRIANGULO ISOSCELES"},
                new String[]{"TRIANGULO OBTUSANGULO","TRIANGULO ISOSCELES"},
                new String[]{"TRIANGULO ACUTANGULO","TRIANGULO EQUILATERO"},
                new String[]{"NAO FORMA TRIANGULO"},
                new String[]{"TRIANGULO RETANGULO"}
        );
        
              
       assertThat(tipoTriangulo.toArray()).as("Lados do triangulo:").isIn(esperado);
        
    }

    static Stream<Arguments> valueProvider() {

        return Stream.of(Arguments.arguments((Object) new String[]{"7.0", "5.0", "7.0"}),
                Arguments.arguments((Object) new String[]{"6.0", "6.0", "10.0"}),
        Arguments.arguments( (Object) new String[]{"6.0","6.0","6.0"}),
        Arguments.arguments( (Object) new String[]{"5.0","7.0","2.0"}),
        Arguments.arguments((Object) new String[]{"6.0", "8.0", "10.0"})
        );
    }
    
    static Stream<Arguments> doubleValueProvider() {

        return Stream.of(Arguments.arguments((Object) new double[]{7.0, 5.0, 7.0}),
                Arguments.arguments((Object) new double[]{6.0, 6.0, 10.0}),
        Arguments.arguments( (Object) new double[]{6.0,6.0,6.0}),
        Arguments.arguments( (Object) new double[]{5.0,7.0,2.0}),
        Arguments.arguments((Object) new double[]{6.0, 8.0, 10.0})
        );
    }

}
