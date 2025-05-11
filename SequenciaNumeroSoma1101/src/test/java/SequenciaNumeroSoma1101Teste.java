/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.estudo.sequencianumerosoma1101.SequenciaNumeroSoma1101;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author fernando
 */
public class SequenciaNumeroSoma1101Teste {
    
     
    
    @ParameterizedTest
    @MethodSource("pares")
    public void somaSequenciaTeste(Integer[] pares){
        
        List<Integer> sequencia = SequenciaNumeroSoma1101.getSequencia(pares);
        
        Integer soma = SequenciaNumeroSoma1101.somaSequencia(sequencia);
        
        assertThat(soma).isIn(Arrays.asList(14,18,null,0));
        
    }
    
    @ParameterizedTest
    @MethodSource("pares")
    public void Sequencia(Integer[] pares){
        
        List<List<Integer>> sequenciasEsperadas = new ArrayList<>();
        
        List<Integer> sequencia = SequenciaNumeroSoma1101.getSequencia(pares); 
        
        sequenciasEsperadas.add(0, List.of(2,3,4,5));
        sequenciasEsperadas.add(1, List.of(3,4,5,6));
        sequenciasEsperadas.add(1, List.of(-1,0,1));
        sequenciasEsperadas.add(2,null);
        
        
        
        assertThat(sequencia).isIn(sequenciasEsperadas);
        
        
    }
    
    public static Stream<Arguments> pares(){
        
        return Stream.of(Arguments.of((Object) new Integer[]{5,2}),Arguments.of((Object) new Integer[]{6,3}),
                Arguments.of((Object) new Integer[]{5,0}),Arguments.of((Object) new Integer[]{-1,1}));
    }
}
