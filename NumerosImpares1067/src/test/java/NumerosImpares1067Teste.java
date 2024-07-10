/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import com.estudo.numerosimpares1067.NumerosImpares1067;
import java.util.Arrays;
import java.util.List;
import static org.assertj.core.api.Java6Assertions.assertThat;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 *
 * @author fernando
 */
public class NumerosImpares1067Teste {
    
   @ParameterizedTest
   @ValueSource(ints={8})
   public void numerosImparesTest(int valor){
       
      List<Integer> impares = NumerosImpares1067.listImpar(valor);
      
      assertThat(impares).isEqualTo(Arrays.asList(1,3,5,7));
   }
}
