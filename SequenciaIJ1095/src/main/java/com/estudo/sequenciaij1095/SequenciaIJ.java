/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.estudo.sequenciaij1095;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author fernando
 */
public class SequenciaIJ {
    
    public List<Pares> sequenciaIJ1() {

        List<Integer> valorJ = IntStream.iterate(60, i -> i - 5).takeWhile(x -> x >= 0).boxed().collect(Collectors.toList());
        List<Integer> valorI = IntStream.iterate(1, i -> i + 3).limit(valorJ.size()).boxed().collect(Collectors.toList());

        List<Pares> pares = IntStream.range(0, valorJ.size()).mapToObj(x -> new Pares(valorI.get(x), valorJ.get(x))).collect(Collectors.toList());

        return pares;
    }

    public List<Integer[]> sequenciaIJ2() {

        Supplier<Stream<Integer>> valorJ = () -> IntStream.iterate(7, i -> i - 1).takeWhile(x -> x >= 5).boxed();

        List<Integer[]> pares = IntStream.iterate(1, i -> i + 1).takeWhile(x -> x < 10).boxed().flatMap(I -> valorJ.get().map(J -> new Integer[]{I, J})).collect(Collectors.toList());

        return pares;
    }

    
    public void sequenciaIJ3() {

        Supplier<List<Integer>> valorJ = () -> IntStream.iterate(7, i -> i + 2).
                takeWhile(x -> x <= 15).flatMap(x->IntStream.range(0, 3).map(i->x-i)).
                boxed().collect(Collectors.toList());
        
        Supplier<List<Integer>> valorI = () -> IntStream.iterate(1, i -> i + 2).
                takeWhile(x -> x < 10).flatMap(x->IntStream.range(1, 4).map(i->x)).boxed().collect(Collectors.toList());       
       
        
     List<Integer[]> pares = IntStream.range(0, valorI.get().size()).boxed().map(index-> new Integer[]{valorI.get().get(index),valorJ.get().get(index)}).
             collect(Collectors.toList());   
        
      pares.stream().forEach(x->System.out.printf("I=%d J=%d\n",x[0],x[1]));
        
    }
    
    public void sequenciaIJ4(){
        
        Supplier<List<Double>> valorI = () -> DoubleStream.iterate(0, i -> i + 0.2).
                takeWhile(x -> x <= 2.0).flatMap(x->IntStream.range(0, 3).mapToDouble(i->x)).
                boxed().collect(Collectors.toList());
        
        Supplier<List<Double>> valorJ = () -> DoubleStream.iterate(0, i -> i + 0.2).
                takeWhile(x->x<4).boxed().flatMap(z->IntStream.range(1, 4).boxed().map(p->z+p)).collect(Collectors.toList());
       
        
     List<Double[]> pares = IntStream.range(0, valorI.get().size()).boxed().map(index-> new Double[]{valorI.get().get(index),valorJ.get().get(index)}).
             collect(Collectors.toList());   
      
     
         
          pares.stream().forEach(x->{
              
              if(x[0]==0.00 |x[0]==1.00|x[0]>1.99){
              System.out.printf("I=%.0f J=%.0f\n",x[0],x[1]);
              }else{
                  System.out.printf("I=%.1f J=%.1f\n",x[0],x[1]);
              }
                      
                      });
   
      //pares.stream().forEach(x->System.out.printf("I=%.1f J=%.1f\n",x[0],x[1]));
      
      
    }

}
