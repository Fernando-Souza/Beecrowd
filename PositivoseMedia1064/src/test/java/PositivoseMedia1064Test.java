/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import com.estudo.positivosemedia1064.PositivoseMedia1064;
import java.util.Arrays;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 *
 * @author fernando
 */
public class PositivoseMedia1064Test {
    
    @ParameterizedTest
    @ValueSource(strings = {"7,-5,6,-3.4,4.6,12"})
    public void positivosMediaTest(String valores){
        
        double[] numeros = Arrays.stream(valores.split(",")).mapToDouble(x->Double.parseDouble(x)).toArray();
        
        String[]resultado = PositivoseMedia1064.resultado(numeros);
        
        assertThat(resultado).isEqualTo(new String[]{"4","7.4"});
        
    }
}
