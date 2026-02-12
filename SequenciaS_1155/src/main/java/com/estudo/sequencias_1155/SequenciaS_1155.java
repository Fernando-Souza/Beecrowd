/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.estudo.sequencias_1155;

import java.util.stream.DoubleStream;

/**
 *
 * @author fernando
 */
public class SequenciaS_1155 {

    public static void main(String[] args) {
        
         Double S = DoubleStream.iterate(1,i->i+1).limit(100).map(x->1/x).sum();
         System.out.printf("%.2f\n",S);
    }
}
