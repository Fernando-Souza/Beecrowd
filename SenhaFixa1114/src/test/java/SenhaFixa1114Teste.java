
import com.estudo.senhafixa1114.SenhaFixa1114;
import static org.assertj.core.api.Java6Assertions.assertThat;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

/**
 *
 * @author fernando
 */
public class SenhaFixa1114Teste {
    
    @ParameterizedTest
    @ValueSource(ints = {2200,1020,2022,2002})
    public void senhaFixaTest(int senha){
        
        String obtido = SenhaFixa1114.validaSenha(senha) ;
        
        assertThat(obtido).satisfiesAnyOf(x-> assertThat(x).contains("Senha Invalida"),
                x-> assertThat(x).contains("Acesso Permitido"));
                
    }
}
