
import com.estudo.parimpar1074.ParImpar1074;
import static org.assertj.core.api.Java6Assertions.assertThat;
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
public class ParImpar1074Teste {
    
    public static int i=0;
    
    @ParameterizedTest
    @ValueSource(ints={4,-5,0,3,-4})
    public void parImparTest(int x){
        
        String resultado = ParImpar1074.getParImpar(x);
        String[] esperado = new String[]{"EVEN POSITIVE","ODD NEGATIVE","NULL","ODD POSITIVE","EVEN NEGATIVE"};
        
          
        assertThat(resultado).isIn(esperado[i]);
        
        i++;
        
    }
}
