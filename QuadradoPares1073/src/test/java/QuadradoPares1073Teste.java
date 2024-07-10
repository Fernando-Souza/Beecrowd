
import com.estudo.quadradopares1073.QuadradoPares1073;
import static org.assertj.core.api.Java6Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class QuadradoPares1073Teste {

    @ParameterizedTest
    @ValueSource(ints={6,2,9})
    public void quadradoParesTeste(int valor) {
        
        String resultado = QuadradoPares1073.quadradoPares(valor);

        assertThat(resultado).isIn("2^2 = 4\n4^2 = 16\n6^2 = 36\n",
                "2^2 = 4\n","2^2 = 4\n4^2 = 16\n6^2 = 36\n8^2 = 64\n");

    }
}
