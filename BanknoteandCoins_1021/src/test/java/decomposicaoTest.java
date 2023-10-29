/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */


import com.estudo.banknoteandcoins_1021.Decomposicao;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
/**
 *
 * @author fernando
 */
public class decomposicaoTest {
    
   
    private Decomposicao decomp;   
   
    @Test
    public void testNumeroNotas() {
       
        decomp= new Decomposicao();
        double entrada = 576.73;        
        double  result = decomp.numeroNotas(entrada);
        assertEquals(1.73, result, 0);
        
    }

    
 @Test
    public void testNumeroMoedas() {
        //DecimalFormat f = new DecimalFormat("##.00");
        decomp= new Decomposicao();
        double entrada = 1.73; 
        List<Double> result = decomp.numeroMoedas(entrada);
        /**
             * Java calcula o modulo de 0.03%0.01 como 0.009999999999999998. 
             * Esse valor é arredondado para 0.01 pelo objeto DecimalFormat
             * Por esse motivo no teste o último valor da lista deve ser 0.01 e não 0.00
             */
        List<Double> padrao = Arrays.asList(0.73,0.23,0.23,0.03,0.03,0.01);
       assertThat(result).hasSameElementsAs(padrao);
        
    }
    
}
