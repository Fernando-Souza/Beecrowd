/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import java.util.Arrays;
import java.util.stream.Stream;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author fernando
 */
public class ParesCincoNumeros1065Test {
    
    @ParameterizedTest
    @MethodSource("numeroFactory")
    public void contaNumeroPares(int[] numeros){
        
        Long nPares = Arrays.stream(numeros).filter(x->x%2==0).count();
        
        String resposta = nPares + " valores pares";
        
        assertThat(resposta).isEqualTo("3 valores pares");
        
    }
    
    public static Stream<Arguments> numeroFactory() {
    return Stream.of(
        Arguments.of(new int[]{7,-5,6,-4,12}));
}
}
