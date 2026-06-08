/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.estudo.triangulo1929.Triangulo1929;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 *
 * @author fernando
 */

public class TrianguloTest {

    InputStream originalInput = System.in;
    PrintStream originalOutput = System.out;
    ByteArrayOutputStream novoOutput;

    public TrianguloTest() {
    }

    @BeforeEach
    public void setUp() {

        novoOutput = new ByteArrayOutputStream();
        System.setOut(new PrintStream(novoOutput));

    }

    @AfterEach
    public void tearDown() {
        System.setIn(originalInput);
        System.setOut(originalOutput);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @ParameterizedTest
    @CsvSource(delimiter = ',', value = {
        "6 9 22 15,S\\n",
        "14 40 12 60,N\\n",
        "86 23 39 21,S\\n",
        "1	71	76	11,S\\n",
        "33 14 81 52,S\\n",
        "33 100 25 11,S\\n",
        "1 2 3 4,S\\n",
        "33 55 22 7,N\\n",
        "7 2 62 5,N\\n"
        })
    public void Triangulo(String entrada, String esperado) {
        
         String esperadoReal = esperado.replace("\\n", "\n");

        System.setIn(new ByteArrayInputStream(entrada.getBytes()));
        Triangulo1929.main(new String[]{});       

        assertEquals(esperadoReal, novoOutput.toString());
    }
    
    @ParameterizedTest
    @CsvSource(delimiter = ',', value = {
        "0 9 22 15,IllegalArgumentException",
        "14 101 12 60,IllegalArgumentException",     
        "33 14 81 0,IllegalArgumentException",
        "33 -1 25 11,S",
        "33 55 101 7,IllegalArgumentException"
       
        })
    public void TrianguloError(String entrada, String esperado) {
        
         

        System.setIn(new ByteArrayInputStream(entrada.getBytes()));
        //Triangulo1929.main(new String[]{});       

        assertThrows(IllegalArgumentException.class, () -> {
        Triangulo1929.main(new String[]{});
        });
    }
}
