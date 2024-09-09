
import com.estudo.experiencias1094.Experiencias1094;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;
import static org.assertj.core.api.Java6Assertions.assertThat;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import org.junit.jupiter.params.provider.MethodSource;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

/**
 *
 * @author fernando
 */
public class Experiencia1094Teste {
    
        
    @ParameterizedTest
    @MethodSource("casoTeste")
   public void agrupaCobaias(List<String> casos){
       
       Map<String,List<Integer>> resultado = Experiencias1094.agrupaCobaias(casos);
       
      assertThat(resultado.get("C")).contains(10,5,9,5);
      assertThat(resultado.get("R")).contains(6,14,6,14);
      assertThat(resultado.get("S")).contains(15,8);
      
       
   }
   
   @ParameterizedTest
   @MethodSource("totais")   
   public void getTotaisTest(Map<String,Integer> valores){
       
       List<String> entrada= Arrays.asList(new String[]{"10 C","6 R","15 S","5 C","14 R","9 C","6 R","8 S","5 C","14 R"}); 
        Map<String,List<Integer>> grupos = Experiencias1094.agrupaCobaias(entrada);
       
        Map<String,Integer> totais = Experiencias1094.getTotais(grupos);
       
      assertThat(totais.get("cobaias")).isEqualTo(valores.get("totalCobaias"));
      assertThat(totais.get("coelhos")).isEqualTo(valores.get("totalCoelho"));
      assertThat(totais.get("ratos")).isEqualTo(valores.get("totalRatos"));
      assertThat(totais.get("sapos")).isEqualTo(valores.get("totalSapos"));
       
   }
   
   public static Stream<Arguments> casoTeste(){
       
       return Stream.of(arguments(
               Arrays.asList(new String[]{"10 C","6 R","15 S","5 C","14 R","9 C","6 R","8 S","5 C","14 R"})));
   }
   
   public static Stream<Arguments>totais(){
       
       Map<String,Integer> valores = new HashMap<>();
       valores.put("totalCobaias", 92);
       valores.put("totalCoelho", 29);
       valores.put("totalRatos", 40);
       valores.put("totalSapos", 23);
       
       return Stream.of(arguments(valores));
   }
}
