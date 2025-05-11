
import com.estudo.quadrante1115.Quadrante1115;
import java.util.stream.Stream;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.hamcrest.core.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

/**
 *
 * @author fernando
 */
public class Quadrante1115Teste {
    
    @ParameterizedTest
    @MethodSource("quadrantesFactory")
    public void definirQuadrante(int[] pares){
        
        String[] esperado = new String[]{"primeiro","quarto","terceiro","segundo","false"};
        String quadrantes = Quadrante1115.getQuadrante(pares);
        
        assertThat(quadrantes).isIn(esperado);
    }
    
    public static Stream<Arguments> quadrantesFactory(){
        
        return Stream.of(arguments((Object) new int[]{2,2}),arguments((Object) new int[]{3,-2}),arguments((Object) new int[]{-8,-1}),
                arguments((Object) new int[]{-7,1}),arguments((Object) new int[]{0,2}));
    }
}
