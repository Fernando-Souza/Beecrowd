/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.estudo.crescentedecrescente1113.CrescenteDecrescente1113;
import java.util.List;
import java.util.stream.Stream;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author fernando
 */
public class CrescenteDecrescente1113Teste {
    
    @ParameterizedTest
    @MethodSource("paresFactory")
    public void getOrdem(List<Integer[]> entrada){
        
        String[] resultados = CrescenteDecrescente1113.getOrdem(entrada);
        
        assertThat(resultados).isEqualTo(new String[]{"Decrescente","Decrescente","Crescente"});
        
    }
    
    public static Stream<Arguments> paresFactory(){
        
        return Stream.of(arguments(List.of(new Integer[]{5,4},new Integer[]{7,2},new Integer[]{3,8})));
    }
}
