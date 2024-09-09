
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;
import static org.assertj.core.api.Java6Assertions.assertThat;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import org.junit.jupiter.params.provider.MethodSource;


public class MaiorePosicaoTeste {

    @ParameterizedTest
    @MethodSource("randomNumbers")
    public void MaiorPosicao(List<Integer>valores){
        
        Map<Integer,Integer> resultado=new MaiorePosicao1080().getMaiorPosicao(valores);
        
        assertThat(resultado.entrySet()).containsAnyOf(Map.entry(3,345),Map.entry(0,500));
        
        
    }
    
    public static Stream<Arguments> randomNumbers() {
        
       return Stream.of(arguments(Arrays.asList(1,5,15,345,7,9,200,344)),arguments(Arrays.asList(500,21,65,85,115)));

        
    }

}
