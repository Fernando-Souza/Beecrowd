
import com.estudo.resto2_1075.Resto2_1075;
import java.util.List;
import static org.assertj.core.api.Java6Assertions.assertThat;
import org.junit.jupiter.api.Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */


public class Resto2_1075Teste {
    
    @Test
    public void resto2Teste(){
        
        int entrada = 13;
        
        List<Integer> resposta = Resto2_1075.resto(entrada);
        
        assertThat(resposta.subList(0,4)).containsExactly(2,15,28,41);
    }
    
    
}
