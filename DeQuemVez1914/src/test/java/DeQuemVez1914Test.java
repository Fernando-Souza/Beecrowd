/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.estudo.dequemvez1914.DeQuemVez1914;
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
public class DeQuemVez1914Test {

    private final InputStream originalIn = System.in;
    private final PrintStream originalOut = System.out;
    private ByteArrayOutputStream testOut;

    public DeQuemVez1914Test() {
    }

    @BeforeEach
    public void setUp() {
        // Prepara para capturar a saída do console
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
    }

    @AfterEach
    public void tearDown() {
        System.setIn(originalIn);
        System.setOut(originalOut);

    }

    @ParameterizedTest
    @CsvSource(delimiter = '|', value = {
        "1\\nQuico PAR Chiquinha IMPAR\\n9 7\\n|Quico\\n",
        "1\\nDami PAR Marcus IMPAR\\n12 3\\n|Marcus\\n",
        "1\\nDayran PAR Conrado IMPAR\\n3 1000000000\\n|Conrado\\n",
        "1\\nPopis PAR Chaves IMPAR\\n2 7\\n|Chaves\\n",
        "1\\nFirst PAR Second IMPAR\\n1585 1510\\n|Second\\n",
        "1\\nFirst PAR Second IMPAR\\n4265 21520\\n|Second\\n",
        "1\\nFirst PAR Second IMPAR\\n45456 26115151\\n|Second\\n",
        "1\\nFirst PAR Second IMPAR\\n141102 502020\\n|First\\n",
        "1\\nFirst PAR Second IMPAR\\n15 25\\n|First\\n",
        "1\\nFirst PAR Second IMPAR\\n11 158\\n|Second\\n",
        "1\\nFirst PAR Second IMPAR\\n58 45\\n|Second\\n",

    })

    public void DeQueVezTest(String entrada, String esperado) {

        String entradaReal = entrada.replace("\\n", "\n");
        String esperadoReal = esperado.replace("\\n", "\n");

        System.setIn(new ByteArrayInputStream(entradaReal.getBytes()));
        DeQuemVez1914.main(new String[]{});       

        assertEquals(esperadoReal, testOut.toString());
    }

}
