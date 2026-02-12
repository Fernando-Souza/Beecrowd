/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.estudo.sequenciasii_1156;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

/**
 *
 * @author fernando
 */
public class SequenciaSII_1156 {

    public static void main(String[] args) {
        
        double[] numerador = DoubleStream.iterate(1,i->i+2).takeWhile(x->x<=39).toArray();
        double[] denominador = DoubleStream.iterate(1,i->i*2).limit(numerador.length).toArray();

        double S = IntStream.range(0, numerador.length).
                mapToDouble(i->numerador[i]/denominador[i]).sum();
        
        System.out.printf("%.2f\n", S);
}
}
