
import com.estudo.corvocontador1848.CorvoContador1848;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CorvoContadorTest {

    private final InputStream originalIn = System.in;
    private final PrintStream originalOut = System.out;
    private ByteArrayOutputStream testOut;

    @BeforeEach
    void setUp() {
        // Prepara para capturar a saída do console
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
    }

    @AfterEach
    void restore() {
        // Restaura os fluxos originais do sistema
        System.setIn(originalIn);
        System.setOut(originalOut);
    }

    /**
     *
     * @param entrada
     * @param esperado
     */
    @ParameterizedTest
    @CsvSource(delimiter = '|', value = {
        "---\\ncaw caw\\n--*\\ncaw caw\\ncaw caw\\n | 0\\n1\\n0\\n\\n",
        "***\\ncaw caw\\ncaw caw\\ncaw caw\\ncaw caw\\n | 7\\n0\\n0\\n\\n",
        "***\\ncaw caw\\n**-\\n--*\\ncaw caw\\n---\\n*-*\\ncaw caw | 7\\n7\\n5\\n\\n",
        "-*-\\ncaw caw\\n-*-\\n-*-\\ncaw caw\\n*-*\\ncaw caw | 2\\n4\\n5\\n\\n",
        "--*\\n--*\\n--*\\n--*\\n*--\\n*--\\n"+
                "caw caw\\n--*\\n*--\\n--*\\ncaw caw\\n"+
                "*--\\n***\\n*-*\\n*--\\n**-\\n**-\\ncaw caw"+"|"+" 12\\n6\\n32\\n\\n"
    })
    public void testExecucaoCompleta(String entrada, String esperado) {
        
        String entradaReal = entrada.replace("\\n", "\n");
        String esperadoReal = esperado.replace("\\n", "\n");
        
        System.setIn(new ByteArrayInputStream(entradaReal.getBytes()));

        // 2. Capturando a saída do sistema (Output)
        //System.setOut(new PrintStream(testOut));

        // 3. Executa o seu método main exatamente como ele é
        CorvoContador1848.main(new String[]{});

        // 4. Verifica se a saída impressa no StringBuilder está correta
        // Esperado: 3 (1+2), 7 (binario 111), 0 (binario 000)
        //String resultadoEsperado = "3\n7\n0\n\n"; 
        assertEquals(esperadoReal, testOut.toString());
    }
}
