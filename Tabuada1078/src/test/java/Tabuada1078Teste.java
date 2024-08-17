
import com.estudo.tabuada1078.Tabuada1078;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class Tabuada1078Teste {

    public StringBuilder esperado = new StringBuilder();
    public Integer entrada = 140;    

    @BeforeEach
    public void set() {

        Integer aux = 0;
        Integer resultadoaux;        

        for (int i = 0; i < 10; i++) {

            aux = i + 1;
            resultadoaux = aux * entrada;

            esperado.append(aux.toString()).append(" x ").append(entrada.toString()).append(" = ").append(resultadoaux.toString()).append("\n");
        }

    }

    @Test
    public void tabuadaTeste() {

        String resultado = Tabuada1078.tabuada(entrada);

        assertThat(resultado)
                .isEqualTo(esperado.toString());
    }
}
