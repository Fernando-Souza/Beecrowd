package com.estudo.sequenciaij1095;

import java.util.List;

/**
 *
 * @author fernando
 */
public class SequenciaIJ1095 {

    public static void main(String[] args) {
        
        SequenciaIJ sequencia = new SequenciaIJ();
        
        List<Integer[]> pares = sequencia.sequenciaIJ2();
        
        pares.stream().forEach(x->System.out.printf("I=%d J=%d\n",x[0],x[1]));
    }

    
}
