/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.estudo.bemvindo1847.BemVindo1847;
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
public class BemVindo1847Test {
    
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
    
    @ParameterizedTest
    @CsvSource({
        "10 5 8,  :)",  // Caso 1: Desceu e subiu
        "10 20 10, :(", // Caso 2: Subiu e desceu
        "10 20 25, :(", // Caso 3: Subiu e subiu menos (Triste)
        "10 25 45, :)", // Caso 4: Subiu e subiu igual ou mais (Feliz)
        "40 30 25, :)", // Caso 5: Desceu e desceu menos (Feliz)
        "40 20 0,  :(", // Caso 6: Desceu e desceu igual ou mais (Triste)
        "10 10 15, :)", // Caso 7: Constante e subiu
        "10 10 5,  :("  // Caso 8: Constante e desceu
    })
    void testMainScenarios(String input, String expected) {
        // Simula a entrada do usuário
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        // Executa o método main da sua classe
        BemVindo1847.main(new String[]{});

        // Verifica o resultado (removendo espaços e quebras de linha extras)
        assertEquals(expected, testOut.toString().trim());
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
