
import com.estudo.fibonaccifacil1151.FibonacciFacil1151;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.assertj.core.api.Java6Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 *
 * @author fernando
 */

public class FibonacciFacil1151Teste {
    
@Test
    public void FibonacciFacil1151Teste() {
        
        List<Integer> valores = Arrays.asList(2,5,10);
        List<List<Integer>> resultado = new ArrayList<>();
        
        for(int n:valores){
           
            resultado.add(FibonacciFacil1151.fibonacci(n));
         
        }
        
        assertThat(resultado).containsExactly(List.of(0,1),List.of(0,1,1,2,3),List.of(0,1,1,2,3,5,8,13,21,34));
    }
    
    
}
