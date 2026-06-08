/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.estudo.respostatheon1858.RespostaTheon1858;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 *
 * @author fernando
 */
public class RespostaTheonTeste {
    
    public RespostaTheonTeste() {
    }
    
        
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
        "3\\n8 0 7|2\\n",
        "2\\n1 1|1\\n",
        "100\\n12 17 3 18 2 1 4 14 0 8 12 "
                + "16 9 4 18 2 16 13 15 16 17 "
                + "6 15 14 0 1 12 5 1 12 1 2 7 "
                + "13 2 5 0 7 6 7 10 1 4 5 3 12 "
                + "0 19 11 14 18 17 17 18 10 4 4 "
                + "12 6 17 16 19 2 13 19 1 6 2 15 "
                + "2 3 3 0 10 17 15 17 10 18 6 7 15 "
                + "10 15 5 2 17 13 14 9 4 15 6 3 19 6 "
                + "2 2 13 15| 9\\n",
        "1\\n0|1\\n"
         
    })
    public void testExecucaoCompleta(String entrada, String esperado) {       
        
        String entradaReal = entrada.replace("\\n", "\n");
        String esperadoReal = esperado.replace("\\n", "\n");
        
        System.setIn(new ByteArrayInputStream(entradaReal.getBytes()));

        // 2. Capturando a saída do sistema (Output)
        //System.setOut(new PrintStream(testOut));

        // 3. Executa o seu método main exatamente como ele é
        RespostaTheon1858.main(new String[]{});

        
        assertEquals(esperadoReal, testOut.toString());
    }
}
