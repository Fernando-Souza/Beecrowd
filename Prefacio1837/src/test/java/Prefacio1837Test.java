
import com.estudo.prefacio1837.Prefacio1837;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.provider.Arguments;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
/**
 *
 * @author fernando
 */
public class Prefacio1837Test {

    List<Integer> retorno = new ArrayList<>();
    List<Integer> quocientes;

    @BeforeEach
    //@MethodSource("testValues")
    public void maiorMultiploTest() {

        retorno.clear();
        testValues().forEach(arg -> {
            Integer a = (Integer) arg.get()[0];
            Integer b = (Integer) arg.get()[1];
            retorno.add(Prefacio1837.maiorMultiplo_B_MenorQue_A(a, b));

        });

        //retorno.add(Prefacio1837.maiorMultiplo_B_MenorQue_A(a, b));
        quocientes = new ArrayList<>(Arrays.asList(
                3, -3, -2, 2, 1, 2, -2, 0, 1, -1, -1, -1, -1, -1, 1,
                1, -1, 0, 1, 3, -9, 2, -1, -3, 0,
                1, 1, 5, -5, 0, -6, 5, 0, -1, 6,
                -1, 0, -1, 1
        ));

    }

    @Test
    public void test() {

        assertEquals(quocientes,retorno);
    }

    private static Stream<Arguments> testValues() {
        return Stream.of(Arguments.of(-7, -3), Arguments.of(-7, 3),
                Arguments.of(7, -3), Arguments.of(7, 3), Arguments.of(7, 7), Arguments.of(-62, -59),
                Arguments.of(-736, 539), Arguments.of(236, 674), Arguments.of(107, 73),
                Arguments.of(-1, 2), Arguments.of(-57, 78), Arguments.of(-272, 586),
                Arguments.of(-1, 75), Arguments.of(1000, -1000), Arguments.of(-1, -2),
                Arguments.of(-3, -5), Arguments.of(78, -78), Arguments.of(2, 4),
                Arguments.of(-3, -6), Arguments.of(-9, -3), Arguments.of(19, -2),
                Arguments.of(-6, -3), Arguments.of(-230, 674), Arguments.of(-9, 3),
                Arguments.of(0, -1), Arguments.of(-2, -5), Arguments.of(1921, 961),
                Arguments.of(-25, -5), Arguments.of(25, -5), Arguments.of(5, 25),
                Arguments.of(-26, 5), Arguments.of(26, 5), Arguments.of(5, 26),
                Arguments.of(-5, 26), Arguments.of(-26, -5), Arguments.of(-7, 8),
                Arguments.of(7, -9), Arguments.of(-7, 9), Arguments.of(-7, -9));
    }

}
