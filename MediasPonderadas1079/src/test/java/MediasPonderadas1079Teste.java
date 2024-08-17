/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import com.estudo.mediasponderadas1079.MediasPonderadas1079;
import com.estudo.mediasponderadas1079.MediasPonderadas1079.CalculaMedias;
import java.util.Arrays;
import java.util.stream.Stream;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author fernando
 */
public class MediasPonderadas1079Teste {

    @ParameterizedTest
    @MethodSource("ncasosFactory")  
    public void mediaPonderada(double[]valores,int[]pesos) {
        
        CalculaMedias objeto = new MediasPonderadas1079().new CalculaMedias(valores,pesos);        
        String media =objeto.calculaMediaPonderada();
        assertThat(media).isIn(Arrays.asList("5.7", "6.3", "9.3"));

    }

    
     public static Stream<Arguments> ncasosFactory() {
     
     return Stream.of(arguments(new double[]{6.5, 4.3, 6.2},new int[]{2,3,5}), arguments(
     new double[]{5.1, 4.2, 8.1},new int[]{2,3,5}), arguments(new double[]{8.0, 9.0,
     10.0},new int[]{2,3,5}));
    
     }
    
}
