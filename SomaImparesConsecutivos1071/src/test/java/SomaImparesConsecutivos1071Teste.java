
import com.estudo.somaimparesconsecutivos1071.SomaImparesConsecutivos1071;
import java.util.stream.Stream;
import static org.assertj.core.api.Java6Assertions.assertThat;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import org.junit.jupiter.params.provider.MethodSource;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

/**
 *
 * @author fernando
 */
public class SomaImparesConsecutivos1071Teste {
    
    @ParameterizedTest
    @MethodSource("numerosFactory")
    public void SomaImparesTeste(int x , int y){
        
        int resultado = SomaImparesConsecutivos1071.somaImpares(x,y);
        
        assertThat(resultado).isIn(5,13,0);
    }
    
    public static Stream<Arguments> numerosFactory(){
        
        return Stream.of(arguments(6,-5),arguments(15,12),arguments(12,12));
    }
}
