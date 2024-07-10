
import com.estudo.intervalo1072.Intervalo1072;
import java.util.stream.Stream;
import static org.assertj.core.api.Assertions.assertThat;
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
public class Intervalo1072Teste {
    
    @ParameterizedTest
    @MethodSource("valorFactory")
    public void intervaloTest(int[]valores){
        
        
        int[]  resultado = Intervalo1072.intervalo(valores);
            
        assertThat(resultado).isIn(new int[]{2,2});
        
    }
    
    static Stream <Arguments> valorFactory(){
        
        return Stream.of(arguments(new int[]{14,123,10,-25}));
        
    }
}
