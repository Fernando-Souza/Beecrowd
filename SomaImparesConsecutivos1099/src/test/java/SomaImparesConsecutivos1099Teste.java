
import com.estudo.somaimparesconsecutivos1099.SomaImparesConsecutivos1099;
import java.util.Arrays;
import java.util.stream.Stream;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import org.junit.jupiter.params.provider.MethodSource;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */


public class SomaImparesConsecutivos1099Teste {
    
    
    
    @ParameterizedTest
    @MethodSource("casoTeste")
    public void somaImparesTest(Integer[] casos){
        
        Integer impares = SomaImparesConsecutivos1099.somaImpares(casos);
        
        assertThat(Arrays.asList(0,11,5,0,0,0,12),hasItems(impares));
        
    }
    
    public static Stream<Arguments> casoTeste(){
        
        return Stream.of(arguments((Object) new Integer[]{4,5}),arguments((Object) new Integer[]{13,10}),arguments((Object) new Integer[]{6,4}),
                arguments((Object) new Integer[]{3,3}),arguments((Object) new Integer[]{3,5}),arguments((Object) new Integer[]{3,4}),
                arguments((Object) new Integer[]{3,8}));
                
    }
    
}
