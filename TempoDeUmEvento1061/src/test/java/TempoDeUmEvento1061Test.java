/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import com.estudo.tempodeumevento1061.TempoDeUmEvento1061;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

/**
 *
 * @author fernando
 */
public class TempoDeUmEvento1061Test {
    
    @Test       
    public void calculaDuracaoTest(){
        
        String[] valores = "Dia 5\n08 : 12 : 23\nDia 9\n06 : 13 : 23".split("\n");
        
        String diaInit = valores[0];
        String horaInit = valores[1];
        String diaFim = valores[2];
        String horaFim = valores[3];        
        
        String resultado = TempoDeUmEvento1061.calculaDuracao(diaInit, horaInit, diaFim, horaFim);
System.out.println(resultado);
        assertThat(resultado).isEqualTo("3 dia(s)\n22 hora(s)\n1 minuto(s)\n0 segundo(s)\n");
        
        
    }
    
    
}
