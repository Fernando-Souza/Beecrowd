
import com.estudo.paresimparespositivosnegativos1066.ParesImparesPositivosNegativos1066;
import java.util.stream.Stream;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

/**
 *
 * @author fernando
 */
public class ParesImparesPositivosNegativos1066Test {
    
    @ParameterizedTest
    @MethodSource("valoresFactory")
    public void separaNumerosTeste(int[] numeros){
        
        String resultado = ParesImparesPositivosNegativos1066.separaNumeros(numeros);       
        assertThat(resultado).isEqualTo("3 valor(es) par(es)\n2 valor(es) impar(es)\n"
                + "1 valor(es) positivo(s)\n3 valor(es) negativo(s)");      
        
    }
    
        
    public static Stream<Arguments> valoresFactory(){
        
        return Stream.of(Arguments.of(new int[]{-5,0,-3,-4,12}));
    }
}
