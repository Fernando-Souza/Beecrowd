
import com.estudo.seisnumerosimpares1070.SeisNumerosImpares1070;
import java.util.Arrays;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

/**
 *
 * @author fernando
 */
public class SeisNumerosImpares1070Teste {
    
    @ParameterizedTest
    @ValueSource(ints={8,5,12})
    public void SeisNumerosImparesTeste(int numero){
        
        List<Integer> impares = SeisNumerosImpares1070.numerosImpares(numero);
        
        assertThat(impares).isIn(Arrays.asList(9,11,13,15,17,19),
                Arrays.asList(5,7,9,11,13,15),Arrays.asList(13,15,17,19,21,23));
    }
}
